import java.util.*;

public class subSeq{
    public static Scanner sc= new Scanner(System.in);
    public static void main(String[] args){
        String str=sc.nextLine();
        subSequences(str,0,"");

    }
    public static void subSequences(String str,int idx,String output){
        if(idx == str.length()){
            System.out.println(output);
            return;
        }
        char currChar = str.charAt(idx);
        //to be
        
        subSequences(str,idx+1,output+currChar);
        //not to be
         subSequences(str,idx+1,output);
       
    }
}