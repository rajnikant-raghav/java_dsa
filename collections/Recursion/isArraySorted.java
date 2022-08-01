public class isArraySorted{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
     System.out.print(isArraySorted(arr,0));
    }
    public static boolean isArraySorted(int[] arr,int idx){
        if(idx == arr.length-1) return true;
        if(arr[idx] > arr[idx + 1]) return false;
       return  isArraySorted(arr,idx + 1);
        
    }
}