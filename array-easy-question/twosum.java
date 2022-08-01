 class twosum{
    public static void twoSum(int[] nums,int target){
       int j;
        for(int i=0; i<nums.length; i++){
            for( j=0; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                System.out.print(i +" "+j);
                break;
                }
            }
            if(j == 1){
                break;
            }
            
        }
       
    }
    public static void main(String []args){
        int[] nums={2,7,11,15};
        int target=9;
        twoSum(nums,target);
        // System.out.print(twoSum(nums,target));
        
    }
}