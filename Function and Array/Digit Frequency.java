import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int d = scn.nextInt();
    int f = getDigitFrequency(n, d);
    System.out.println(f);
  }

  public static int getDigitFrequency(int n, int d) {
    // write code here
    int count = 0; // intializing count in intially with zero
    while (n > 0) { // loop run till when n is greater than zero.
      // modulo function means x % y produces the remainder when x is divided by y.
      int digit = n % 10; //here we are extracting last digit through modulo operator .
      n = n / 10; // after extracting last digit than we decreasing n by 10.
      if (digit == d) {
        // if our extracted last digit is equal to our target numnber then we increase our count by 1;
        count++;
      }
    }
    return count;
  }
}