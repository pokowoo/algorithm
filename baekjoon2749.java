package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2749 {
    static long[] fibo;
    static int mod = 1000000;
    static final int pisano = 15 * 100000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());

        N %= pisano;
        fibo = new long[(int) N + 1];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i <= N; i++) {
            fibo[i] = (fibo[i - 1] + fibo[i - 2]) % 1000000;
        }
        System.out.println(fibo[(int) N]);
    }
}
