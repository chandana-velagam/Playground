import java.util.Scanner;
public class Main
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     String s=sc.nextLine();
     String[] words = s.split(" ");
     for(int i=0;i<words.length;i++)
     {
       int count=0;
       for(int j=i+1;j<words.length;j++)
       {
         if(words[i].equals(words[j]))
           count++;
       }
       if(count == 0)
         System.out.print(words[i]+" ");
     }
   }
}
       