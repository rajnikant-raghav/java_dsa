import java.util.*;
public class larRecHistogram{
    public static void main(String[] args){
         int[] arr={1,1};
         int ans= calLarRecHistogram(arr);
         
         System.out.print(ans);
        
    }
    public static int calLarRecHistogram(int[] arr){
        int[] left = nextSmallerLeft(arr);
        int[] right = nextSmallerRight(arr);
        display(right);
        display(left);
        int max=0;
        for(int i=0; i<arr.length;i++){
        int weight = (right[i] - left[i] -1) * arr[i];
         if(weight > max) max=weight;
        }
        return max;
    }
    public static int[] nextSmallerLeft(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0; i<arr.length; i++){
            int ele=arr[i];
            if(st.isEmpty()) ans[i] = -1;
            else if(ele > arr[st.peek()]) ans[i] = st.peek();
            else{
                while(st.size() > 0 && arr[st.peek()] > ele) st.pop();
                if(st.isEmpty()) ans[i] = -1;
                else ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
        
    }
    public static int[] nextSmallerRight(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1; i>=0; i--){
            int ele=arr[i];
            if(st.isEmpty()) ans[i] = n;
            else if(ele > arr[st.peek()]) ans[i] = st.peek();
            else{
                while(st.size() > 0 && arr[st.peek()] > ele) st.pop();
                if(st.isEmpty()) ans[i] = n;
                else ans[i] = st.peek();
            }
            st.push(i);
        }

        return ans;
        
    }
    public static void display(int[] arr){
      for(int i : arr){
          System.out.print(i+" ");
      }
      System.out.println();
    }

}