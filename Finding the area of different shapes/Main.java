import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        int n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      switch(n)
      {
        case 1:
          int s=sc.nextInt();
          System.out.println(s*s);
          break;
        case 2:
          int ba=sc.nextInt();
          int h=sc.nextInt();
          System.out.println(ba*h);
          break;
        case 3:
          int l=sc.nextInt();
          int b=sc.nextInt();
          System.out.println(0.5*l*b);
          break;
        case 4:
          int c=sc.nextInt();
          System.out.println(3.14*c*c);
          break;
          
      
      }
       
    }
}