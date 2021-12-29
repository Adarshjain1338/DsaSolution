import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int idx = scn.nextInt();
        int[] arr = new int[idx];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int max = maxOfArray(arr, 0);
        System.out.println(max);
    }

    public static int maxOfArray(int[] arr, int idx){
        /* Base Call */
        if(idx == arr.length){
            // traverse the whole array. not able to find max of an array then we return default minimum value of java.
            // so there is always a greater value then -infinity.
            return Integer.MIN_VALUE;  
             
        }
        /* Faith Call */
        // faith is this function will give there max of an array from (1 to n){in array.}
        int newarr = maxOfArray(arr, idx+1);

        /* Faith Meeting Expectation */
        // then we will compare the recursive call ans is max then our current array index if yes then we return recursive call ans . if not then 
        // will return current element .
        return (newarr > arr[idx])? newarr : arr[idx];
    } 

}