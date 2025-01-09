package org.example.bronze.recursive;

import java.util.Scanner;

public class BJ27433 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(factorial(N));
    }
    public static int factorial(int n) {
        if (n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }
}
