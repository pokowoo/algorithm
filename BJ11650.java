package org.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ11650
{
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        List<xyset> xysets = new ArrayList<xyset>();

        for(int i = 0 ; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            xysets.add(new xyset(x,y));
        }


        Collections.sort(xysets);



        for(int i = 0 ; i < xysets.size(); i++){
            System.out.println(xysets.get(i).x + " " + xysets.get(i).y);
        }


    }
}
class xyset implements Comparable<xyset>{
    int x;
    int y;

    public xyset(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(xyset o) {
        if (this.x != o.x) {
            return this.x - o.x; // x값이 다르면 x값으로 정렬
        }
        return this.y - o.y; // x값이 같으면 y값으로 정렬
    }
}