/* All Indices Of Array */

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        // write ur code here

        /*Base Case*/
        // if we treavse the whole array. then we are returning total count of target occuring in the array.
        //and making of the same number of array.
        if(idx == arr.length){
            int[] base = new int [fsf];
            return base;
        }
        int res[];
        //Faith Call - we call recursive fn everytime . if we got the target element then we increase the count by one and we put the value according to count number 
        // and tell the idx
        //if we are not able to find the target number then we call the recursive function and our count will be same as previous
        if(arr[idx]==x){
            res = allIndices(arr,x,idx+1,fsf+1); /*Faith Call*/
            res[fsf] = idx;/*Faith meeting Expectation (our work)*/
            return res;
        }
        else{
            res = allIndices(arr,x,idx+1, fsf);/*Faith Call*/
            return res;
        }
    }

}