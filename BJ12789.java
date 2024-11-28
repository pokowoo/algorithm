package org.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Stack;

public class BJ12789 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            q.add(Integer.parseInt(st.nextToken()));
        }
        Stack<Integer> s = new Stack<>();
        int count = 1;

        while (!q.isEmpty() || !s.isEmpty()) {  // 큐와 스택이 모두 비어야 종료
            if (!q.isEmpty() && q.peek() == count) {  // 큐의 맨 앞이 현재 순서라면 처리
                q.poll();
                count++;
            } else if (!s.isEmpty() && s.peek() == count) {  // 스택의 맨 위가 현재 순서라면 처리
                s.pop();
                count++;
            } else if (!q.isEmpty()) {  // 그렇지 않으면 큐에서 스택으로 이동
                s.push(q.poll());
            } else {  // 더 이상 처리할 수 없으면 "Sad" 출력
                System.out.println("Sad");
                return;
            }
        }

        // 모든 학생이 간식을 받았다면 "Nice" 출력
        System.out.println("Nice");
    }
}