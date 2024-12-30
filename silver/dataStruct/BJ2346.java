import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BJ2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Point> stack = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            int a = Integer.parseInt(st.nextToken());
            int b = i;
            Point p = new Point(a, b);
            stack.addLast(p);

        }
        for (int i = 0; i < N-1; i++) {


            Point p = stack.removeFirst();
            sb.append(p.y);
            sb.append(" ");

            if(p.x>0){
                for(int j=0;j<p.x-1;j++){
                    Point pj = stack.pollFirst();
                    stack.addLast(pj);

                }
            }
            else {
                for(int j=p.x;j<0;j++){
                    Point pj = stack.pollLast();

                    stack.addFirst(pj);
                }
            }

        }
        sb.append(stack.pollFirst().y);


        System.out.println(sb);
    }
}
