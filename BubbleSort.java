import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i=0; i<size;i++){
            System.out.print("Enter element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array : "+Arrays.toString(arr));
        for(int i=0; i<size-1; i++){
           
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("Sorted Array : "+Arrays.toString(arr));
        sc.close();
    }
}
