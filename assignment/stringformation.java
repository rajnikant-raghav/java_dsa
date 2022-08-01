import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MyClass {
   
   
    public static Scanner sc=new Scanner(System.in);
    public static void main(String args[]) {
        StringBuilder str=new StringBuilder(sc.nextLine());
         int q=sc.nextInt();
         
         for(int i=0; i<q; i++){
             int t=sc.nextInt();
             if(t == 1){
                 
          for(int j=0; j<str.length()/2; j++){
            int start=j;
            int end=str.length()-1-j;
            char frent=str.charAt(start);
            char  back=str.charAt(end);
    
             str.setCharAt(start,back);
             str.setCharAt(end,frent);
        }
        
             }
             else if(t == 2){
                 int f=sc.nextInt();
                 String c=sc.next();
                 if(f == 1){
                     str.insert(0,c);
                 }else{
                     str.append(c);
                 }
             }
         }
       
        System.out.print(str);
    }
}