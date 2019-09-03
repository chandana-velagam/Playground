import java.util.*;
class Item
{
  public int p;
  Item(int pri)
  {
    p=pri;
  }
}
class Customer extends Item{
public String pro;
  public int q;
  Customer(String pro,int pri, int qu)
  {
    super(pri);
    this.pro=pro;
    q=qu;
  }
}
class Bill extends Customer{
  Bill(String pro, int pri, int qu)
  {
    super(pro,pri,qu);
  }
 void bill()
 {
  System.out.println("Total Price is : "+(q*p));
}}
class Main
{
  public static void main(String agrs[])
  {
    Scanner sc=new Scanner(System.in);
    String item=sc.next();
    int p=sc.nextInt();
    int quant=sc.nextInt();
    Bill c=new Bill(item,p,quant);
c.bill();
  }
}