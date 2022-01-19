import java.io.*;
import java.util.*;

public class Main {

  public static void sort012(int[] arr){
    //write your code here
    int left = 0;
    int right = 0; 
    int last = arr.length-1;
    // Same like sort 01 
    // ** left = 0 to left -1;
    // **  right = left to right 
    // ** last = last to arr.length 
    // right to last is known as unknown zone . we will travel on them to make sorting array .
    // logic = moving lead in the box with two stick moving together and one stick moving against it .
    //  tab tak krenge jab tak apne ko last wala point nahi milta and apan kyu nahi jaa rhe akhir tak array ke end tak .ie arr.length because 
    //  wha ke element sort hogye . 

    while (right <= last){
      if(arr[right]==1){
        right++;
      }
      else if(arr[right]==0){
        swap(arr, right, left);
        left++;
        right++;
      }
      else{
        swap(arr, right, last);
        last--;
      }
    }
    
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping index " + i + " and index " + j);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++){
      arr[i] = scn.nextInt();
    }
    sort012(arr);
    print(arr);
  }

}