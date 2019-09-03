import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
    int dup=0;
    while(n>0)
    {
      dup=dup*10+n%10;
      n/=10;
    }
    System.out.println(dup);
  }
}