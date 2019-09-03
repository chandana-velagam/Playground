import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int i;
    String[] words = s.split(" ");
    int l=words.length;
    
   for(i=0;i<l;i++)
   {
     int len=words[i].length();
      for(int j=len-1;j>=0;j--)
        System.out.print(words[i].charAt(j));
       System.out.print(" ");
   }
  }
}