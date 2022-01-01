
//**NOTE :- in this topic . dont ever think like faith and expectation method . */
//*********************************************************Basic_withoutThinkingCalls****************************************************************** */
import java.io.*;
	import java.util.*;

	public class Main {

	    public static void main(String[] args) throws Exception {
            Scanner scn = new Scanner(System.in);
            int row = scn.nextInt();
            int col = scn.nextInt();
            printMazePaths(1,1,row,col,""); // here we call the function with a empty string 
            // jaise jaise ans banyenge empty string ke sath add hote jayega 
	    }

	    // sr - source row
	    // sc - source column
	    // dr - destination row
	    // dc - destination column
	    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
            //negative base case
            if(sr>dr || sc>dc){
                return;
            }
            // postive case
	        if(sr == dr && sc == dc){
                System.out.println(psf);
                return;
            }
            
            printMazePaths(sr,sc+1,dr,dc,psf+"h"); // recursive call for horizontal ways and adding "h" with call in ans .
            printMazePaths(sr+1,sc,dr,dc,psf+"v"); // recursive call for vertical ways and adding "v" with call in ans .
	    }

	}

//*********************************************************SmarterCall****************************************************************** */
import java.io.*;
	import java.util.*;

	public class Main {

	    public static void main(String[] args) throws Exception {
            Scanner scn = new Scanner(System.in);
            int row = scn.nextInt();
            int col = scn.nextInt();
            printMazePaths(1,1,row,col,"");
	    }

	    // sr - source row
	    // sc - source column
	    // dr - destination row
	    // dc - destination column
	    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
            //postive base case
	        if(sr == dr && sc == dc){
                System.out.println(psf);
                return;
            }
            //here we not calling any call that give us negative value so we dont have to handle negative base case .
            if(sc+1<=dc){
            printMazePaths(sr,sc+1,dr,dc,psf+"h");
            }
            if(sr+1<=dr){
            printMazePaths(sr+1,sc,dr,dc,psf+"v");
            }
	    }

	}