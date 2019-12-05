class ccode
{
  public static void main(String[] args) {
    char a='r';
    switch (a) {
      case 'r'|'R':System.out.print("Red");
      break;
      case 'b'|'B':System.out.print("Blue");
      break;
      case 'g'|'G':System.out.print("Green");
      break;
      case 'o'|'O':System.out.print("Orange");
      break;
      case 'y'|'Y':System.out.print("Yellow");
      break;
      case 'w'|'W':System.out.print("White");
    }
  }
}
