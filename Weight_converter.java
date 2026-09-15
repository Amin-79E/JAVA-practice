import java.util.Scanner;

public class weight_converter{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int choice;
        double original;
        double converted;

        System.out.println("This program will convert any weight from kg to lb, or vice versa, please proceed to choose form the options below:");
        System.out.println("Enter 1 if you wish to convert from kg to lb: ");
        System.out.println("Enter 2 if you wish to convert form lb to kg: ");

        choice = scanner.nextInt();

        System.out.println("Enter the weight: ");
        original = scanner.nextDouble();

        if(original <= 0 ){
            System.out.println("Invalid input.");
        }

        if(choice >2 || choice <1 ){
            System.out.println("Invalid choice.");
        }
        else if(choice == 1){
           converted = original * 2.20462;
           System.out.printf("The weight provided, is equivalent to %.3f in lb.\n", converted);
        }
        else {
            converted = original / 2.20462;
            System.out.printf("The weight provided is equivalent to %.3f in kg.\n", converted);
        }
        scanner.close();
    }
}