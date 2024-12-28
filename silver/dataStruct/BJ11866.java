package org.example.silver.dataStruct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> q = new LinkedList<Integer>();
        StringBuilder res = new StringBuilder();
        res.append("<");
        for (int i = 1; i <= N; i++) {
            q.add(i);
        }
        while (!q.isEmpty()) {
            for (int i = 1; i < K; i++) {
                int x = q.poll();
                q.add(x);
            }
            res.append(q.poll());
            if (!q.isEmpty()) {
                res.append(", ");
            }
        }
        res.append(">");
        System.out.println(res.toString());
    }
}
