import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i,j;
    int arr[]=new int[n];
    for(i=0;i<n;i++)
      arr[i]=sc.nextInt();
    for(i=0;i<n;i++)
      for(j=i+1;j<n;j++)
        if(arr[j]>arr[i])
          System.out.println(arr[i]+","+arr[j]);
  }
}