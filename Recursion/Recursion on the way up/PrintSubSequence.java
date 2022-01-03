// Number of choices = number of recursive call 
// adding our required answere when we are  calling recursive call and printing our ans when our all the recursion tree is developed .


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printSS(str, "");
    }

    public static void printSS(String str, String ans) {
        //str length will decrease after 23 line.
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0); // extracting the first character from our string 
        String leftstr = str.substring(1); // removing the first character from 1 and store the left string .

        printSS(leftstr,ans+ch);  // calling recursive call in our left String and adding our extracted character . and this is choice is when every wants to come
        printSS(leftstr,ans); // here recursive call when everyone is declineing .
    }

}