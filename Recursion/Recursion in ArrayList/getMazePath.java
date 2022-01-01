import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();
        ArrayList<String> allpaths = getMazePaths(1,1,row,col);
        System.out.println(allpaths);
    }

    // sr - source row i.e row 1
    // sc - source column i.e column 1
    // dr - destination row i.e input row 
    // dc - destination column i.e input column
    /*------------------------------------------------------------------------------------------- */
    // Expectataion :- it will give the all path from sr sc to dr dc.
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
    //Base call (0.a):- if our source row and source column is equal to our destination row and destination column then we create a base arraylist and return a empty string arraylist.
        if(sr == dr && sc == dc){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
    //Base call (0.b):- if our source row and source column is greater to our destination row and destination column then we create a base arraylist and return a empty arraylist. wihtout any empty string.
        if(sr > dr || sc > dc){
            ArrayList <String> empty = new ArrayList<>();
            return empty;
        }

    //Faith call (1.a) = we are assuming that from column +1 .ie (1,2) {row, column} to (1,dc)>>>>>>>for column it will look likethis (2, dc) if we started from 1.
        ArrayList<String> hways = getMazePaths(sr, sc+1, dr, dc);
    //Faith call (1.a) = we are assuming that from column +1 .ie (2,1) {row, column} to (1,dr)>>>>>>>for column it will look likethis (2, dr) if we started from 1.
        ArrayList<String> vways = getMazePaths(sr+1, sc, dr,dc);
    //Faith Meeting Expectation (2) = creating a empty arraylist and we will one loop that will add recursion and their respective
        ArrayList<String> result = new ArrayList<>();
        //Faith Meeting Expectation (2.a) = this loop will traverse all the horizontal recusion ans and add h to it one by one
        for(String ans2: hways){
            result.add("h"+ ans2);
        }
        //Faith Meeting Expectation (2.b) = this loop will traverse all the vertical recusion ans and add h to it one by one
        for(String ans1: vways){
            result.add("v"+ans1);
        }

        return result;
    }

}
// if we have to find the path length . 
// greedy way 
//(n-1)+(m-1) = length of path .