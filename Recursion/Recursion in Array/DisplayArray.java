import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] array = new int[n];
        for(int i = 0; i<array.length; i++){
            array[i] = scn.nextInt();
        }
        displayArr(array, 0);
    }

    public static void displayArr(int[] arr, int idx){
        /* Base Call */
        if(idx == arr.length){
            return;
        }
        /*Faith Meeting Expecatation*/
        System.out.println(arr[idx]); // pre order work.
        /*Faith Call*/
        displayArr(arr,idx+1);
    }

}