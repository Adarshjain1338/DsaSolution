

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int [n];
        for(int i = 0 ; i < arr.length; i++){
            arr[i]= scn.nextInt();
        }
        int target = scn.nextInt();
        printTargetSumSubsets(arr,0,"", 0, target);
    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
        // base case .
        if(idx == arr.length){
            // and we have to print that subset which is equal to our subset .
            if(sos == tar){
            System.out.println(set+".");
            }
            return;
        }
        // here we are calling a function only when sum of subset is less than target ; 
        // if target is 60, then sum of subset is must be less then or equal to 60 to call a recursive call 
        if(sos <= tar){
            printTargetSumSubsets(arr, idx+1, set+arr[idx]+", ", sos+arr[idx], tar); // recursive call when we have to include a subset .
        }
            printTargetSumSubsets(arr,idx+1,set,sos,tar);  // recursive call when we have to exclude in a subset  




    }

}