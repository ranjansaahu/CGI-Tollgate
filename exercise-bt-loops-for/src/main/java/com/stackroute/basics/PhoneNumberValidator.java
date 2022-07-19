package com.stackroute.basics;

import java.util.Scanner;

public class PhoneNumberValidator {
    //Create Scanner object as instance variable
	Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
		PhoneNumberValidator obj= new PhoneNumberValidator();
		String input= obj.getInput();
		boolean result= obj.validatePhoneNumber(input);
		obj.displayResult(result);
    }

    public String getInput() {
    	String s=sc.nextLine();
    	return s;
    }

    public void displayResult(boolean result) {
    	if(result){
            System.out.println("Valid");
        }
    	else{
            System.out.println("Invalid or empty string");
        }
    }

    public boolean validatePhoneNumber(String s) {
    	try {
    		int count = 0;
            s = s.replaceAll("-", "");
            if (s.isEmpty()) {
                return false;
            }
            for (int i = 0; i < s.length(); i++) {
            	if (Character.isDigit(s.charAt(i))) {
                    ++count;
                }
            }
      
            if (count != 10) {
                return false;
            }
        
            for (int i = 0; i < s.length(); i++) {
                if (!Character.isDigit(s.charAt(i))) {
                    return false;
                }
            }
            return true;
    	}
    	catch(NullPointerException e){
    		return false;
        }
    }
}
