package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        System.out.println("Enter the number of Fibonacci series:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println("Fibonacci result for "+ n + ":");
            System.out.println(fibonacci(n));
    }
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        else{
            return (fibonacci(n-1)+ fibonacci(n-2));
        }
    }
}
