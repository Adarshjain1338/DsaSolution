/*
 ALGO NAME------>MET IN THE MIDDLE

here we are taking two pointer algo .
first pointer on left side of array ,
second pointer on the right side at the end of an array.

question -> we have to get the pair of the array element those who are equal to our target .

the given array is not sorted and this algo needs a sorted array. 
1) sort array 
2) make pointer , where refer 3to5 lineas 
3) loop will run till when the pointer met in the middle .
4) now we are checking that the sum of the both pointer is equal to target or greater or smaller then target .
5) if it is smaller then our target then we are increaseing the left pointer . 
6) if it is greater then our target then we are decreasing the right pointer. 
7) if it is equal to our target then we are printing our value of array.

*** leet code question -- > you have to tell the index of the element rather then the value of array.
 */

import java.io.*;
import java.util.*;

public class Main {

  public static void targetSumPair(int[] arr, int target){
    //write your code here
    int left = 0;
    int right = arr.length-1;
    Arrays.sort(arr);
    while(left < right){
      int sum = arr[left] + arr[right];
      if(sum < target){
        left++;
      }
      else if(sum > target){
        right--;
      }
      else{
        System.out.println(arr[left] + ", "+ arr[right]);
        left++;
        right--;
      }
    }

  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++){
      arr[i] = scn.nextInt();
    }
    int target = scn.nextInt();
    targetSumPair(arr,target);
  }

}