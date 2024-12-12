package org.example.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());
        HashMap<String,String> poketmons = new HashMap<>();
        for(int i = 1 ; i <= N ; i++ ){
            String poketmon = br.readLine();
            poketmons.put(poketmon, Integer.toString(i));

            poketmons.put(Integer.toString(i),poketmon);
        }
        for(int i = 1 ; i <= M ; i++ ){
            String input = br.readLine();
            try {
                Integer.parseInt(input);
                System.out.println(poketmons.get(input));
            } catch (NumberFormatException ex) {
                System.out.println(poketmons.get(input));
            }


        }

    }
}
