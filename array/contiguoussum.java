public class contiguoussum{
    public static int findContiguousSum(int[] arr){
        int maxSum = 0;
        int curSum = 0;
        for(int i=0; i<arr.length; i++){
            curSum=curSum+arr[i];
            if(curSum > maxSum){
            maxSum=curSum;
            }
            if(curSum < 0){
                curSum = 0;
            }
        }
        return maxSum;

    }
    public static void main(String[] args){
        int[] arr={-2,-1,4,-1,-2,1,5,-3};
        int result = findContiguousSum(arr);
        System.out.print("largest Sum of contiguous subarrays is "+result);
    }
}