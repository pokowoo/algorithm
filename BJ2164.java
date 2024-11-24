package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class BJ2164 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> q = new ArrayDeque<Integer>();
        for (int i = 1; i <= N; i++) {
            q.add(i);
        }
        while (q.size()!=1) {
            q.poll();
            int a = q.poll();
            q.add(a);
        }
        System.out.println(q.poll());

    }
}
