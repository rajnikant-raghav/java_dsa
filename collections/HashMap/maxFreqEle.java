import java.util.*;
public class maxFreqEle{
    public static void main(String[] args){
        int[] arr={1,1,1,1,2,2,2,2,2,5,5,5,5,5,8,5,5,8,5,5,6};
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i : arr){
          if(hm.containsKey(i)) hm.put(i,(hm.get(i)+1));
          else hm.put(i,1);
        }
        int  maxKey=-1, maxFreq=-1;
        for(int i : hm.keySet()){
            if(hm.get(i) > maxFreq){
                maxKey=i;
                maxFreq=hm.get(i);
            }
        }
        System.out.print(maxKey);
    }
}