class NumberorAlphabet
{
  public static void main(String[] args) {
    int a=1;
    if (a<=('a'|'A')&&a>=('z'|'Z')) {
      System.out.print("Alphabet");
    }
    else if(a>=0&&a<=9)
    {System.out.print("number");}
    else
    {
      System.out.print("special Character");
    }
  }
}
