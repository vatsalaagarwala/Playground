import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[ ] = new int[arr_size];
      for(int idx=0; idx < arr_size; idx++){
        arr[idx]= in.nextInt();
      }
      int search1 = in.nextInt();
      int search2 = in.nextInt();
      int elementidx1 = -1;
      int elementidx2 = -1;
      for(int idx=0; idx<arr_size; idx++){
        if(arr[idx]==search1){
          elementidx1 = idx;
        }
        if(arr[idx]==search2){
          elementidx2 = idx;
        }
        
      }
      System.out.println(elementidx1);
      System.out.println(elementidx2);
    }
}