public class firstlastoccu{
    public static int first=-1;
    public static int second=-1;
    public static void main(String[] arhs){
      String s="baaaakjdfgfdgfhaag";
      char ele='a';
      findfirstlastoccu(s,ele,0);
      System.out.print("first occu "+first+" second occu "+second );
    }
    public static void findfirstlastoccu(String str,char ele,int idx){
        if(idx == str.length()) return;

        if(str.charAt(idx) == ele){
            if(first < 0) first = idx;
            else second = idx;
        }
        findfirstlastoccu(str,ele,idx + 1);
    }
}