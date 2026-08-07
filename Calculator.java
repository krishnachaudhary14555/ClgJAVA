package ClgJAVA;
import java.util.*;

public class Calculator {
    public static void main(String args[]){
Scanner sc= new Scanner(System.in);
    int num1 , num2 ;
    System.out.println("Enter the value of num1 :");
    num1= sc.nextInt();
    System.out.println("Enter the value of num2 :");
   num2= sc.nextInt();
   System.out.println("Sum of "+num1+" and "+num2+"is: "+(num1+num2));
   System.out.println("Difference of "+num1+" and "+num2+"is: "+(num1-num2));
   System.out.println("Multiply of "+num1+" and "+num2+"is: "+(num1*num2));
   System.out.println("Divide of "+num1+" and "+num2+"is: "+(num1/num2));
   sc.close();


    }
    
   

    }

