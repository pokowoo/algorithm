package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ2217 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> ropes = new ArrayList<Integer>(N);

        for (int i = 0; i < N; i++) {
            ropes.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(ropes);
        int max= 0;
        for (int i = 0; i < ropes.size(); i++) {
            if(max<ropes.get(i)*(ropes.size()-i)){
                max=ropes.get(i)*(ropes.size()-i);

            }
        }
        System.out.println(max);


    }
}
