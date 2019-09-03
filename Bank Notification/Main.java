import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      int n=sc.nextInt();
      Details d=new Details();
      if(n==1)
        d.notificationBySms(s);
      else if(n==2)
        d.notificationByEmail(s);
      else
        d.notificationByCourier(s);
    }
}
interface Notification
{
  public void notificationBySms(String s);
  public void notificationByEmail(String s);
  public void notificationByCourier(String s);
}
class Details implements Notification
{
	public void notificationBySms(String s)
    {
    	System.out.print(s);
        System.out.println("-Notification by Smr");
    }
    public void notificationByEmail(String s)
    {
    	System.out.print(s);
        System.out.println("-Notification by Mail");
    }
    public void notificationByCourier(String s)
    {
    	System.out.print(s);
        System.out.println("-Notification by Courier");
    }
   }
	