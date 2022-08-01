public class Main{
    public static void main(String[] args){

        int[] rno= new int[5];
        String[] name= new String[5];
        float[] marks=new float[5];

    Student Raghav = new Student(32,"RajaniKant Raghav",78.8f);
    Student Shiva = new Student(33,"Shiva Saini",80.9f);
    //    System.out.println(Raghav.rno);
    //    System.out.println(Raghav.name);
    //    System.out.println(Raghav.marks);
     Raghav.greeding();
    
    }
   
}
 class Student{
        int rno;
        String name;
        float marks;
        
        void greeding(){
            System.out.print(this.name);
        }
        Student(){

        }
        Student(int rno,String name, float marks){
            this.rno = rno;
            this.name = name;
            this.marks= marks;
        }
    }