import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i,j,count=0,max=-9999999;
    int arr[]=new int[n];
    for(i=0;i<n;i++)
      arr[i]=sc.nextInt();
    for(i=0;i<n;i++)
      if(arr[i]==1)
        count++;
      else
      {
        if(count>max)
          max=count;
        count=0;
      }
    System.out.println(max);
  }
}