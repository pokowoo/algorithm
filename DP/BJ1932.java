package org.example.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1932 {
    static int[][] DP=new int[600][600];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] triangle = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < i+1; j++) {
                triangle[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int[][] reversed = new int[N+1][N+1];
        int index = 0;
        for (int i = N; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                reversed[index][j] = triangle[i-1][j];
            }
            index++;
        }

        for (int i = 0; i < N; i++) {
            DP[0][i]=reversed[0][i];
        }

        index = 0;
        for (int i = N-1; i > 0; i--) {
            index++;
            for (int j = 0; j <i; j++) {
                DP[index][j]=Math.max(DP[index-1][j]+reversed[index][j],DP[index-1][j+1]+reversed[index][j]);
            }

        }
        System.out.println(DP[N-1][0]);
    }
}
