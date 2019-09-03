import java.util.Scanner;
class Main
{
  	public static int square(int n)
    {
      return n*n;
    }
	public static void main (String[] args)
    {
	   Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println(square(n));
	} 
}