public class sortarr{
public static void main(String[] args){
int a[]={0,1,2,2,0,0,1,2,0,0,0,1,1,2,2,1,2,0};
int c0 =0, c1=0, c2=0;
for(int i=0; i<a.length; i++){
    switch(a[i]){
        case 0: 
        c0++;
        break;
        case 1:
        c1++;
        break;
        case 2:
        c2++;
        break;
    }

}
int k=0;
for(int i=0; i<c0; i++){
    a[k++] = 0;
}
for(int i=0; i<c1; i++){
    a[k++]=1;
}
for(int i=0; i<c2; i++){
    a[k++]=2;
}
for(int i=0; i<a.length; i++){
    System.out.print(a[i]+" ");
}

}
}