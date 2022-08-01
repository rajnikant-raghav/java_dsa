public class Client{
    public static void main(String[] args){
        customQueue q = new customQueue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.peek());
    }
}