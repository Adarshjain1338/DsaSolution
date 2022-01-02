import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        printStairPaths(n,"");// here we call the function with first ans in our recursive call i.e "".
    }

    public static void printStairPaths(int n, String path) {
            // when n become zero then we print the all the path . when our n is zero we already added the ans when we are calling the function
        if(n==0){
            System.out.println(path);
            return;
        }
        // negative base case :- when n is negative then we simple return the function ;
        if(n<0){
            return;
        }

        // here we are calling the function and we are adding our ans in ans, before calling . 
        printStairPaths(n-1,path+"1"); 
        printStairPaths(n-2,path+"2");
        printStairPaths(n-3,path+"3");
    }

}