package com.stackroute.basics;

import java.util.Scanner;

public class Calculator {
    private static Scanner scan;

    // define,declare scanner and call getValues with scanner as parameter
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        char choice;
        do{
            new Calculator().getValues(scan);
            System.out.println("Do you want to try again(y/n)");
            choice = scan.next().charAt(0);

        }while(choice!='n');
    }

    //Get values and which operator from the menu
    public void getValues(Scanner scan) {
    	System.out.println("Enter the first number:");
        int firstValue = scan.nextInt();
        System.out.println("Enter the second number:");
        int secondValue = scan.nextInt();
        System.out.println("Enter number beside the operation to perform: \n" +
                " 1. Add \n" +
                " 2. Subtract\n" +
                " 3. Multiply\n" +
                " 4. Divide");
        int operator = scan.nextInt();
        calculate(firstValue, secondValue, operator);
        System.out.println(calculate(firstValue, secondValue, operator));

    }

    //perform operation based on the chosen switch case corresponding to the menu and return string
    public String calculate(int firstValue, int secondValue, int operator) {
    	 String output;

         switch (operator) {
             case 1: {
                 output = firstValue + " + " + secondValue + " = " + (firstValue + secondValue);
                 break;
             }
             case 2: {
                 output = firstValue + " - " + secondValue + " = " + (firstValue - secondValue);
                 break;
             }
             case 3: {
                 output = firstValue + " * " + secondValue + " = " + (firstValue * secondValue);
                 break;
             }
             case 4: {
                 if (secondValue == 0) {
                     output = "The divider (secondValue) cannot be zero";
                     break;
                 }
                 output = firstValue + " / " + secondValue + " = " + (firstValue / secondValue);
                 break;
             }
             default: {
                 output = "Entered wrong option " + operator;
                 break;
             }
         }
         return output;
    }
}
