package org.example.silver.dataStruct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue q = new Queue(N);
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < N; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch (s) {
                case "push":
                    int a = Integer.parseInt(st.nextToken());
                    q.push(a);
                    break;
                case "pop":
                    int b=q.pop();
                    res.append(b);
                    res.append("\n");
                    break;
                case "size":
                    int c=q.getSize();
                    res.append(c);
                    res.append("\n");
                    break;
                case "empty":
                    int d = q.isEmpty();
                    res.append(d);
                    res.append("\n");
                    break;
                case "front":
                    int e = q.getFront();
                    res.append(e);
                    res.append("\n");
                    break;
                case "back":
                    int f = q.getRear();
                    res.append(f);
                    res.append("\n");
                    break;
            }


        }
        System.out.println(res);
    }

}
class Queue {
    int front, rear;
    int size;
    int capacity;
    int[] arr;
    Queue(int capacity) {
        front = rear = 0;
        size = 0;
        this.capacity = capacity;
        arr = new int[capacity];
    }
    public void push(int x) {
        if (size == capacity) {
            System.out.println("Queue is full");
        }
        else {
            arr[rear] = x;
            rear = (rear + 1) % capacity;
            size++;
        }
    }

    public int pop() {
        if (size == 0) {
            return -1;
        }
        else {

            front = (front + 1) % capacity;
            size--;
            return arr[front-1];
        }

    }
    public int getSize() {
        return size;
    }
    public int isEmpty() {
        if (size == 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
    public int getFront(){
        if (size == 0) {
            return -1;
        }
        else {
            return arr[front];
        }
    }
    public int getRear(){
        if (size == 0) {
            return -1;
        }
        else {
            return arr[rear-1];
        }
    }



}
