public class sumofindex{
    public static void sumofindex(int[][] arr){
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j]=j+j;
            }
        }
    }
    public static void printArray(int[][] arr){
    for(int idx=0; idx<arr.length*arr[0].length; i++){
        int i=idx/arr.length;
        int j=idx%arr[0].length;
        System.out.print(arr[i][j]+" ");
    }
    }
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
         sumofindex(arr);
         printArray(arr);
    }
}