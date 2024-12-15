package org.example.silver.jiphop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<Integer> hsA = new HashSet<>();
        HashSet<Integer> hsB = new HashSet<>();
        String A = br.readLine();
        String B = br.readLine();

        String[] arrA = A.split(" ");
        String[] arrB = B.split(" ");
        int count = 0;
        int[] intA = new int[N];
        int[] intB = new int[M];
        for (int i = 0; i < N; i++) {
            intA[i] = Integer.parseInt(arrA[i]);
        }
        for (int i = 0; i < M; i++) {
            intB[i] = Integer.parseInt(arrB[i]);
        }
        for (int i = 0; i < N; i++) {
            hsA.add(intA[i]);
        }
        for (int i = 0; i < M; i++) {
            hsB.add(intB[i]);
        }
        int mA = 0;
        int mB = 0;
        for (int i = 0; i < N; i++) {
            if (hsB.contains(intA[i])) {
                mB++;

            }
        }
        for (int i = 0; i < M; i++) {
            if (hsA.contains(intB[i])) {
                mA++;

            }
        }
        System.out.println(N+M-mB-mA);




    }
}
