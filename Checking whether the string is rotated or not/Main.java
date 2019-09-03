import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	Scanner sc=new Scanner(System.in);
      String s1=sc.nextLine();
      String s2=sc.nextLine(); 
      String t=s1+s1;
      int l=s2.length(),c=0;
      for(int i=0;i+l<=t.length();i++)
      {
        if(s2.equals(t.substring(i,i+l)))
        {
          System.out.println("Yes");
         c=1;
         break;
        }
      }
      if(c!=1)
        System.out.println("No");
    }
}