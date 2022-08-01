import java.util.ArrayList;
public class customStack{
    ArrayList<Integer> list=new ArrayList<>();
    private int nel=0;

    public int size(){
        return nel;
    }
    public void push(int ele){
        list.add(ele);
        nel++;
    }
     public int pop(){
         if(list.size() == 0){
             System.out.print("stact underflow");
             return -1;
         }
         int ans = list.get(nel-1);
         nel--;
         return ans;
     }
     public int peek(){
          if(list.size() == 0){
             System.out.print("stact underflow");
             return -1;
         }
         return list.get(nel-1);
     }
     public String toString(){
         StringBuilder sb = new StringBuilder();
         sb.append("[");
         for(int i=0; i<nel; i++){
             sb.append(list.get(i));
             sb.append(", ");
         }
         sb.delete(sb.length()-2,sb.length());
         sb.append("]");
         return sb.toString();
     }
}