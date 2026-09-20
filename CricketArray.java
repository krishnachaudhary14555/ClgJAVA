import java.util.*;
public class CricketArray {
    public static void main(String[] args) {
        int carr[] = new int[6];
        int dot =0, totalruns=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the runs scored by 6 players : ");
        for(int i=0; i<6; i++){
            System.out.print("Ball "+(i+1)+" : ");
            carr[i] = sc.nextInt();
            totalruns += carr[i];
            if(carr[i] ==0){
                dot++;
            }
        }
        System.out.println("Number of dots : "+dot);
        System.out.println("Total runs scored: "+totalruns);
        sc.close();
    }

    
}
