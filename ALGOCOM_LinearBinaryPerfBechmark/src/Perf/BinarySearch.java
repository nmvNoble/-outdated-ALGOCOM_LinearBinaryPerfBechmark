/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perf;

/**
 *
 * @author Neil Michael Noble
 */
public class BinarySearch {  
  
 int searchElementBinary(int numList[], int toSearch) {  
  
  int startIndex = 0;  
  int endIndex = numList.length - 1;  
  int midindex = (startIndex + endIndex) / 2;  
  int midElement = numList[midindex];  
  int foundIndex = 999999999;  
  
  while (startIndex <= endIndex) {  
   if (midElement < toSearch) {  
    startIndex = midindex + 1;  
    midindex = (startIndex + endIndex) / 2;  
    midElement = numList[midindex];  System.out.println("Binary: " + numList[midindex] + "?=" + toSearch);
   } else if (midElement > toSearch) {  
    endIndex = midindex - 1;  
    midindex = (startIndex + endIndex) / 2;  
    midElement = numList[midindex];  System.out.println("Binary: " + numList[midindex] + "?=" + toSearch);
   } else {  
    foundIndex = midindex;  
    break;  
   }  
  }  
  return foundIndex;  
 }  
  
}  
