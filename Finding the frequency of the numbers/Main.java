import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	Scanner sc=new Scanner(System.in);
      int n=sc.nextInt(),i,j;
      int a=sc.nextInt();
      int arr[]=new int[n];
      for( i=0;i<n;i++)
        arr[i]=sc.nextInt();
      for(i=1;i<=a;i++)
      {
        int c=0;
        for(j=0;j<n;j++)
        {
          if(arr[j]==i)
            c++;
        }
       System.out.println(i+" "+c);
      }
    }
}