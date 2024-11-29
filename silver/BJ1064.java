package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import java.io.*;
import java.util.*;

public class BJ1064 {
    // 두 점 사이의 거리를 계산하는 메서드
    static double getDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // 세 점이 직선상에 있는지 확인하는 메서드
    static boolean isCollinear(int x1, int y1, int x2, int y2, int x3, int y3) {
        // 기울기의 비교를 곱셈 형태로 전환하여 부동소수점 오류 방지
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());
        int x3 = Integer.parseInt(st.nextToken());
        int y3 = Integer.parseInt(st.nextToken());

        // 세 점이 직선상에 있는 경우
        if (isCollinear(x1, y1, x2, y2, x3, y3)) {
            System.out.println("-1.0");
            return;
        }

        // 세 변의 길이를 계산
        double d1 = getDistance(x1, y1, x2, y2);
        double d2 = getDistance(x1, y1, x3, y3);
        double d3 = getDistance(x2, y2, x3, y3);

        // 가능한 둘레 계산
        double perimeter1 = 2 * (d1 + d2);
        double perimeter2 = 2 * (d2 + d3);
        double perimeter3 = 2 * (d3 + d1);

        // 최대값과 최소값 계산
        double maxPerimeter = Math.max(perimeter1, Math.max(perimeter2, perimeter3));
        double minPerimeter = Math.min(perimeter1, Math.min(perimeter2, perimeter3));

        // 결과 출력
        System.out.println(maxPerimeter - minPerimeter);
    }
}
