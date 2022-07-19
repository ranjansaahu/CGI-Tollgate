package com.stackroute.strings;

public class LongestSubString {

    //write logic to find the longest substring that appears at both ends of a given string and return result
    public StringBuilder findLongestSubString(StringBuilder input) {
        StringBuilder output = new StringBuilder(); 
        
        if(input.toString().isEmpty())
        {
            output.append("Give proper input");
            return output;
        }
        else if(input.toString().length()==1)
        {  
            return input;
        }
        String out = "";  

        int n = input.length();
    

        int i = n/2;

        if(n%2==0){ 
            n = i;
        }else{  
            n = i + 1;
        }

        while(i>0)
        {
            out = input.substring(0,i);
            if(out.equals(input.substring(n))){
                output.append(out);
                return output;
            }
            i--;
            n++;
        }

        output.append("Longest substring is not present in the given StringBuilder");

        return output;
    }
}