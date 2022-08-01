public class customArrayList{
    int nel=0;
    int[] arr=new int[10];
   
   public int size(){
       return nel;
   }

   public void add(int ele){
       if(nel == arr.length)
           expend();
           arr[nel] = ele;
           nel++;
   }

   private void expend(){
  int[] newarr= new int[2*arr.length];
  for(int i=0; i<arr.length; i++){
      newarr[i] = arr[i];
  }
  arr = newarr;
   }

   public String toString(){
      StringBuilder sb=new StringBuilder();
      sb.append("[");
      for(int i=0; i<nel; i++){
          sb.append(arr[i]);
          sb.append(", ");
      }
      sb.delete(sb.length()-2,sb.length());
      sb.append("]");
      return sb.toString();
   }

   public int get(int idx){
       if(idx >= nel || idx < 0){
           System.out.print("Invalid index");
           return -1;
       }
       return arr[idx];
   }

   public void update(int idx,int ele){
       if(idx >= nel || idx < 0){
           System.out.print("Invalid index");
       }
        arr[idx] = ele;
   }

   public void remove(int idx){
       if(idx >= nel || idx < 0){
           System.out.print("Invalid index");
       }
        for(int i=idx; i<nel; i++){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        nel--;
   }
   
}
