import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(fact(n));
  }
  static int fact(int n)
  {
    if(n==1)
      return n;
    else
      return n*fact(n-1);
  }
}