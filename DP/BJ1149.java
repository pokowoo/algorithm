import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 집의 개수
        int[][] table = new int[N][3]; // 비용 테이블
        int[][] dp = new int[N][3]; // DP 테이블

        // 입력 받기
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                table[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 초기값 설정
        dp[0][0] = table[0][0];
        dp[0][1] = table[0][1];
        dp[0][2] = table[0][2];

        // DP 계산
        for (int i = 1; i < N; i++) {
            dp[i][0] = table[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = table[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = table[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);
        }

        // 최솟값 출력
        System.out.println(Math.min(dp[N - 1][0], Math.min(dp[N - 1][1], dp[N - 1][2])));
    }
}
