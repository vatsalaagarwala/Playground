import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int i=2; i<=n; i++)
      {
        if(is_prime(i))
          System.out.println(i);
      }
	}
  public static boolean is_prime(int m)
  {
    boolean isprime = true;
    for(int n = 2; n<=m/2; n++)
    {
      if(m%n==0)
      {
        isprime=false;
        break;
      }
    }
    return isprime;
  }
}
