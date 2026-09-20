// two diff size fo array , then conact those arrays , then sort the elements of thet array 
import java.util.*;
public class ConcatArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
     
        System.out.println("Enter the size of first array : ");
        int size1 = sc.nextInt();
        System.out.println("Enter the size of Second array : ");
        int size2 = sc.nextInt();

        int arr1[] = new int[size1];
        int arr2[] = new int[size2];

        System.out.println("\t Enter the elements of first array: ");
        for( int i=0; i<size1; i++){
            System.out.print("Enter the "+(i+1)+" Element : ");
            arr1[i] = sc.nextInt();
        }
        System.out.println("\t Enter the elements of Second array: ");
        for(int j=0; j<size2; j++){
            System.out.print("Enter the "+(j+1)+" Element : ");
            arr2[j] = sc.nextInt();
        }
        System.out.println("First Array : "+Arrays.toString(arr1));
        System.out.println("First Array : "+Arrays.toString(arr2));

        int n= arr1.length +arr2.length;
        int arr3[] = new int[n];
        for(int i=0; i<n; i++){
            if(i<arr1.length){
                arr3[i] = arr1[i];
            }
            else{
                arr3[i] = arr2[i-arr1.length];
            }
        }
        System.out.println("Merged Array : "+Arrays.toString(arr3));

       
        sc.close();


    }
    
}
