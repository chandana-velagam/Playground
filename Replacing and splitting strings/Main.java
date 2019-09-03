import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String str1=sc.nextLine();
      String str2=sc.nextLine();
      int n=sc.nextInt();
      String s[]=str2.split(" ",n);
      for(int i=0;i<n;i++)
        System.out.println(s[i]);
    }
}