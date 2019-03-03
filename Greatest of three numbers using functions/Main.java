import java.util.Scanner;
class Main{
  public static int great_of_three(int n1,int n2,int n3){
    int g;
    if((n1>n2)&&(n1>n2))
      g=n1;
    else if((n2>n1)&&(n2>n3))
      g=n2;
    else
      g=n3;
    return g;  
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int a= in.nextInt();
      int b= in.nextInt();
      int c= in.nextInt();
      int d = great_of_three(a,b,c);
      System.out.print(d);
      
	}
}