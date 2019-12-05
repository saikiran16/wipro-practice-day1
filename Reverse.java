class Reverse
{
  public static void main(String[] args) {
    int n=Integer.parseInt(args[0]);
    int o=n;
    int r=0;
    int i=1;
    while (n!=0) {
      r=r*10+(n%10);
      i++;
      n=n/10;
    }
    System.out.println(o);
    System.out.print(r);
  }
}
