// import java.util.Arrays;   
public class myclass{
  
    public static void main(String[] args){
        int arr[]={7,104,3,20,15};
         int k=3;
         for(int i=0; i<arr.length; i++){
             for(int j=i+1;  j<arr.length; j++){
                 if(arr[i] > arr[j]){
                     int temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;
                 }
             }
         }
        // Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
         System.out.print(arr[i]+" ");
        }
        System.out.print("k'th smallest element is "+arr[k+1]);
       
    }
}