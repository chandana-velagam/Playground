import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i,j,k;
    int arr[]=new int[n];
    for(i=0;i<n;i++)
      arr[i]=sc.nextInt();
    int r=sc.nextInt();
    int c=arr[0];
   
    for(i=0;i<n;i++)
    {
      for(j=0;j<r;j++){
      if(i%2==0)
      {
        if(i-2>=0)
        arr[i-2]=arr[i];
      }
      }
    }
    int d;
     if((n-1)%2==0)
     {
       arr[n-1]=c;
       d=arr[n-2];
     }
      else
      {
        arr[n-2]=c; 
        d=arr[n-1];
      }
    for(i=n-1;i>=0;i--)
    {
      if(i%2!=0)
        if(i-2>=0)
        arr[i]=arr[i-2];
    }
    if(n%2==0)
      arr[1]=d;
    else
      arr[3]=d;
    for(i=0;i<n;i++)
      System.out.print(arr[i]+" ");
  	}
}