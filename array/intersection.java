import java.util.*;
public class intersection{
    public static void main(String[] agrs){
        int[] a={1,3,4,5,6,7};
        int[] b={2,4,6,7,8,9};
        List<Integer> finalList=new ArrayList<Integer>();
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                if(a[i] == b[j]){
                finalList.add(a[i]);
                }
            }
        }
        System.out.print(finalList);
    }
}