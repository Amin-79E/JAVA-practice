import java.util.Scanner;

public class valid_email{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    String email;
    String username;
    String domain;

    System.out.print("Enter your email: ");

    email = scanner.nextLine();

    if( email.contains("@")){
        username = email.substring(0 ,email.indexOf("@"));
        domain = email.substring(email.indexOf("@") + 1);

        System.out.println("The username: " + username);
        System.out.println("The domain: " + domain);
    }
    else{
        System.out.println("Emails must contain the @ symbol.");
    }

    scanner.close();
    }
}