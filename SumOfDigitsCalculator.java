import java.util.Scanner;

public class SumOfDigitsCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        int sum = calculateSumOfDigits(number);
        
        System.out.println("Sum of digits in " + number + ": " + sum);
        
        
    }
    
    public static int calculateSumOfDigits(int number) {
        int sum = 0;
        
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        
        return sum;
    }
}
