//Important 

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

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        if(sr > dr || sc > dc){
            ArrayList <String> empty = new ArrayList<>();
            return empty;
        }
        ArrayList<String> result = new ArrayList<>();

        for(int i = 1; i<=dc-sc; i++){
            ArrayList<String> hways = getMazePaths(sr, sc+i, dr, dc);
                for(String ans2: hways){
                    result.add("h"+ i +ans2);
                }
        }
         for(int j = 1; j<= dr-sr ;j++){
             ArrayList<String> vways = getMazePaths(sr+j, sc, dr,dc);
                 for(String ans1: vways){
                     result.add("v"+ j +ans1);
                 }
         }


        for(int k = 1; k<= dr-sr && k<=dc-sc; k++){
            ArrayList<String> dways = getMazePaths(sr+k, sc+k, dr,dc);
                for(String ans3: dways){
                    result.add("d"+ k +ans3);
                }

        }

        return result;
    }

} 

// same is like a getMazePath but in this question . you have to add one case and two moderation and that is . 
// 1> that we have to add path diagonals ways 
// 2> now we are allowed to jump more than 1 but how many that we are bounded in for loop (you can check .){ you can't jump beyoond the matrix }.