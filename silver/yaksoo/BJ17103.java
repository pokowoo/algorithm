package org.example.silver.yaksoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ17103 {

    // 소수 배열 생성 (에라토스테네스의 체)
    static boolean[] createPrimeArray(int max) {
        boolean[] isPrime = new boolean[max + 1];
        for (int i = 2; i <= max; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());

        // 500,000까지 소수 배열 생성
        int maxLimit = 1000004;
        boolean[] isPrime = createPrimeArray(maxLimit);

        StringBuilder result = new StringBuilder();
        for (int t = 0; t < testCases; t++) {
            int even = Integer.parseInt(br.readLine());
            int count = 0;

            // 두 소수의 합 계산 (중복 제거)
            for (int i = 2; i <= even / 2; i++) {
                if (isPrime[i] && isPrime[even - i]) {
                    count++;
                }
            }
            result.append(count).append("\n");
        }

        // 결과 출력
        System.out.print(result);
    }
}