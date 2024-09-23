package Vetores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();


            System.out.println("How may employees will be registered? ");
            int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);
            list.add(emp);
        }
        System.out.print("Enter the employee id that will have salary increase :  ");
        int IsSalary = sc.nextInt();
        System.out.println(list);
    }
}
