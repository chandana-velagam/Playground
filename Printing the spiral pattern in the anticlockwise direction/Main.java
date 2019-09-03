import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      print_spiral(n);
    }
  static void print_spiral(int n)
  {
    int arr[][]=new int[n][n];
    int v=1;
    int i,j;
  /* for(i=0;i<1;i++)
   {
     for(j=n-1;j>=0;j--)
       arr[i][j]=v++;
     for(j=j+2;j<n;j++)
       arr[j][i]=v++;
     for(j=i+1;j<n;j++)
       arr[n-i-1][j]=v++;
     for(j=j-2;j>=i+1;j--)
       arr[j][n-1-i]=v++;
   } 
    */
    int dup=n;
  for(i=0;i<dup/2;i++)
   {
     for(j=n-1;j>=i;j--)
       arr[i][j]=v++;
     for(j=j+2;j<n;j++)
       arr[j][i]=v++;
     for(j=i+1;j<n;j++)
       arr[n-1][j]=v++;
     for(j=j-2;j>=i+1;j--)
       arr[j][n-1]=v++;
    
    n-=1;
   }
    n=dup;
    for(i=0;i<n;i++)
    {
      for(j=0;j<n;j++)
        System.out.print(arr[i][j]+" ");
      System.out.println();
   }
      
  }
}