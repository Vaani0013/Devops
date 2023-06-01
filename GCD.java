import java.util.*;
public class GCD
 {
    public static int calculateGCD(int num1, int num2)
 {
        if (num2 == 0) 
        {
            return num1;
        }
        return calculateGCD(num2, num1 % num2);
    }

    public static void main(String[] args)
 {
       Scanner s=new Scanner(System.in);
    System.out.println("Enter the values of num1 &num2:");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int gcd = calculateGCD(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
}
