//import required packages
import java.util.*;
class Faculty
{
  int sal;
  Faculty(int n)
  {
    sal=n;
  }
  public void salary()
  {
    System.out.println("Base Salary: "+sal);
  }
}
class CSE extends Faculty
{
  CSE(int n)
  {
    super(n+3000);
  }
  public void salary()
  {
    System.out.println("CSE Faculty: "+super.sal);
  }
}
class IT extends Faculty
{
  IT(int n)
  {
    super(n+5000);
  }
  public void salary()
  {
     System.out.println("IT Faculty: "+super.sal);
  }
}
class ECE extends Faculty
{
  ECE(int n)
  {
    super(n+4500);
  }
  public void salary()
  {
    System.out.println("ECE Faculty: "+super.sal);
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int sal=sc.nextInt();
    ECE ece = new ECE(sal);
    IT it= new IT(sal);
    CSE cse=new CSE(sal);
    Faculty f=new Faculty(sal);
    f.salary();
    cse.salary();
    it.salary();
    ece.salary();
    //implement your required concept here
  }
}