import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int copy_num = n;
      int sum = 0;
      while(n>0){
        int rem = n % 10;
        int fact = 1;
        for(int count = 1; count<=rem; count++)
          fact = fact * count;
        sum = sum+fact;
        n = n/10;
      }
      if(copy_num==sum)
        System.out.println("Yes");
      else 
        System.out.println("No");
	}
}