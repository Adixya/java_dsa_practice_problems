import java.util.*;

public class Functions {
    // public static void printMyName(String name){
    //     System.out.println(name);
    //     return;
    // }

    // public static int calculateSum(int a, int b){
    //     int sum = a + b;
    //     return sum;
    // }

    // public static int calculateMul(int a, int b){
    //     return a * b;
    // }

    public static void printFactorial(int n){
        //loop
        if(n<0){
            System.out.println("Invalide no.");
            return;
        }
        int factorial = 1;

        for(int i = n; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        
        // printMyName(name);
        // int sum = calculateSum(a, b);
        // System.out.println("Sum of 2 no. is : " + sum);
        // System.out.println("Product of 2 no. is : " + calculateMul(a, b));

        int n = sc.nextInt();
        printFactorial(n);

    }
}
