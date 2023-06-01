import java.util.*;
public class ReverseNumber {
    public static void main(String[] args)
 {
    Scanner s= new Scanner(System.in);
System.out.println("enter the number:");
        int number = s.nextInt();
        int reversedNumber = reverseNumber(number);
        
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
    }
    
    public static int reverseNumber(int number) {
        int reversedNumber = 0;
        
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        
        return reversedNumber;
    }
}
