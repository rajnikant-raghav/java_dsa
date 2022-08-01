public class list{
 Node head;
public class Node{
    String data;
    Node next;

    Node(String data){
       this.data = data;
       this.next = null;
    }
}
public static void addFirst(String data){
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode; 

}
public static void printNode(){
    Node currNode = head;
    while(currNode != null){
        System.out.print(currNode.data+" ");
        currNode = currNode.next;
    }
    System.out.print("null");
}




public static void main(String[] args){
list ll=new list();
ll.addFirst("Raghav");
ll.addFirst("Raghuvanshi");
ll.printNode();
}
}