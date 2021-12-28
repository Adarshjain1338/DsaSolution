import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();// initailization and taking input from user and it will help in size of array 
        int[] arr = new int[n];// intialization of array
        for(int i =0; i < arr.length; i++){
            arr[i] = scn.nextInt();// taking input in array one by one.
        }
        int x = scn.nextInt();// taking target number in array.
        int findfirst = firstIndex(arr, 0, x);// calling a function 
        System.out.println(findfirst); // printing result of that function 
    }

    public static int firstIndex(int[] arr, int idx, int x){
        // base case :- if we travese the whole array and we cant find any target nunber in that array , then we are returning -1.
        if(idx == arr.length){
            return -1;
        }
        int ans;// initizale a variable to store the result/answer.
        // expectation meeting faith 
        if(arr[idx] == x){
            // in this statement if any number of array is equal to our targeted number then we are returning index of that number.
            ans = idx;
            return ans;
        }
        // if we can't find any number then we are calling a recusive call .
        // Faith call 
        else{
            ans = firstIndex(arr, idx+1, x);
        }

        return ans;
    }

}