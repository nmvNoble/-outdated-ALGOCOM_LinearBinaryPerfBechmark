/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perf;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Neil Michael Noble
 */
public class Implementation {  
  
 public static void main(String args[]) {  
   

    LinearSearch linearSearch = new LinearSearch();  
    BinarySearch binarySearch = new BinarySearch(); 
    int binSearch;
    int linSearch;
    int arraySize = 100;
    //int minVal = 1;
    //int maxVal = 100;
    //int numList[] = generateSorted(arraySize, minVal, maxVal); 
    int numList[] = IntStream.range(1, arraySize+1).toArray();  
    int toSearch = getRandomVal(1, arraySize+1);//(minVal,maxVal); 

    long startBTime = System.currentTimeMillis();
    binSearch = binarySearch.searchElementBinary(numList, toSearch);  
    long stopBTime = System.currentTimeMillis();
    long elapsedBTime = stopBTime - startBTime;

    long startLTime = System.currentTimeMillis();
    linSearch = linearSearch.searchElementLinear(numList, toSearch);
    long stopLTime = System.currentTimeMillis();
    long elapsedLTime = stopLTime - startLTime;
    
    
    System.out.println("\n\nArray Size: " + arraySize);
    //System.out.println("-Array List-");
    //System.out.println(Arrays.toString(numList));
    System.out.println("Number to be searched: "+toSearch);
    if(binSearch == 999999999 || linSearch == 99999999){
        System.out.println("\nBinary Search Failed");
        System.out.println("Binary Milliseconds : " + elapsedBTime); 
        System.out.println("Linear Search Failed");
        System.out.println("Linear Milliseconds : " + elapsedLTime);  
    }
    else{
        System.out.println("\nBinary Search Index : " + binSearch);
        System.out.println("Binary Milliseconds : " + elapsedBTime); 
        System.out.println("Linear Search Index : " + linSearch);
        System.out.println("Linear Milliseconds : " + elapsedLTime);  
    }
}  
 
 
    //Sorted Random number array generator
    private static final Random rand = new Random();
    private static int getRandomVal(int min, int max) {
    return min + rand.nextInt(max - min + 1);
    }
    /*public static int[] generateSorted(final int length, final int minVal, final int maxVal) {
        List<Integer> data = new ArrayList<>(length);
        int ranVal;

        for (int i = 0; i < length; i++) {
            
            ranVal=getRandomVal(minVal, maxVal);
            if(data.size()==0)
                data.add(ranVal);
            else{
                int datasize=0;
                for(int a=0; a<data.size(); a++){
                    if(data.get(a)!=ranVal)
                        datasize+=1;

                        //data.add(ranVal);
                }
                if(datasize==data.size())
                    data.add(ranVal);
            }
            
        }
        Collections.sort(data);

        return data.stream().mapToInt(i -> i).toArray();
    }*/
}  
