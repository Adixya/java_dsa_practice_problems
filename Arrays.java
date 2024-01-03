import java.util.*;

public class Arrays {
    // static void listElements(int[][] arrayIn) {
    // for (int i = 0; i < arrayIn.length; i++) {
    // for (int j = 0; j < arrayIn[i].length; j++) {
    // System.out.print(arrayIn[i][j] + " ");
    // }
    // System.out.println();
    // }
    // }

    // public static void main(String[] args) {
    // int[][] array1 = { { 1, 2, 3, 4 }, { 4, 5, 6 } };
    // int[][] array2 = { { 1, 2, 9, 10 }, { 3, 7 }, { 4, 5, 6 } };

    // System.out.println("Accessing elements in array1:");
    // listElements(array1);
    // System.out.println("Accessing elements in array2:");
    // listElements(array2);

    // }

    // LINEAR SEARCH (Simple Problem)
    // public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // int size = sc.nextInt();
    // int num[] = new int[size];

    // for (int i = 0; i < size; i++) {
    // num[i] = sc.nextInt();
    // }

    // int x = sc.nextInt();
    // for (int i = 0; i < num.length; i++) {
    // if (num[i] == x) {
    // System.out.println(x + " found at : " + i);
    // }
    // }

    // }

    // 1. Take an array of names as input from the user and print them on the screen
    // public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // int size = sc.nextInt();
    // String names[] = new String[size];

    // for (int i = 0; i < size; i++) {
    // names[i] = sc.next();
    // }

    // for (int i = 0; i < names.length; i++) {
    // System.out.println("His name is : " + names[i]);
    // }
    // }

    // 2. Find the maximum & minimum number in an array of integers.
    // [HINT : Read about Integer.MIN_VALUE & Integer.MAX_VALUE in Java]
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int size = sc.nextInt();
    // int num[] = new int[size];

    // for (int i = 0; i < size; i++) {
    // num[i] = sc.nextInt();
    // }

    // int max = Integer.MAX_VALUE;
    // int min = Integer.MIN_VALUE;

    // for (int i = 0; i < num.length; i++) {
    // if (num[i] < min) {
    // min = num[i];
    // }

    // if (num[i] > max) {
    // max = num[i];
    // }

    // }

    // System.out.println("Max num is : " + max);
    // System.out.println("Min num is : " + min);
    // }

}
