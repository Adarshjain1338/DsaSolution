import java.io.*;
import java.util.*;

public class Main {

  public static void partition(int[] arr, int pivot){
      // same as sort 01 and sort 012
      // everthing just same 
      // except here you get a pivot point . and you have to do sorting around the pivot so that pivot goes to their sorting location.
    //write your code here
    int left = 0 ; 
    int right = 0 ;
    while(right<arr.length){
      if(arr[right]>pivot){
        right++;
      }
      else{
        swap(arr, right , left);
        right++;
        left++;
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

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int pivot = scn.nextInt();
    partition(arr,pivot);
    print(arr);
  }

}