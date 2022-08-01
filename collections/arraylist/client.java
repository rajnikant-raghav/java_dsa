public class client{
    public static void main(String[] args){
        customArrayList al=new customArrayList();
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(8);
        al.add(9);
        al.add(10);
        al.add(11);
        al.add(12);
        al.add(13);

        System.out.print(al);
        
        al.remove(2);
        al.update(1,15);
         System.out.print(al);
    }
}