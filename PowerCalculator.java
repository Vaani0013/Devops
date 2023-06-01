import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the base number: ");
        double base = input.nextDouble();
        
        System.out.print("Enter the exponent: ");
        int exponent = input.nextInt();
        
        double result = calculatePower(base, exponent);
        
        System.out.println(base + " raised to the power of " + exponent + ": " + result);
        
        
    }
    
    public static double calculatePower(double base, int exponent) {
        double result = 1;
        
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        
        return result;
    }
}
