import java.util.Scanner;

public class circle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double radius;

        double circumference;
        double area;
        double volume;

        System.out.println("Enter the radius of the circle: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        System.out.print("The circumference: " + circumference + ", area: " + area + ", volume: " + volume + ".");

        scanner.close();
    }
}