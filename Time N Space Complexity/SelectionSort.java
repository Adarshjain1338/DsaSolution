/*
Selection Sort - find the minium element in every iteration and swap in the last of every iteration .
Time complexity - best avg worst all is o(n^2).
BubbleSort is worst than selection because Of High number of Swap.
 */

import java.io.*;
import java.util.*;

public class Main {

  public static void selectionSort(int[] arr) {
      // the first loop only run until n -1 .
      // we catch the i idx in the minidx , loop count will increase our minidx also increase.
      // second for loop will run till n 
      // here in any loop, we are comparing first all the element then after completing the second all loop 
      // we make swap and our minidx is also changes during in the loop 
    for(int i = 0; i < arr.length-1; i++){
      int minidx = i;
      for(int j = i+1; j < arr.length; j++){
        if(isSmaller(arr,j,minidx )==true){
          minidx = j;
        }
      }
        swap(arr,i, minidx);
    }
    
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  // return true if ith element is smaller than jth element
  public static boolean isSmaller(int[] arr, int i, int j) {
    System.out.println("Comparing " + arr[i] + " and " + arr[j]);
    if (arr[i] < arr[j]) {
      return true;
    } else {
      return false;
    }
  }
// printing the array in the last.
  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
//for taking input .
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    selectionSort(arr);
    print(arr);
  }

}