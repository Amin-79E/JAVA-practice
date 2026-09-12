import java.util.Scanner;

public class shopping_cart {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       String item;
       double price;
       int quantity;
       char currency = '$';
       double total;

       System.out.print("List item would you like to purchase: ");
       item = scanner.nextLine();

       System.out.print("Enter the price written on it's price tag: ");
       price = scanner.nextDouble();

       System.out.print("Enter how many would you like of this item: ");
       quantity = scanner.nextInt();

       total = price * quantity;
       System.out.print("Your total is: " + total + currency);
       
       scanner.close();
    }
}