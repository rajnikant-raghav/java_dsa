import java.util.*;  
import java.util.Arrays;   
public class union{
    public static void main(String[] args){
        int a[]={1,2,5,6,2,3,5};
        int b[]={2,4,5,6,7,6,5};
        Arrays.sort(a);
        Arrays.sort(b);
        List<Integer> finalList=new ArrayList<Integer>();
        int i=0;
        int j=0;
        while(i < a.length && j < b.length){
            while((i<a.length-1) && (a[i]==a[i+1])){
                i++;
            }
            while((j<b.length-1) && (b[j]==b[j+1])){
                j++;
            }
            if(a[i] < b[j]){
                finalList.add(a[i++]);
            }
            else if(a[i] > b[j]){
                finalList.add(b[j++]);
            }
            else{
                finalList.add(b[j]);
                i++;
                j++;
            }

        }
       System.out.print(finalList);
       
    }
}