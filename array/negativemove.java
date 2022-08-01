public class negativemove{
    public static void main(String[] args){
        int[] a={-12,11,-13,-5,6,-7,5,-3,-6};
        int start=0;
        int  end =a.length-1;
        while(start <= end){
            if(a[start] < 0 && a[end] < 0){
                start++;
            }
            else if(a[start] > 0 && a[end] < 0){
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp; 
                start++;
                end--;
        }
        else if(a[start] > 0 && a[end] > 0){
            end--;
        }
        else{
            start++;
            end--;
        }
        }
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
} 