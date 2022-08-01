import java.util.*;
public class hello{
 
public static void main(String[] args){
Scanner scn=new Scanner(System.in);
int t=scn.nextInt();
int q=scn.nextInt();
int l=scn.nextInt();
int r=scn.nextInt();
int total =q+l+r;
int[] arr=new int[2];
for(int i=0; i<q; i++){
int x=scn.nextInt();
int y=scn.nextInt();

if(total == x || total == y){
   arr[0] = 1;
} else{
    arr[1]=0;
}
}
for(int i : arr){
    System.out.println(i);
}

}
}