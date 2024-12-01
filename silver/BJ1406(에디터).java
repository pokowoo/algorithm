import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BJ1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       String inputString = br.readLine();
       int N = Integer.parseInt(br.readLine());

       Stack<Character> leftString = new Stack<>();
       Stack<Character> rightString = new Stack<>();
       for (int i = 0; i < inputString.length(); i++) {
           char ch = inputString.charAt(i);
           leftString.push(ch);
       }
       for (int i = 0; i < N ; i++) {
           StringTokenizer st = new StringTokenizer(br.readLine());
           String s = st.nextToken();
           if(s.equals("L")){
               if(leftString.isEmpty()){
                   continue;
               }
               else {
                   rightString.push(leftString.pop());
               }
           }
           else if(s.equals("D")){
               if(rightString.isEmpty()){
                   continue;
               }
               else {
                   leftString.push(rightString.pop());
               }
           } else if (s.equals("B")) {
               if(leftString.isEmpty()){
                   continue;
               }
               else {
                   leftString.pop();
               }
           }
           else if(s.equals("P")) {
               String p = st.nextToken();
               leftString.push(p.charAt(0));
           }
       }
       StringBuilder sb = new StringBuilder();

       while(!leftString.isEmpty()){
           sb.append(leftString.pop());
       }
       sb.reverse();
       while(!rightString.isEmpty()){
           sb.append(rightString.pop());
       }
       System.out.println(sb);
    }
}
