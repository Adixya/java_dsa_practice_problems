import java.util.*;

public class Patterns {
    public static void main(String args[]){
    // 1. Print rectangle with help of *
    int n = 4;
    int m = 5;
        // for(int i = 1; i<=n; i++){
        //     for(int j =1; j<=m; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

    // 2. Print hollow rectangle using *
        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=m; j++){
        //         if(i==1 || j==1 || i==n || j==m){
        //             System.out.print("*");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

    // 3. print half pyramid
        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

    // 4. Print inverted half pyramid
        // for(int i = n; i>=1; i--){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

    // 5. Print inverted half pyramid (rotated 180 degree)
        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }

        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

    // 6. Print half pyramid with no.s
        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

    // 7. Print invert half pyramid with no.s
        // for(int i = m; i>=1; i--){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

    // 8. Print floyd's triangle
        // int num = 1;
        // for(int i = 1; i<=m; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print(num+" ");
        //         num++;
        //     }
        //     System.out.println();
        // }

    // 9. Print 0-1 triangle
        // for(int i = 1; i<=m; i++){
        //     for(int j = 1; j<=i; j++){
        //         if((i+j)%2==0){
        //             System.out.print("1"+" ");
        //         } else {
        //             System.out.print("0"+" ");
        //         }
        //     }
        //     System.out.println();
        // }

    // ===================================================
    // HOMEWORK
    // 1. Print Solid Rhombus
    //int m = 5;
        // for(int i = 1; i<=m; i++){
        //     for(int j = 1; j<=m-i; j++){
        //         System.out.print(" ");
        //     }

        //     for(int j = 1; j<=m; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    
    // 2. Print no. pyramid
    int a = 1;
        // for(int i = 1 ; i<=m; i++){
        //     for(int j = 1; j<=m-i; j++){
        //         System.out.print(" ");
        //     }

        //     for(int j = 1; j<=i; j++){
        //         System.out.print(i+" ");
        //     }
            
        //     System.out.println();
        // }

    // 3. Print palindromic no. pyramid
        // for(int i = 1; i<=m; i++){
        //     for(int j = 1; j<=m-i; j++){
        //         System.out.print(" ");
        //     }

        //     for(int j = i; j>=1; j--){
        //         System.out.print(j);
        //     }

        //     for(int j = 2; j<=i; j++){
        //         System.out.print(j);
        //     }
            
        //     System.out.println();
        // }
    }
}

