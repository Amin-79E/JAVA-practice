import java.util.Scanner;

public class MAD_LIBS {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String adjective2;
        String adjective3;
        String noun1;
        String verb;

        System.out.print("Enter an adjective: ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun(Animal or person): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter another adjective: ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb(Ending with ing): ");
        verb1 = scanner.nextLine();
        System.out.print("Enter another adjective: ");
        adjective3 = scanner.nextLine();
        
        System.out.println("\nToday i went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, i saw a " + noun1 + ".");
        System.out.println("The" + noun1+ " was " + adjective2 + " and " + verb + "!");
        System.out.println("I was " + adjective3 + "!");

        scanner.close();
    }
}
