class palin
{
  public static void main(String[] args) {
int n=121,o=n,r=0;
    while(n!=0)
    {
      r=r*10+(n%10);
      n=n/10;
    }
  if (o==r) {
    System.out.print("palindrome");
  }
  else
  {
    System.out.print("not a palindrome");
  }
}
}
