import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        String str = scn.next();
        ArrayList<String> kpcsolved = getKPC(str);
        System.out.println(kpcsolved);
    }
    static String[] data = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str) {
        // base case 
        if(str.length()==0){// when ko keypad is clicked then we adding base string that is empty string .
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char firststr = str.charAt(0);// the first integer from scanner
        String leftstr = str.substring(1);// rest of the intergers from scanner .
        ArrayList <String> recursionans = getKPC(leftstr);// faith :- it will give the all subsequence of the leftstr i.e rest of the integer.
        ArrayList <String> resultans = new ArrayList<>();// created a ArrayList.
        String dataforFirststr = data[firststr - '0']; // getting value of first integer . for example 578 then here we are getting the value of 5 that is mno.
        for(int i = 0; i<dataforFirststr.length(); i++){
            char datavalueoffirststr = dataforFirststr.charAt(i);// geting value one by one after this statement
            // this loop will send value one by one 

            for(String recursionadd : recursionans){// here in this loop we are adding all the ans of everylevel recursion with our ans . mtlb faith meeting expectation .
                resultans.add(datavalueoffirststr + recursionadd);
            }
        }
        return resultans;
    }

}