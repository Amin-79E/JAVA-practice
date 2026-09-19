import java.util.Scanner;

public class Bank{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        double balance=0.0;
        boolean isRunning = true;
        int choice;

        while(isRunning){
        System.out.println("1. Show balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Quit");

        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        switch(choice){
        
            case 1 -> showBalance(balance);
            
            case 2 -> {balance += deposit(); System.out.printf("Your current balance is: %.2f\n", balance);} 

            case 3 -> balance = withdraw(balance);

            case 4 -> isRunning = false;

            default -> System.out.println("Not an option.");
        }
    }
        scanner.close();
    }

    
}