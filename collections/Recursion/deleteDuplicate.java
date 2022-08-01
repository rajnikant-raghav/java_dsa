public class deleteDuplicate{
    public static boolean[] map = new boolean[26];
    public static void main(String[] args){
        String s="abccdea";
        String ans="";
        deleteDup(s,0,ans);
    }
    public static void deleteDup(String str,int idx,String ans){
        if(idx == str.length()){
            System.out.print(ans);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar - 'a'] == true){
            deleteDup(str,idx + 1,ans);
        }else{
            ans +=currChar;
            map[currChar - 'a'] = true;
            deleteDup(str,idx + 1,ans);
        }
    }
}