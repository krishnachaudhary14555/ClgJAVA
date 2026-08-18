/*
Program 2: A movie theatre has the following ticket pricing rules: Children under 12 years old pay $5. Seniors 65 years and older pay $7. Regular adults (12-64 years old) pay $10. Members get a $2 discount on all ticket prices. We'll prompt the user to input their age and whether they have a membership card. Based on this input, the program will determine and print the ticket price.  */


import java.util.*;
// import java.io.*;
public class TicketPricing {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = sc.nextInt();
        sc.nextLine();
        int ticket_price=0;
        System.out.println("Enter your Membership (Yes / No) :");
        String membership = sc.nextLine();
        
        if(age <= 12){
            ticket_price = 5;
        }
        else if(age>12 && age < 65 ){
             ticket_price = 10;
        }
        else if( age >= 65){
            ticket_price = 7;
        }
        if(membership.equalsIgnoreCase("yes")){
            ticket_price = ticket_price - 2;
        }
        System.out.println("Ticket price : "+ticket_price);
        sc.close();
        

    }
}


