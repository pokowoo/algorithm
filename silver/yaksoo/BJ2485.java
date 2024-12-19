package org.example.silver.yaksoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BJ2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        list.sort(Integer::compareTo);
        int[] distance = new int[N-1];
        for (int i = 0; i < N-1; i++) {
            distance[i] = list.get(i+1)-list.get(i);
        }
        int gcd = distance[0];
        for (int i = 1; i < N-1; i++) {
            gcd = getGCD(gcd, distance[i]);

        }
        int count = 0;
        for (int i = 0; i < N-1; i++) {
            count += distance[i]/gcd-1;
        }
        System.out.println(count);

    }
    static int getGCD(int a, int b) {
        int c = a % b;
        if (c == 0) {
            return b;
        }
        return getGCD(b, c);
    }
}
