package org.example.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;

public class BJ20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String,Integer> frequencyMap  = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if(str.length()>=M){
                frequencyMap .put(str,frequencyMap.getOrDefault(str,0)+1);
            }
        }
        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(frequencyMap.entrySet());
        entryList.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(o1.getValue()<o2.getValue()){
                    return 1;
                }
                else if(o1.getValue()>o2.getValue()){
                    return -1;
                }
                else{
                    if(o1.getKey().length()<o2.getKey().length()){
                        return 1;
                    }
                    else if(o1.getKey().length()>o2.getKey().length()){
                        return -1;
                    }
                    else{
                        if(o1.getKey().compareTo(o2.getKey())==0){
                            return 0;
                        }
                        else if(o1.getKey().compareTo(o2.getKey())>0){
                            return 1;
                        }
                        else{
                            return -1;
                        }
                    }

                }
            }
        });
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey());
        }

    }
}
