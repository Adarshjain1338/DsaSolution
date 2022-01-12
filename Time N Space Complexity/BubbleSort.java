import java.io.*;
import java.util.*;

public class Main {

  public static void bubbleSort(int[] arr) {
    for(int i =1; i<arr.length; i++){ // first loop for increasing count and never compare same elements . and in the end of loop we say every element is sorted.
        for(int j = 0; j<arr.length-i; j++){ // this loop starts with zero and end with n-i. if i = 2 and n =5 then equation is 5-2 
            if(isSmaller(arr, j+1,j)){ // calling the function - it will compare that who is smaller in two elements in the if statement if it return true then swap if not just increase the count .
                swap(arr, j+1, j); // calling the swaping function - it will swap in two elements 
            }
        }
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
// printing the array in the end .
  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
// taking input 
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    bubbleSort(arr);
    print(arr);
  }

}