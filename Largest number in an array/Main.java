import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i,x[],max=-9999;
      x=new int[n];
      for(i=0;i<n;i++)
      {
        x[i]=sc.nextInt();
        if(x[i]>max)
          max=x[i];
      }
      System.out.println(max);
   
    }
}