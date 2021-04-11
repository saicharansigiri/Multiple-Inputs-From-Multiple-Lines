package java_projects;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.*;

public class Practice{
    public static void main(String[] args)throws IOException  {
        
        // For number of input lines 
        Scanner sc = new Scanner(System.in);
        int numofSamples;
        numofSamples = sc.nextInt();
        //buffer Reader
        BufferedReader in = new BufferedReader( new InputStreamReader( System.in)); 
        
        String[] inputs = new String[numofSamples*4];

        // creating a matrix for storing inputs for multiple lines rows indicate lines and columns contains the Multiple values From a single line 
         double[][] ininputs = new double[numofSamples][4];
         
         // running for loop for number of input lines times and for each input line contains multiple values which are separated by spaces 
         for(int i=0;i<numofSamples;i++)
         {
            inputs = in.readLine().split(" ");
            
            System.out.println(" ");
            for(int j=0;j<4;j++)
            {

                ininputs[i][j] = Double.parseDouble(inputs[j]); 
            
            }
         }

        // Printing the inputs 

        for (int i=0;i<numofSamples;i++)
        {
            for (int j=0;j<4;j++)
            {
                System.out.println(ininputs[i][j]);
            }
        }

    }

    
}
