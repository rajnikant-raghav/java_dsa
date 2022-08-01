import java.util.*;

public class customQueue{
    ArrayList<Integer> list = new ArrayList<>();
    int nel = 0;
    public int size(){
        return nel;
    }
    public void add(int x){
        list.add(x);
        nel++;
    }
    public int peek(){
        if(list.size() == 0){
            System.out.print("queue underflow");
            return -1;
        }
        return list.get(0);
    }
   public int remove(){
        if(this.size() == 0) {
            System.out.print("Queue underflow");
            return -1;
        }
        for(int i=0; i<nel-1; i++){
            int temp = list.get(i);
            list.get(i) = list.get(i+1);
            list.get(i+1) = temp;
        }
        return list.get(--nel);
    }
    public int peek(){
        if(this.size() == 0){
            System.out.print("Queue underflow");
            return -1;
        }
        return list.get(0);
    }
    public boolean isEmpty(){
        return (this.size() == 0);
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