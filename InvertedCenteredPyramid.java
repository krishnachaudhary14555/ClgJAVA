import java.util.*;
public class InvertedCenteredPyramid {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter row number: ");
        int n= sc.nextInt();
           int i, j;
        int star =n; 
         int spaces = 0;
      for(i=1; i<=n;i++){
       
        
        for(j=1; j<=spaces; j++){
            System.out.print(" ");
        }
//stars
        for(j=1; j<=star; j++){
            System.out.print("* ");
        
        }
        
        star--;
        spaces++;
         
        System.out.println();
           
      }
      sc.close();
    }
}