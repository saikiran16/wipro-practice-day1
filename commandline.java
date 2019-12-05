import java.util.*;
class commandline
{
public static void main(String[] args)
{
  int x=Integer.parseInt(args[0]);
  if(x<=-1)
  {
    System.out.print("negative number");
  }
  else
  {
    System.out.print("positive number");
  }
}
}
