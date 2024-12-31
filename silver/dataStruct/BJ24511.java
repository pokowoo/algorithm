
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Deque;

public class BJ24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 첫 번째 입력: N
        int[] isStack = new int[N];
        int[] stack = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine()); // isStack 배열 입력
        for (int i = 0; i < N; i++) {
            isStack[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine()); // stack 배열 입력
        for (int i = 0; i < N; i++) {
            stack[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine()); // 세 번째 입력: M
        int[] insertArray = new int[M];

        st = new StringTokenizer(br.readLine()); // insertArray 배열 입력
        for (int i = 0; i < M; i++) {
            insertArray[i] = Integer.parseInt(st.nextToken());
        }

        // 덱에 초기 상태를 저장 (isStack[i] == 0인 값들만)
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            if (isStack[i] == 0) {
                deque.addLast(stack[i]);
            }
        }

        // insertArray 처리
        StringBuilder sb = new StringBuilder();
        for (int value : insertArray) {
            deque.addFirst(value); // 새로운 값 삽입
            sb.append(deque.pollLast()).append(" "); // 마지막 값을 가져와 결과에 추가
        }

        System.out.println(sb.toString().trim()); // 최종 출력
    }
}
