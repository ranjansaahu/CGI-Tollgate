package com.stackroute.basics;

import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
    	System.out.println("Enter length and breadth of the rectangle:");
        new RectanglePerimeter().getValues();  
    }
    //get user input from console
    public void getValues() {
    	Scanner s= new Scanner(System.in);
        double length= s.nextDouble();
        double breadth= s.nextDouble();
        double  perimeter= perimeterCalculator(length, breadth);
        System.out.println(perimeter);
        s.close();
    }

    //write logic to find perimeter of rectangle here
    public double perimeterCalculator(double length, double breadth) {
    	double  p= 2*(length+ breadth);
    	return p;
    }
}
