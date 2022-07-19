package com.stackroute.commonjavaclasses;

public class WrapperClassConvert {

    //write logic to determine and convert given primitive type to its wrapper class and return result
    public Object convertToWrapper(Object input) {
        if(input== null) {
        	return "Give proper primitive type as input";
        }
        if(input.getClass()== Integer.class ||
           input.getClass()== Double.class ||
           input.getClass()== Short.class ||
           input.getClass() == Byte.class || 
           input.getClass() == Long.class ||
           input.getClass()== Character.class ||
           input.getClass()== Boolean.class ||
           input.getClass()== Float.class) {
        	return input;
        }
        return "Give proper primitive type as input";
    }
}

