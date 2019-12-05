import java.util.*;
class CalculateInterest
{
public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  System.out.print("Enter your gender(m or f)");
  char g=s.next().charAt(0);
  System.out.print("enter your age(1-120)");
  int a=s.nextInt();
  int interest;
  if (g=='f') {
    if (a>=1&&a<=58) {
      System.out.print("interest percentage is:"+8.2+"%");
    }
    else if (a>=59&&a<=120) {
      System.out.print("interest percentage is:"+7.6+"%");
    }
  }
  else if (g=='m') {

    if(a>=1&&a<=60){
      System.out.print("interest percentage is:"+9.2+"%");
  }
  else if (a>=61&&a<=120) {
    System.out.print("interest percentage is:"+8.3+"%");
  }
}
}
}
