import java.util.Scanner;
class Main
{
  public static int square_of_a_number(int n){
    int sq = n*n;
    return sq;
  }
  
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int m = square_of_a_number(n1);
      System.out.print(m);
	} 
}