public class stringcount{
    public static void main(String[] args){
        String str="abbacceeeeefgggggggg";
        int ans=0,count=1,j=1;
        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i) != str.charAt(j)){
                if(ans<count){
                ans=count;
                }
                count=1;
                j++;
            }
            else{
                count++;
                j++;
            }
        }
//  System.out.println(ans);
//   System.out.println(count);
        if(ans>count){
            System.out.print(ans);
        }else{
             System.out.print(count);
        }
    }
}