
import java.util.*;
public class DoubleStarPyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int stars= 1; int i, j;
        for(i =1; i<=n; i++){
             int spaces = n-i;
             //spaces 
             for(j=1; j<=spaces; j++){
                System.out.print(" ");
             }
             spaces--;
             //stars
             for(j=1;j<=stars; j++){
                System.out.print("*");
             }
             stars+=2;
             System.out.println();
        }
        
       sc.close();
    }
}
