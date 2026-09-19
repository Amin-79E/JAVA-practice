import java.util.Scanner;
import java.util.Random;

public class numberGuessing{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int attempts = 0;
        int randomNum = random.nextInt(1, 101);

        System.out.println("Enter any number between 1 and 100, so you can guess the winning number: ");
        do{
        
            guess = scanner.nextInt();

            attempts++;

            if(guess > randomNum){
                System.out.println("No, go lower.");
            }
            else if(guess < randomNum ){
                System.out.println("No, go higher.");
            }

        }while(guess != randomNum );


        if( attempts == 1){
            System.out.println("You WON at first attempt.");
        }
        else{
        System.out.printf("You Won!, after %d attempts.\n", attempts);
        }

        scanner.close();
    }
}