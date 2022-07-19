package com.stackroute.basics;

import java.util.Scanner;

public class NumberAverage {

    public static void main(String[] args) {
        new NumberAverage().getArrayValues();
    }

    //get the values of the array from the user
    public void getArrayValues() {
    	Scanner sc= new Scanner(System.in);
    	
    	int size= sc.nextInt();
    	sc.nextLine();
    	
    	if(size<=0) {
    		System.out.println("Empty array");
    		return;
    	}
    	
    	int [] a= new int[size];
    	for(int i=0; i<size; i++) {
    		a[i]= sc.nextInt();
    	}
    	String result= findAverage(a);
    	System.out.println(result);

    }

    //write here logic to calculate the average an array
    public String findAverage(int[] inputArray) {
    	int sum=0;
    	if(inputArray.length <=0){
            return "Empty array";
        }
    	for(int num : inputArray){
            if(num<0){
                return "Give proper positive integer values";
            }
            sum = sum + num;
        }
        return "The average value is: " + (sum/inputArray.length);
    }
}
