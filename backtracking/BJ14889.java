package org.example.silver.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ14889 {
    static int[][] field;
    static boolean[] employee;
    static int N;
    static int minNum = Integer.MAX_VALUE;

    static void dfs(int index, int count){
        if(count == N/2){
            calculateDifference();
            return;
        }
        if(index >= N){
            return;
        }
        employee[index] = true;
        dfs(index+1, count+1);
        employee[index] = false;
        dfs(index+1, count);
    }
    static void calculateDifference(){
        int startScore = 0;
        int linkScore = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(employee[i] && employee[j]){
                    startScore += field[i][j];
                }
                else if(!employee[j]&&!employee[i]){
                    linkScore += field[i][j];
                }
            }
        }
        int diff = Math.abs(startScore - linkScore);
        minNum = Math.min(minNum, diff);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        field = new int[N][N];
        employee = new boolean[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                field[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(0, 0);

        System.out.println(minNum);
    }

}
