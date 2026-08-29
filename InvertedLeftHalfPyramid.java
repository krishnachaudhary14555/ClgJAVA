import java.util.*;
public class InvertedLeftHalfPyramid {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter row numbers : ");
        int n = sc.nextInt();
        int spaces =0 , i, j;
        for(i=1; i<=n; i++){
            //spaces
            for(j =1;j<=spaces; j++){
                System.out.print(" "+" ");
            }
            int stars = n-i+1;
            for(j =1; j<=stars; j++){
                System.out.print("*"+" ");
            }
            spaces++;
            stars--;
System.out.println();
        }
        sc.close();
    }
}
