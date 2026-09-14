import java.util.Scanner;

public class interest{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double principle; 
        double rate;
        int times_compounded; 
        int years;
        double amount_f;

        System.out.print("Enter the principle amount:  ");
        principle = scanner.nextDouble();

        System.out.print("Enter the the interest rate(in percentage form): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of times this should be compounded: ");
        times_compounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        amount_f = principle * Math.pow(1 + rate/times_compounded ,times_compounded * years);

        System.out.printf("The amount after %d years is: %.2f", years, amount_f);

        scanner.close();
    }
} 