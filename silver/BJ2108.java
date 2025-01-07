package org.example.silver;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> map = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(br.readLine());
            sum += number;
            if (map.containsKey(number)) {
                map.put(number, map.get(number) + 1);
            }
            else {
                map.put(number, 1);
            }
        }
        LinkedList<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());

        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        System.out.println(Math.round((float)sum/N));



        System.out.println(keys.get(keys.size()/2));

        entryList.sort(((o1, o2) -> map.get(o2.getKey()) - map.get(o1.getKey())));
        int max = entryList.get(0).getValue();
        int[] nums = new int[N];
        int index = 0;

        for(int i=0;i<entryList.size();i++) {
            if(entryList.get(i).getValue() == max) {
                nums[index] = entryList.get(i).getKey();
                index++;
            }
        }
        Arrays.sort(nums);

        if(nums.length==1){
            System.out.println(nums[0]);
        }
        else{
            System.out.println(nums[1]);
        }
        System.out.println(keys.get(keys.size()-1)-keys.get(0));




    }
}
