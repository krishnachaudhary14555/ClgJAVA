
import java.io.*;
public class SimpleCal {
    public static void main(String[] args) throws IOException{
        int num1,num2,option=-1;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\tWelcome to the Simple Calculator");
        System.out.println("Select Your Option=>");
        System.out.println("1.Addition ");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        
        System.out.println("Enter First number:");
        num1 = Integer.parseInt(br.readLine());
        System.out.println("Enter Second number:");
        num2 = Integer.parseInt(br.readLine());
        System.out.println("Choose your Option");
        option=Integer.parseInt(br.readLine());

        switch(option){
            case 1:
                    System.out.println("Addition of "+num1+ " and "+num2+ " is "+(num1+num2));
                break;
            case 2:
                    System.out.println("Subraction of "+num1+ " and "+num2+ " is "+(num1-num2));
                break;
            case 3:
                    System.out.println("Multiplication of "+num1+ " and "+num2+ " is "+(num1*num2));
                break;
            case 4:
                if(num2!=0)
                    System.out.println("Division of "+num1+ " and "+num2+ " is "+(num1/num2));
                else
                    System.out.println("Number can not be Divide by 0.");
                break;
            case 5:
                System.out.println("Exit, You Entered 5.");
                System.exit(0);
                break;
            default:
                System.out.println("Wrong Choice");
            
        }
        
    }
}
