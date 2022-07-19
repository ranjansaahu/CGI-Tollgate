package com.stackroute.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class RemoveDuplicateLines {
    //write logic to read data from input.txt and  write result to output.txt
    public void removeDuplicateLines() throws IOException {
    	 PrintWriter pw = new PrintWriter("output.txt");
    	 
    	 BufferedReader br1 = new BufferedReader(new FileReader("input.txt"));
         String line1 = br1.readLine();
         
         while(line1 != null) {
             boolean flag = false;
             
             BufferedReader br2 = new BufferedReader(new FileReader("output.txt"));
             String line2 = br2.readLine();
             
             while(line2 != null) {
                 if(line1.equals(line2)){
                     flag = true;
                     break;
                 }
                 line2 = br2.readLine();
             }
             if(!flag){
                 pw.println(line1);
                 pw.flush();
             }
             line1 = br1.readLine();
         }
         br1.close();
         pw.close();
    }
}
