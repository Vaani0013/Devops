import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
       System.out.println("Iterating over an array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Iterating over a collection:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
