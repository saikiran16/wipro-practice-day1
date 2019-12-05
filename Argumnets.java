class Arguments
{
  public static void main(String[] args) {
    String x;
    if (args==null) {
      System.out.print("no values");

    }
    else
    {
      x=String.join(",", args);
      System.out.print(x);
    }
  }
}
