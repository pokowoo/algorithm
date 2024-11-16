package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.SyncFailedException;
import java.util.*;

public class Tile1904 {
    static final int MOD = 15746;
    static int[] dp;

    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        int a= Integer.parseInt(br.readLine());


        dp= new int[a+1];
        dp[1]=1;
        if(a>=2){
            dp[2]=2;

        }
        System.out.println(tile(a));


    }


    static int tile(int a){
        if(dp[a]!=0){
            return dp[a];
        }
        return dp[a]=(tile(a-1)+tile(a-2))%MOD;
    }

}
