public class cyclicrotate{
    public static void rotate(int arr[]){
        int x=arr[arr.length-1];
        for(int i=arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = x;
        System.out.print("Rotated array is\n");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        System.out.print("Given array is \n");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        rotate(arr);

    }
}