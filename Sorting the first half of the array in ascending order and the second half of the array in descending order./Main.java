import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    int i,j,t;
    for(i=0;i<n;i++)
      arr[i]=sc.nextInt();
    int a=n/2;
     for(i=0;i<a-1;i++)
    for(j=i+1;j<a;j++)
      if(arr[i]>arr[j])
      {
        t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
      }
     for(i=a;i<n-1;i++)
    for(j=i+1;j<n;j++)
      if(arr[i]<arr[j])
      {
        t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
      }
    
    for(i=0;i<n;i++)
      System.out.print(arr[i]+" ");
  }
}