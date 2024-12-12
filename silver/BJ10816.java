package org.example.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BJ10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] arr = new String[N];
        arr = str.split(" ");
        HashMap<String,Integer> hm = new HashMap<>();
        for (int i = 0; i < N; i++) {
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }
            else{
                hm.put(arr[i],hm.get(arr[i])+1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        String Mstr = br.readLine();
        String[] Marr = new String[M];
        Marr = Mstr.split(" ");
        for (int i = 0; i < M; i++) {

            if(!hm.containsKey(Marr[i])){
                System.out.println(0+" ");
            }
            else{
                System.out.println(hm.get(Marr[i])+ " ");
            }
        }

    }
}
