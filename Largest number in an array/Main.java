import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[ ] = new int[arr_size];
      int largest = 0;
      for(int idx=0; idx < arr_size; idx++){
        arr[idx]= in.nextInt();
      }
      for(int idx=0; idx < arr_size; idx++){
        if(arr[idx]>largest)
          largest=arr[idx];
      }
      System.out.println(largest);
    }
}