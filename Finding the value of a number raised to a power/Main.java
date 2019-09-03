import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int b=sc.nextInt();
      int e=sc.nextInt();
      int t=1;
      while(e-->0)
        t*=b;
      System.out.println(t);
    }
}