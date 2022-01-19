
import java.io.*;
import java.util.*;
public class Main{
    //sorting function 
    // for this question just imagine a box with moving line to make partion
    // here left and right in zero
    // 0 belongs to    left = 0 to left-1;
    // 1 belongs to    right = left to right;
    // and tab tk loop chalega jab tak array ke har ek element pe travesal nahi karleta .
    public static void sort01(int[] arr){
        int right = 0; 
        int left = 0;
        while(right < arr.length){

            if(arr[right] == 1){
                right++;
            }
            else{
                swap(arr, right , left);
                left++;
                right++;
            }

        }

    }
    // swaping functon 
    public static void swap(int[]arr, int i, int j){
        System.out.println("Swapping index "+ i+" and index "+ j);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    // printing function 
    public static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
    // Scanner scn functin .ie main
    public static void main(String[] args ) throws Exception{

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i =0; i< arr.length; i++){
            arr[i] = scn.nextInt();
        }
        sort01(arr);
        print(arr);


    }


}