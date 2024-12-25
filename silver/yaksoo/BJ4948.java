package org.example.silver.yaksoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        while (N!=0){

            int[] data = createDecimalArr(N*2);
            int count=0;
            for(int i=N+1;i<=N*2;i++){
                if(data[i]!=0){
                    count++;
                }
            }
            System.out.println(count);
            N=Integer.parseInt(br.readLine());
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
