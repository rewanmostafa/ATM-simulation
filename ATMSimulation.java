
package atm.simulation;

import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance = 5000.0;

        int option;
        do {
            display();
            System.out.print("Choose an option (1-4): ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    
                    System.out.print("Enter the withdrawal amount: ");
                    double withdraw = input.nextDouble();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful. Remaining balance: " + balance);
                    } else {
                        System.out.println("Insufficient funds. Withdrawal failed.");
                    }
                    break;
                case 2:
                    
                    System.out.print("Enter the deposit amount: ");
                    double deposit = input.nextDouble();
                    balance += deposit;
                    System.out.println("Deposit successful. New balance: " + balance);
                    break;
                case 3:
                    
                    System.out.println("Your current balance: " + balance);
                    break;
                case 4:
                    
                    System.out.println("Exiting ATM program. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (option != 4);

    }

    private static void display() {
        System.out.println("ATM Menu:");
        System.out.println("1. Withdraw Money");
        System.out.println("2. Deposit Money");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }


}