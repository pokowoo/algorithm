package org.example.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] strs = new String[N];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            strs[i] = s;
        }
        String baseStr = strs[0];
        for (int i = 1; i < N; i++) {
            for(int j = 0; j < strs[0].length(); j++){
                char ch = "?".charAt(0);
                if(baseStr.charAt(j) != strs[i].charAt(j)){
                    String front=baseStr.substring(0,j);
                    String back=baseStr.substring(j+1);
                    String midle = "?";
                    baseStr = front+midle+back;


                }
            }
        }
        System.out.println(baseStr);

    }
}
