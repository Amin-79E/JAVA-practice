import java.util.Scanner;

public class hypotenuse {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("This program will calculate the hypotenuse of any triangle you enter. ");
        System.out.print("Enter the length of side a: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side b: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.print("The length of side c is: " + c);

        scanner.close();
    }
}