import java.util.*;
public class NGR{
    public static void main(String[] args){
        int[] arr={1,5,8,9,4,7,6,2,4};
        int ans[] =nextGrater(arr);
        for(int i : ans) System.out.print(i+" ");
        System.out.println();
    }
    public static int[] nextGrater(int[] arr){
        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1; i>=0; i--){
            int ele = arr[i];
            if(st.isEmpty()) ans[i] = -1;
            else if(st.peek() > ele) ans[i] = st.peek();
            else{
                while(st.size() > 0 && st.peek() <= ele){
                     st.pop();
                }
                if(st.size() == 0){
                    ans[i]=-1;
                } 
                else ans[i] = st.peek();
            }
            st.push(ele);
        }
        return ans;
    }
}