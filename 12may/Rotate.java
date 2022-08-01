import java.util.*;
public class Rotate{
    public static void arrayInput(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
    public static void arrayPrint(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void trasposeArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr[0].length; j++){
                swap(arr,i,j,j,i);
            }
        }
    }
    public static void rotatrArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length/2; j++){
               swap(arr,i,j,i,arr[0].length-1-j);
            }
        }
    }
    public static void swap(int[][] arr,int i,int j,int k,int l){
        arr[i][j]=((arr[k][l] + arr[i][j]) - (arr[k][l] = arr[i][j]));
    }
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        arrayInput(arr);
        
        trasposeArray(arr);

        rotatrArray(arr);

         System.out.println("Rotated array is:");
        arrayPrint(arr);
        
    }
}