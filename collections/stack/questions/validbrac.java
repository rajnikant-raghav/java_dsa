import java.util.*;

public class validbrac{
    
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        System.out.print(validparenthasis(s));

    }
    public static boolean validparenthasis(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char brac = s.charAt(i);
            if(brac == '(' || brac == '{' || brac == '[') st.push(brac);
            else{
                if(st.isEmpty()) return false;
                if(brac == ')' && st.peek() != '(' 
                || brac == '}' && st.peek() != '{' 
                || brac == ']' && st.peek() != '[' ) return false;
              st.pop();
            }
            
        }
        return st.isEmpty();
    }
}