
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ1373 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == '0'){
                stack.push(0);

            }
            else if(input.charAt(i) == '1'){
                stack.push(1);

            }
        }
        Stack<Integer> result = new Stack<>();

        while(!stack.isEmpty()){
            int tmp = 0;
            for(int j = 0; j < 3; j++){
                if(stack.isEmpty()){
                    break;
                }
                tmp += stack.pop()*(int)(Math.pow(2,j));
            }
            result.push(tmp);
        }
        while (!result.isEmpty()){
            System.out.print(result.pop());
        }
    }
}
