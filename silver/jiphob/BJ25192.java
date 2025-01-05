import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashSet<String> hashSet = new HashSet<>();
        int count = 0;
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if(s.equals("ENTER")){
                count+=hashSet.size();
                hashSet.removeAll(hashSet);
            }
            else{
                hashSet.add(s);
            }
        }
        count+=hashSet.size();
        System.out.println(count);
    }
}
