import java.util.Scanner;

public class Rectangle_area {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    double width = 0;
    double height = 0;
    double area = 0;

    System.out.println("This program will calculate the area of a rectangle, based on the inputs you provide.");
    System.out.print("Enter the width of the rectangle: ");
    width = scanner.nextDouble();

    if(width <=0){
        System.out.println("Invalid input.");
        scanner.close();
        return;
    }
        
    System.out.print("Enter the height of the rectangle: ");
    height = scanner.nextDouble();

    area = height*width;

    System.out.printf("The area of the rectangle is: %f ", area);

    scanner.close();
    }
}
