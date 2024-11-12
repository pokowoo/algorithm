import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.SyncFailedException;
import java.util.*;

public class Dancing {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count=0;
        Map<String, org.example.Person> people = new HashMap<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String P1 = st.nextToken();
            String P2 = st.nextToken();
            people.putIfAbsent(P1, new org.example.Person(P1));
            people.putIfAbsent(P2, new org.example.Person(P2));
            org.example.Dance.meet(people.get(P1),people.get(P2));
        }
        for (org.example.Person p : people.values()) {
            if(p.getDance()){
                count++;
            }
        }
        System.out.println(count);






    }
}
class Person{
    String name="";
    boolean dance=false;
    public Person(){}
    public Person(String name){
        this.name=name;
        if(this.name.equals("ChongChong")){
            dance=true;
        }
    }
    public void setDance(boolean dance){
        this.dance=dance;
    }
    public boolean getDance(){
        return dance;
    }
}
class Dance{

    public static void meet(org.example.Person person1, org.example.Person person2) {
        if (person1.getDance() || person2.getDance()) {
            person1.setDance(true);
            person2.setDance(true);
        }
    }

}