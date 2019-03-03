import java.util.Scanner;
class Main{
  public static int sum_of_nums(int n){
    int s=0, i=1;
    while(i <= n){
      s = s + i;
      i++;
    }
    return s;
    
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int sum = sum_of_nums(n1);
      System.out.print(sum);
	}
}