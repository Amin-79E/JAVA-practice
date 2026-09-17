import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double n1;
        double n2;
        char op;
        double result=0;

        System.out.println("This program will work as a calculator for two inputs of your choice.");
        System.out.println("Enter the operation you want to do(+ , - , * , / , ^): ");
        op = scanner.next().charAt(0);

        System.out.print("Enter the first number: ");
        n1 =scanner.nextDouble();

        System.out.print("Enter the second number: ");
        n2 = scanner.nextDouble();

        switch(op){

            case '+' -> result = n1 + n2;

            case '-' -> result = n1 - n2;

            case '*' -> result = n1 * n2;

            case '/' -> {if(n2 == 0 ){System.out.print("Can not divide by 0."); scanner.close(); return; } result = n1 / n2; }
        
            case '^' -> result = Math.pow(n1, n2);

            default -> { System.out.print("Not an operation."); scanner.close(); return; }
        }

        System.out.printf("The result of the operation is: %.4f\n", result);
        
        scanner.close();
    }
}