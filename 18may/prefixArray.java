import java.util.*;

public class prefixArray{
    
    public static int[] preFixArray(int[] arr){
        int[] ps=new int[arr.length];
          ps[0]=arr[0];
        for(int i=1; i<arr.length; i++){
            ps[i]=ps[i-1] + arr[i];
        }
        return ps;
    }
    // find range sum
    public static int rangeSum(int[] arr,int start,int end){
        int[] ans=preFixArray(arr);
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum = (start == 0) ? ans[end] : ans[end] - ans[start-1];
        }
        return sum;
    }
    
    public static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int ans =rangeSum(arr, 1,3);
        
        System.out.print(ans);
        
        // for(int i=0; i<ans.length; i++){
        //     System.out.print(ans[i]+" ");
        // }
    }
}