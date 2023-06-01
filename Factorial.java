import java.util.*;
public class Factorial
 {
    public static int calculateFactorial(int n) 
{
        if (n == 0)
 {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args)
 {
     Scanner s=new Scanner(System.in);
      System.out.println("enter the value of number:");
        int number = s.nextInt();
        int factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
