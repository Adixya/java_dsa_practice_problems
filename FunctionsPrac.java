import java.util.*;
import java.lang.Math;

public class FunctionsPrac {

    // 1. Check Prime no. or not
    // static boolean isPrime(int n){
    // if(n<=1){
    // return false;
    // }
    // for (int i = 2; i < n; i++){
    // if (n % i == 0){
    // return false;
    // }
    // }
    // return true;
    // }

    // public static void main(String[] args){
    // Scanner sc = new Scanner(System.in);
    // int number = sc.nextInt();
    // if (isPrime(number)){
    // System.out.println(number + " is a Prime no.");
    // }else{
    // System.out.println(number + " is not a Prime no.");
    // }
    // }

    // 2. check Even or not
    // static boolean isEven(int n){
    // if(n % 2 ==0){
    // return true;
    // }else{
    // return false;
    // }
    // }

    // public static void main(String[] args){
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter no : ");
    // int num = sc.nextInt();
    // if (isEven(num)){
    // System.out.println(num + " is a Even no.");
    // }else {
    // System.out.println(num + " is not a Even no.");
    // }
    // }

    // 3. Print Table
    // public static void printTable(int n){
    // for (int i = 1; i < 11; i++){
    // System.out.println(n + " x " + i + " = " + n*i);
    // }
    // }
    // public static void main(String[] args){
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter no: ");
    // int num = sc.nextInt();
    // printTable(num);
    // }

    // 4. Enter 3 numbers from the user & make a function to print their average.
    // public static double printAvg(Double a, Double b, Double c){
    // return (a + b + c) / 3;
    // }
    // public static void main(String[] args){
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter 1st no.: ");
    // Double num1 = sc.nextDouble();
    // System.out.print("Enter 2nd no.: ");
    // Double num2 = sc.nextDouble();
    // System.out.print("Enter 3rd no.: ");
    // Double num3 = sc.nextDouble();
    // System.out.print("Avg is " + printAvg(num1, num2, num3));
    // }

    // 5. Write a function to print the sum of all odd numbers from 1 to n.
    // public static int sumOdd(int n){
    // int odd = 0;
    // if (n % 2 == 0){
    // for (int i = 1; i < n; i = i + 2){
    // odd = odd + i;
    // }
    // }else{
    // for (int i = 1; i < n+1; i = i + 2){
    // odd = odd + i;
    // }
    // }

    // return odd;
    // }
    // public static void main(String[] args){
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter last no.: ");
    // int num = sc.nextInt();
    // System.out.print("Sum of all odd no.s till " + num + " is " + sumOdd(num));
    // }

    // 6.Write a function which takes in 2 numbers and returns the greater of those
    // two.
    // public static int printGreater(int a, int b){
    // if (a > b){
    // return a;
    // }else{
    // return b;
    // }
    // }
    // public static void main(String[] args){
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter 1st no.: ");
    // int num1 = sc.nextInt();
    // System.out.print("Enter 2nd no.: ");
    // int num2 = sc.nextInt();
    // System.out.print("Greater among " + num1 + " & " + num2 + " is " +
    // printGreater(num1, num2));
    // }

    // 7.Write a function that takes in the radius as input and returns the
    // circumference of a circle.
    // public static double paraCircle(double r){
    // double circum = ((2 * 3.14) * r);
    // return circum;
    // }
    // public static void main(String[] args){
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter radius : ");
    // int rad = sc.nextInt();
    // System.out.print("Circumference of the circle with radius " + rad + " is " +
    // paraCircle(rad));
    // }

    // 8. Write a function that takes in age as input and returns if that person is
    // eligible to vote or not. A person of age > 18 is eligible to vote.
    // static boolean eligibleToVote(int a){
    // if(a >= 18){
    // return true;
    // }else {
    // return false;
    // }
    // }
    // public static void main(String[] args){
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter age : ");
    // int age = sc.nextInt();
    // if (eligibleToVote(age)){
    // System.out.print("You are eliglible to vote");
    // }else{
    // System.out.print("You are not eligible to vote");
    // }
    // }

    // 9. Write an infinite loop using do while condition.
    // public static void infiniteDoWhile(){
    // int i = 1;
    // do{
    // System.out.println(i);
    // i++;

    // } while( i > 0);
    // }
    // public static void main(String[] args){
    // infiniteDoWhile();
    // }

    // 10. Write a program to enter the numbers till the user wants and at the end
    // it should display the count of positive, negative and zeros entered.
    // public static void main(String[] args){
    // Scanner console = new Scanner(System.in);

    // int number,
    // countPositive = 0,
    // countNegative = 0,
    // countZero = 0;

    // char choice;

    // do
    // {
    // System.out.print("Enter the number ");
    // number = console.nextInt();

    // if(number > 0)
    // {
    // countPositive++;
    // }
    // else if(number < 0)
    // {
    // countNegative++;
    // }
    // else
    // {
    // countZero++;
    // }

    // System.out.print("Do you want to continue y/n? ");
    // choice = console.next().charAt(0);

    // }while(choice=='y' || choice == 'Y');

    // System.out.println("Positive numbers: " + countPositive);
    // System.out.println("Negative numbers: " + countNegative);
    // System.out.println("Zero numbers: " + countZero);
    // }

    // 11. Two numbers are entered by the user, x and n. Write a function to find
    // the value of one number raised to the power of another i.e. x^n.
    // public static void printPower(double x, double y){
    // System.out.println(Math.pow(x, y));
    // }
    // public static void main(String args[])
    // {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter no. : ");
    // double a = sc.nextDouble();
    // System.out.print("Enter no. you want as power : ");
    // double b = sc.nextDouble();
    // printPower(a, b);
    // }

    // 12. Fibonacci Series
    // public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();

    // int a = 0, b = 1;

    // System.out.print(a + " ");

    // if (n > 1) {
    // // find nth term
    // for (int i = 2; i <= n; i++) {
    // System.out.print(b + " ");
    // // the concept below is called swapping
    // int temp = b;
    // b = a + b;
    // a = temp;
    // }
    // System.out.println();
    // }
    // }

    // 13. GCD
    // public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // int n1 = sc.nextInt();
    // int n2 = sc.nextInt();

    // while(n1 != n2) {
    // if(n1>n2) {
    // n1 = n1 - n2;
    // } else {
    // n2 = n2 - n1;
    // }
    // }
    // System.out.println("GCD is : "+ n2);
    // }

}
