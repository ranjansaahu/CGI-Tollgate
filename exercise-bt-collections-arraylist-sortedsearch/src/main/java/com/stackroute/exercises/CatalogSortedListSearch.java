package com.stackroute.exercises;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatalogSortedListSearch {
	List<String> list= new ArrayList<>();

    //write here logic to get sorted Array List which is a global class variable
    public String catalogListSorter(List<String> unSortedCatalogList) {
    	if(unSortedCatalogList==null){
    		return "The catalog list is null";
    	}else if(unSortedCatalogList.isEmpty()) {
    		return "The catalog List is empty";
    	}
    	for (String str : unSortedCatalogList){
            if(str == null || str.isBlank() || str.isEmpty()){
                return "The catalog List contains empty or null or blank space as a value";
            }
    	}
        Collections.sort(unSortedCatalogList);
        list = unSortedCatalogList;
        return list.toString();
    }

    //write here logic to search the input value in sorted Array List
    public String catalogListSearcher(String value) {
        if(value == null || value.isEmpty() || value.isBlank()){
            return "Input is not accepted";
        }
        for(String str : list){
            if(str.toLowerCase().equals(value.toLowerCase())){
                return "Found: " + str;
            }
        }
        return "Not Found";
    }
}

