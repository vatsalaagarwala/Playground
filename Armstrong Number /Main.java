import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      int c=0, n;
     Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int temp = num;
      while(num>0)
      {
        n = num%10;
        num = num/10;
        c=c+(n*n*n);
      }
      if (temp ==c)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}