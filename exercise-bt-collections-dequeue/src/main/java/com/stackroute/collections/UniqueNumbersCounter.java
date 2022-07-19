package com.stackroute.collections;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class UniqueNumbersCounter {
    //write logic to find maximum unique numbers count from given array in the sub array of certain length
    public String findUniqueNumbersCount(int[] inputArray, int subArrayLength) {
    	if(inputArray == null) {
    		return "Give proper input not null array";
    	}
    	if(inputArray.length == 0) {
    		return "Give proper input not empty array";
    	}
    	if(subArrayLength > inputArray.length) {
    		return "Give proper input, sub array length exceeds array length";
    	}
    	if(subArrayLength <= 0) {
    		return "Give proper input, sub array length can not be negative or zero";
    	}
    	Deque<Integer> deque = new LinkedList<Integer>();
    	for(int i = 0; i < subArrayLength; i++) {
    		deque.add(inputArray[i]); 
    	}
    	Set<Integer> unique = new HashSet<Integer>(deque);
    	int uniqueCount = unique.size();
    	for(int i = subArrayLength; i < inputArray.length; i++) {
    		deque.addLast(inputArray[i]);
    		deque.removeFirst();
    		unique = new HashSet<Integer>(deque);
    		if(uniqueCount < unique.size()) {
    			uniqueCount = unique.size();
    		}
    	}
    	return "Count of Unique Numbers is " + uniqueCount;
    }
}
