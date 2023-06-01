import java.util.*;
public class Fibonacci
 {
    public static void main(String[] args)
 {
        Scanner s=new Scanner(System.in);
  System.out.println("Enter the value of count:");
        int count = s.nextInt();
        System.out.println("Fibonacci sequence up to " + count + " terms:");

        int firstTerm = 0;
        int secondTerm = 1;

        for (int i = 0; i < count; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
