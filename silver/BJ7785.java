package org.example.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashSet <String> names = new HashSet <> ();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String IO = st.nextToken();

            if(IO.equals("enter")){
                    names.add(name);
            }
            else{
                names.remove(name);
            }
        }
        List<String> list = new ArrayList<>(names);
        Collections.sort(list, Collections.reverseOrder());
        for (String name : list) {
            System.out.println(name);
        }

    }
}
