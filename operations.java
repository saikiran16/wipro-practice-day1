import java.util.*;
class operations
{
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    boolean p=true;

    do {
      System.out.print("Enter two integer values ");
      int a=s.nextInt();
      int b=s.nextInt();
      int c=0;
      System.out.println("select 1 to add \nselect 2 to substract \nTo stop select 3 ");
      int o=s.nextInt();
      if (o==1) {
        c=a+b;
        System.out.println("their sum is:"+c);
      }
      else if (o==2) {
        c=a-b;
        System.out.println("their difference is:"+c);

      }
      else
      {
        break;
      }
    } while (p);
  }
}
