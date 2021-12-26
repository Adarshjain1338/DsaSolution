/** Dumb call - where we have to handle also negative base case . for example you want to from 3 to 0 and tum abhi 2nd stair khade ho and you called 3jump (1,2,3 jumps allowed in ques). so youll be ending at negativee stairPath and that is not possible  */
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList < String > allway = getStairPaths(n);
        System.out.println(allway);
    }

    public static ArrayList < String > getStairPaths(int n) {
        if (n == 0) {
            ArrayList < String > base = new ArrayList < > ();
            base.add("");
            return base;
        } // faith call . that gives the all xyz path
        if (n < 0) {
            ArrayList < String > empty = new ArrayList < > ();
            return empty;
        }
        ArrayList < String > smallans = getStairPaths(n - 1);
        ArrayList < String > smallans2 = getStairPaths(n - 2);
        ArrayList < String > smallans3 = getStairPaths(n - 3);
        //faith meeting expectation / that will give the all path .
        ArrayList < String > result = new ArrayList < > (); // we created a arraylist and adding our ans and recursion ans .
        for (String adding1path: smallans) {
            // we  looped in our recursion ans and adding value according to their calls 
            result.add(1 + adding1path);
        }
        for (String adding2path: smallans2) {
            result.add(2 + adding2path);
        }
        for (String adding3path: smallans3) {
            result.add(3 + adding3path);
        }

        return result;
    }

}
//--------------------------------------------------------------------------------------------------------------------------//
/* SMART CALLS - Where we dont have to handle negative calls . because we will check first that is it possible to make jump using if statement  */
//-------------------------------------------------------------------------------------------------------------------------//
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList < String > allway = getStairPaths(n);
        System.out.println(allway);
    }
    //faith meeting expectation / that will give the all path .
    public static ArrayList < String > getStairPaths(int n) {
        if (n == 0) {
            ArrayList < String > base = new ArrayList < > ();
            base.add("");
            return base;
        } // faith call . that gives the all xyz path
        if (n - 1 >= 0) {
            ArrayList < String > smallans = getStairPaths(n - 1);
            for (String adding1path: smallans) {
                // we  looped in our recursion ans and adding value according to their calls 
                result.add(1 + adding1path);
                ArrayList < String > result = new ArrayList < > (); // we created a arraylist and adding our ans and recursion ans .
            }
        }
        if (n - 2 >= 0) {
            ArrayList < String > smallans2 = getStairPaths(n - 2);
            for (String adding2path: smallans2) {
                result.add(2 + adding2path);
            }
        }
        if (n - 1 >= 0) {
            ArrayList < String > smallans3 = getStairPaths(n - 3);
            for (String adding3path: smallans3) {
                result.add(3 + adding3path);
            }

        }

        return result;
    }
}