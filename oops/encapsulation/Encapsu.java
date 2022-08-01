class Student{
private String name;
public String getName(){
    return name;
}
public void setName(String name){
    this.name = name;
}
}
public class Encapsu{
public static void main(String[] args){
    Student s= new Student();

    s.setName("RajaniKant Raghav");
    System.out.print(s.getName());
}
    
}