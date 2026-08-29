/*
     *
    ***
   *****
  *******
 
  */

import java.util.*;
public class DoublePyramid {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter row number: ");
        int n= sc.nextInt();
           int i, j;
        int star =1; 
      for(i=1; i<=n;i++){
        int spaces = n-i;
        
        for(j=1; j<=spaces; j++){
            System.out.print(" "+" ");
        }

        for(j=1; j<=star; j++){
            System.out.print("*"+" ");
        
        }
        
        star+=2;
        spaces--;
         
        System.out.println();
           
      }
      sc.close();
    }
}