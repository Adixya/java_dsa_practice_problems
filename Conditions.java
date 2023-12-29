import java.util.*;

public class Conditions {
    public static void main(String[] args){
        // Checking Adult 
        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();

        // if(age > 18) {
        //     System.out.println("Adult");
        // } else {
        //     System.out.println("Not Adult");
        // }
        
        // ODD OR EVEN
        // Scanner sc = new Scanner(System.in);
        // int no = sc.nextInt();

        // if(no % 2 == 0) {
        //     System.out.println("Even");
        // } else {
        //     System.out.println("Odd");
        // }

        // TWO INPUTS
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        
        // // TRICK 1
        // if(a == b) {
        //     System.out.println("Equal");
        // } else if (a < b){
        //     System.out.println("a < b");
        // } else {
        //     System.out.println("a > b");
        // }

        // Trick 2
        // if(a == b) {
        //     System.out.println("Equal");
        // } else {
        //     if(a > b){
        //         System.out.println("a is greater");
        //     } else {
        //         System.out.println("b is grerater");
        //     }
        // }

        // Button SWITCH
        // Scanner sc = new Scanner(System.in);
        // int button = sc.nextInt();
         
        // switch(button) {
        //     case 1 : System.out.println("Hello");
        //     break;
        //     case 2 : System.out.println("Namaste");
        //     break;
        //     case 3 : System.out.println("Bonjour");
        //     break;
        //     default : System.out.println("Invalid Button");
        // }

        // HOMEWORK CALCULATOR
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        int diff = a - b;
        int mul = a * b;
        int div = a / b;
        int rem = a % b;
        int cal = sc.nextInt();

        switch(cal) {
            case 1 : System.out.println(sum);
            break;
            case 2 : System.out.println(diff);
            break;
            case 3 : System.out.println(mul);
            break;
            case 4 : System.out.println(div);
            break;
            case 5 : System.out.println(rem);
            break;
            default : System.out.println("invalid");
        }

    }
}