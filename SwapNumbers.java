// swap 2 numbers without using temp variable
import java.util.Scanner;
public class SwapNumbers
{
  public static void main(String args[])
  {
    int x,y;
    Scanner sc=new Scanner(System.in); 
    System.out.println("ENTER THE VALUE OF X:");
    x=sc.nextInt();
    System.out.println("ENTER THE VALUE OF Y:");
    y=sc.nextInt();
    System.out.println("NUMBERS BEFORE SWAPING:");
    System.out.println("X="+x);
    System.out.println("Y="+y);
    x=x+y;
    y=x-y;
    x=x-y;
    System.out.println("NUMBERS AFTER SWAPING:");
    System.out.println("X="+x);
    System.out.println("Y="+y);
  }
 
 }
