import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i =0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int findlast = lastIndex(arr , arr.length-1 , x);
        System.out.println(findlast);
        
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(arr.length == 0){
            return -1;
        }
        int ans;
        if(arr[idx] == x){
            ans = idx;
        }
        else{
            ans = lastIndex(arr , idx-1, x);
        }
        return ans;
    }

}