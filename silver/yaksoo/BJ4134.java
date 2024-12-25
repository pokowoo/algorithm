package org.example.silver.yaksoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BJ4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] nums = new long[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Long.parseLong(br.readLine());
        }
        for (int i = 0; i < N; i++) {
            System.out.println(getDecimal(nums[i]));
        }

    }
    static long getDecimal(long n) {
        if(isPrime(n))
            return n;
        else
            return getDecimal(n+1);

    }
    static boolean isPrime(long n) {
        if(n<2)
            return false;
        for (int i = 2; i<=Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
