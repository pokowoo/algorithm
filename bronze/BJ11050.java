
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int A = getFactorial(N);
        int B = getFactorial(K);
        int C = getFactorial(N-K);
        System.out.println(A / (B*C));
    }
    static int getFactorial(int N) {
        if(N == 0) return 1;
        else return N * getFactorial(N-1);
    }
}
