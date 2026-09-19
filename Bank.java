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
        
    static void showBalance(double balance){
       System.out.printf("The account has: $ %.2f\n", balance);
    }

    static double deposit(){
    
        double amount;
        System.out.print("Enter the amount to be deposited: ");
        do{
            amount = scanner.nextDouble(); 
            if(amount <= 0){
                System.out.print("Invalid input, try again for a real amount: ");
            }
        }while(amount <= 0);

        return amount;
    }
        scanner.close();
    }

    
}
