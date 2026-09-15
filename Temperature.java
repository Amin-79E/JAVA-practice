import java.util.Scanner;

public class Temperature{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double temp;
        double new_temp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.println("Convert to Celsius or Fahrenheit? (C or F ): ");
        unit = scanner.next().toUpperCase();

        int length = unit.length();
        if(length == 0 || length > 1){
            System.out.println("Invalid input.");
            scanner.close();
            return;
        }

        if (unit.equals("C") || unit.equals("F") ){

        new_temp = (unit.equals("C")) ? (temp - 32) * 5/9 : temp*9/5 + 32;

        System.out.printf("The equivalent temperature in the other measuring system is: %.2f\n", new_temp);
        }
        else{
            System.out.println("No valid temperature unit has been provided.");
            scanner.close();
            return;
        }

        scanner.close();
    }
}