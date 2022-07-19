package com.stackroute.basics;
import java.util.Scanner;
public class StringFinder {
    //Create Scanner object as instance variable
	Scanner sc;

    public static void main(String[] args) {
        //Get three strings from the user
        StringFinder sf = new StringFinder();
        sf.getInput();
   	    sf.closeScanner();
    	 }

    public String getInput() {
    	 sc = new Scanner(System.in);
    	 String searchString = sc.nextLine();
         String firstString = sc.nextLine();
         String secondString = sc.nextLine();
         displayResult(findString(searchString,firstString,secondString));
         return "";
        
    }
    
    public void displayResult(int result) {
        //displays the result
    	if(result == 1) {
    		System.out.println("Found as expected");

    	}
    	else if(result == 0) {
    		System.out.println("Not found");

    	}else {
    		System.out.println("Empty string or null");

    	}
    	
    }

    public int findString(String searchString, String firstString, String secondString) {
    	int l = 0;
    	boolean isnullorempty = false;
    	
    	 if(searchString == null|| firstString == null || secondString == null) {
    		l = -1;
    		isnullorempty = true;
    	}
    	 else if(searchString.isEmpty()|| firstString.isEmpty() || secondString.isEmpty()) {
     		l =  -1;
     		isnullorempty = true;
     	}
    	
    	else {
    		if(searchString.contains(firstString) && searchString.contains(secondString)) {
    			if(searchString.indexOf(firstString) < searchString.lastIndexOf(secondString)) {
    				l = 1;
    			}
    		}
    		else {
    			l = 0;
    		}
    	
    	}
    	if (isnullorempty == true) {
    		return l;
    	}
        return l;
    }

    public void closeScanner() {
    	sc.close();
    }
}