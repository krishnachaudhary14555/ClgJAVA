
import java.util.*;
public class GreatestSmallestArrayEle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Elements size of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter the "+(i+1)+" element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array : "+Arrays.toString(arr));
        int smallest = arr[0];
        int greatest= arr[0];
        for(int i=0; i<size; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
        }
        if(arr[i] > greatest){
            greatest = arr[i];
        }
        }
        System.out.println("Smallest Element : "+smallest);
        System.out.println("Greatest Element : "+greatest);
        sc.close();

    }
    
}
