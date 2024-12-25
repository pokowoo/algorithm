package org.example.silver.yaksoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[M+1];
        arr = createDecimalArr(M);
        for (int i = N; i < M+1; i++) {
            if(arr[i]!=0){
                System.out.println(arr[i]);
            }
        }
    }
    static int[] createDecimalArr(int M) {
        int[] arr = new int[M+1];
        for (int i = 1; i < M+1; i++) {
            arr[i] = i;
        }
        arr[1]=0;
        for (int i = 2; i <= M+1; i++) {
            for(int j=i*2;j<=M;j+=i){
                arr[j]=0;
            }
        }
        return arr;

    }
}
