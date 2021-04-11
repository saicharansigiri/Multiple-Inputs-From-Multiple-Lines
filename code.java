package java_projects;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.*;

public class Practice{
    public static void main(String[] args)throws IOException  {
        
        
        Scanner sc = new Scanner(System.in);
        int numofSamples;
        numofSamples = sc.nextInt();

        BufferedReader in = new BufferedReader( new InputStreamReader( System.in)); 
        
        String[] inputs = new String[numofSamples*4];

         double[][] ininputs = new double[numofSamples][4];
         
         for(int i=0;i<numofSamples;i++){
            inputs = in.readLine().split(" ");
            
            System.out.println(" ");
            for(int j=0;j<4;j++){

                ininputs[i][j] = Double.parseDouble(inputs[j]); 
            
            }
         }

        

        for (int i=0;i<numofSamples;i++){
            for (int j=0;j<4;j++){
                System.out.println(i+":"+ininputs[i][j]);
            }
        }

    }

    
}
