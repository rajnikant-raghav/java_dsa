public class revString{
    public static void main(String[] args){
        String s="abcd";
        reverseString(s,s.length()-1);
    }
    public static void reverseString(String str,int idx){
        if(idx < 0) return;

        System.out.print(str.charAt(idx));
        reverseString(str,idx - 1);
    }
}