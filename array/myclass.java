 
import java.util.Scanner;
public class myclass{
  
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        // input array size
        System.out.println("enter the size of array");
        int n =sc.nextInt();
        int[] arr=new int[n];

        // enter array element 
        System.out.println("please enter element in array");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        // enter k'th element  
         System.out.println("enter k'th element");
         int k=sc.nextInt();

        //  sort the array
         for(int i=0; i<arr.length; i++){
             for(int j=i+1;  j<arr.length; j++){
                 if(arr[i] > arr[j]){
                     int temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;
                 }
             }
         }
        
        for(int i=0; i<arr.length; i++){
         System.out.print(arr[i]+" ");
        }
        System.out.print("k'th smallest element is "+arr[k-1]);
       
    }
}