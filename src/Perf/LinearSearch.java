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
public class LinearSearch {  
  
 int searchElementLinear(int numList[], int toSearch) {  
  int foundIndex = 999999999;  
  for (int i = 0; i < numList.length; i++) {  
       System.out.println("Linear: " + numList[i] + "?=" + toSearch); 
  
   if (numList[i] == toSearch) { 
    foundIndex = i;
    break;
   }  
  }
      
  return foundIndex;  
 }  
}  
