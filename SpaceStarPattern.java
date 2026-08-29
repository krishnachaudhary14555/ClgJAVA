import java.util.Scanner;

public class SpaceStarPattern {
     public static void main(String[] args){
Scanner sc= new Scanner(System.in);
        System.out.println("Enter n :");
        int n  = sc.nextInt();
        int stars = 1;
        
        for(int i=1 ; i<=n ; i++){
            //spaces
            int spaces = n-i;
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
            stars++;
            spaces--;
            System.out.println();
        }
        sc.close();
    }
}

/*
     *
    **
   ***
  ****
 *****
  */