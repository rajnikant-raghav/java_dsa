import java.util.*;

public class priorityQueue{
    public static void main(String[] args){
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    int[] arr={3,6,8,7,9,4,5,3,2,1,5,5};
    for(int i : arr) pq.add(i);
     int idx = 0;
     while(idx < arr.length) arr[idx++] = pq.remove();
     for(int i : arr) System.out.print(i+" ");
    }
}