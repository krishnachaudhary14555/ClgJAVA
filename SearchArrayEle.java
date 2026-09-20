import java.util.*;
public class SearchArrayEle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size= sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter elements of array:");
        for(int i=0; i<size; i++){
              System.out.print("Enter element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array: "+Arrays.toString(arr));
        System.out.print("Enter the target Element: ");
        boolean found = false;
        int search = sc.nextInt();
        for(int i=0; i<size; i++){
             if(arr[i] == search){
                System.out.print("Element found at index "+i);
                found = true;
                break;
             } 
        }
        if(found== false){
            System.out.println("Element not found.");
        }       
        sc.close();      
    }
}
