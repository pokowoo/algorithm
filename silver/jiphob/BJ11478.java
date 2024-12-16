package org.example.silver.jiphop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BJ11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            int k = 0;
            for (int j = input.length() - 1; j >= i; j--) {
                set.add(input.substring(k,k+i+1));

                k++;
            }

        }
        System.out.println(set.size());
    }
}
