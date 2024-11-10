package org.example;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Stack stack = new Stack();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt( st.nextToken() );
            switch (a){
                case 1:
                    int b = Integer.parseInt( st.nextToken() );
                    stack.push(b);
                    break;
                case 2:
                    System.out.println(stack.pop());
                    break;
                case 3:
                    System.out.println(stack.getSize());
                    break;
                case 4:
                    System.out.println(stack.emp());
                    break;
                case 5:
                    System.out.println(stack.print());
                    break;


            }


        }

    }
}
public class Stack {
    public int i = 0;
    public int[] stack = new int[1000000];

    private ArrayList<Integer> stackList;

    public void push(int num){
        stack[i++] = num;

    }

    public int pop(){
        if(i>0){
            return stack[--i];
        }
        else {
            return -1;
        }


    }
    public int getSize(){
        return i;

    }
    public int emp(){
        if (i>0){
            return 0;
        }
        else return 1;
    }
    public int print(){
        if (i>0){
            return stack[i-1];
        }
        else return -1;
    }



}