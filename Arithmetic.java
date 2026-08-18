
//WAP to perform basic Arithmetic operators based on user input ,use switch to select the arithmetic operation
import java.util.*;
public class Arithmetic {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Number :");
        int n1 = sc.nextInt();
        System.out.println("Enter Second Number :");
        int n2 = sc.nextInt();
        System.out.println("Enter Valid operator :");
        int op = sc.next().charAt(0);
        int result;
        switch(op){
            case '+': result = n1+n2;
            System.out.println("Addition of " +n1+ " and " + n2+ " is : "+result );
            break;
             case '-': result = n1-n2;
            System.out.println("Difference of " +n1+ " and " + n2+ " is : "+result );
            break;
             case '*': result = n1*n2;
            System.out.println("Multiplication of " +n1+ " and " + n2+ " is : "+result );
            break;
             case '/': if(n2 == 0){
                System.out.println("Infinitive");
             }else{
                result = n1 / n2;
                System.out.println("Addition of " +n1+ " and " + n2+ " is : "+result );
             }
               break;
               default:
                System.out.println("Invalid Operator.");
            
        }
        sc.close();
    }
}
