// import java.io.Console;
import java.util.*;
public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attempts = 3;
        int pwd = 4545;
        for (int i = 1; i <= attempts; i++) {
            System.out.println("Enter password:");
            int password = sc.nextInt();
            if (pwd == password) {
                System.out.println("You can access.");
                break;
            } else {
                attempts--;
                if (attempts == 0) {
                    System.out.println("Attempts limit exceeded. Try again after some time.");
                    System.exit(0);
                } else {
                    System.out.println("Wrong password.");
                    System.out.println("Attempts remaining: " + attempts);
                }
            }
        }
        sc.close();
    }
}