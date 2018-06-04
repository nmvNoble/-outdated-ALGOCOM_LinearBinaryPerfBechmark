/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.stream.IntStream;

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
    int arraySize = 10000;
    int minVal = 0;
    int maxVal = 100000;
    int numList[] = generateSorted(arraySize, minVal, maxVal); 
    int toSearch = getRandomVal(minVal,maxVal); 

    long startBTime = System.currentTimeMillis();
    binSearch = binarySearch.searchElementBinary(numList, toSearch);  
    long stopBTime = System.currentTimeMillis();
    long elapsedBTime = stopBTime - startBTime;

    long startLTime = System.currentTimeMillis();
    linSearch = linearSearch.searchElementLinear(numList, toSearch);
    long stopLTime = System.currentTimeMillis();
    long elapsedLTime = stopLTime - startLTime;
    
    
    System.out.println("\n\nSearching for " + toSearch + " from size " + arraySize + " Array");
    System.out.println("-Array List-");
    System.out.println(Arrays.toString(numList));
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
    public static int[] generateSorted(final int length, final int minVal, final int maxVal) {
        List<Integer> data = new ArrayList<>(length);

        for (int i = 0; i < length; i++) {          
            data.add(getRandomVal(minVal, maxVal));
        }
        Collections.sort(data);

        return data.stream().mapToInt(i -> i).toArray();
        }
    private static int getRandomVal(int min, int max) {
    return min + rand.nextInt(max - min + 1);
    }
}  
