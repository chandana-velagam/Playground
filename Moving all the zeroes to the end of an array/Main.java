import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int b[]=new int[n];
      int i;
      for(i=0;i<n;i++)
        a[i]=sc.nextInt();
      int k=n-1,j=0;
      for(i=0;i<n;i++)
        if(a[i]==0)
          b[k--]=a[i];
      else
        b[j++]=a[i];
      for(i=0;i<n;i++)
        System.out.print(b[i]+" ");
    }
}