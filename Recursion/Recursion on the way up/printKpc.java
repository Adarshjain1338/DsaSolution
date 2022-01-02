//NOTE :----> ** difference between in char and String . when and where to Use char and String ;
//            ** remember how to intialize the static string obj .
//            ** string is not equal to int . so we minus the 0 from string to make integer .
//            **** most imp . how we are getting string one by one , using charAt 0 ; // code line :- 26
//                           and removing that charAt0 using substring by one  // code line :- 27


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printKPC(str, "");

    }
    static String[] data = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printKPC(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        char ch = str.charAt(0);
        String left = str.substring(1);
        
        String codeforch = data[ch-'0'];
        for(int i = 0; i < codeforch.length(); i++){
            char ch2 = codeforch.charAt(i);
            printKPC(left,asf+ch2);
        }

    }

}