import java.util.*;

public class PatternsHOT {
    public static void main(String args[]){
        // 1. Butterfly Pattern
        int n=5;
        //for upper half
        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }

        //     int space = 2*(n-i);
        //     for(int j = 1; j<=space; j++){
        //         System.out.print(" ");
        //     }

        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // } 

        // //for lower half
        // for(int i = n; i>=1; i--){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }

        //     int space = 2*(n-i);
        //     for(int j = 1; j<=space; j++){
        //         System.out.print(" ");
        //     }

        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // } 

    // 2. Diamond Pattern
        //for upper half
        // for(int i = 1; i<=n; i++){
        //     for(int j =1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }

        //     for(int j = 1 ; j<=2 * i - 1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // //for lower half
        // for(int i = n; i>=1; i--){
        //     for(int j =1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }

        //     for(int j = 1 ; j<=2 * i - 1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }    
}
