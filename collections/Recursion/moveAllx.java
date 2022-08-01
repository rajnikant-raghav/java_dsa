public class moveAllx{
    public static int ctr=0;
    public static void main(String[] args){
        String s="axbxxcd";
        String a="";
        StringBuilder ans = new StringBuilder(a);
        System.out.print(moveAllxToLeft(s,ans,0));
    }
    public static String moveAllxToLeft(String str,StringBuilder ans,int idx){
         if(idx == str.length()) return ans.toString();
         if(str.charAt(idx) == 'x') ans.append(str.charAt(idx));
         else ans.insert(ctr++,str.charAt(idx));
         return moveAllxToLeft(str,ans,idx + 1);
    }
}