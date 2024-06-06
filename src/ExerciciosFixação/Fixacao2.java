package ExerciciosFixação;

import java.util.Scanner;

public class Fixacao2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Account account;


        System.out.print("Enter account number: ");
        int number = scanner.nextInt();
        System.out.print("Enter account holder: ");
        scanner.nextDouble();
       String holder = scanner.nextLine();
        System.out.print("IS there an initial deposit (y/n)? ");
        char response = scanner.next().charAt(0);
            if (response == 'y'){
                System.out.println("Enter initial deposit value: ");
                double initialDeposit = scanner.nextDouble();
                account = new Account(number, holder, initialDeposit);
            }else {
                account = new Account(number, holder );
            }
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.println("Enter a deposit value: ");
        double depositValue = scanner.nextDouble();

    }
}
