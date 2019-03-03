import java.util.Scanner;
class Main{
  public static int power_of_anum(int a, int b){
    int result = 1;
    while(b!=0){
      result = result * a;
      b--;
    }
    return result;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int m = in.nextInt();
      int c = power_of_anum(n,m);
      System.out.print(c);
	}
}