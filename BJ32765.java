package org.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BJ32765 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(0,X));

        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            int id = Integer.parseInt(st.nextToken());
            int salary = ((employees.get(i).getSalary() / id) + 1) * id;

            Employee employee = new Employee(id,salary);
            employees.add(employee);
        }
        for (int i = 1; i < employees.size(); i++) {
            System.out.println(employees.get(i).getSalary());
        }


    }
}
class Employee{
    private int id;
    private int salary;
    public Employee(int id,int salary) {
        this.id = id;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }

}