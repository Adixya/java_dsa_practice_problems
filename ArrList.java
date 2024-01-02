import java.util.ArrayList;
import java.util.List;

public class ArrList {
    public static void main(String[] args) {
        List<String> colorsList = new ArrayList<>();

        colorsList.add("Black1");
        colorsList.add("Black2");
        colorsList.add("Black3");
        colorsList.add("Black4");

        System.out.println("Initial List of Colors:");
        displayColors(colorsList);

        colorsList.add("Orange");

        System.out.println("\nList of Colors after adding 'Orange':");
        displayColors(colorsList);

        colorsList.remove("Black2");

        System.out.println("\nList of Colors after removing 'Black2':");
        displayColors(colorsList);
    }

    public static void displayColors(List<String> colors) {
        for (String color : colors) {
            System.out.println(color);
        }
    }

}
