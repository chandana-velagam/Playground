import java.util.Scanner;
class Main
{
  public static int stringCompare(String str1, String str2) 
    { 
        int l1 = str1.length(); 
        int l2 = str2.length(); 
        int lmin; 
    if(l1>l2)
      lmin=l2;
    else
      lmin=l1;
        for (int i = 0; i < lmin; i++) { 
            int str1_ch = (int)str1.charAt(i); 
            int str2_ch = (int)str2.charAt(i); 
  
            if (str1_ch != str2_ch)  
                return str1_ch - str2_ch; 
        } 
        if (l1 != l2) 
            return l1 - l2;    
    else 
      return 0; 
        }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i,l;
    String s[]=new String[n];
    for(i=0;i<n;i++)
      s[i]=sc.next().toLowerCase();
   for(i=0;i<n;i++)
     for(int j=i+1;j<n;j++)
       if(stringCompare(s[i],s[j])>0)
       {
         String str=s[i];
         s[i]=s[j];
         s[j]=str;
       }
     for(i=0;i<n;i++)
       System.out.println(s[i]);
  }
}