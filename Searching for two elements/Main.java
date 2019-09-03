import java.util.Scanner;
class Main{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i,x[];
      x=new int[n];
      for(i=0;i<n;i++)
        x[i]=sc.nextInt();
      int a=sc.nextInt();
      int b=sc.nextInt();
      for(i=0;i<n;i++)
      if(x[i]==a)
        break;
      if(i<n)
        a=i;
      else
        a=-1;
      for(i=0;i<n;i++)
        if(x[i]==b)
          break;
      if(i<n)
        b=i;
      else
        b=-1;
      System.out.println(a);
      System.out.println(b);
        
    }
}