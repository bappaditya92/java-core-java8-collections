import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");

        // Printing the list
        System.out.println("Fruit List: " + fruits);

        // Access element
        System.out.println("First fruit: " + fruits.get(0));

        // Remove element
        fruits.remove("Mango");

        // Size of list
        System.out.println("Total fruits: " + fruits.size());

        // Loop through list
        System.out.println("All fruits:");
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}