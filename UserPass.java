
import java.io.Console;
public class UserPass {
    public static void main(String[] args){
         Console console = System.console();
        if(console == null){
            System.out.println("Console is not Available");
            return;
        }
        char[] password = console.readPassword("Enter password:");
        int pass = Integer.parseInt(new String(password));
        System.out.println("Password Entered Successfully "+ pass);
    }
}
