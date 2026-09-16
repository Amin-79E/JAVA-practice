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
        if(radius <=0){
            System.out.print("Invalid input");
            scanner.close();
            return;
        }

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3); // aproperty of a sphere, yet used here purley for educational value.

        System.out.printf("The circumference: %,2f ,the area: %.2f ,the volume: %.2f \n", circumference  , area , volume);

        scanner.close();
    }
}
