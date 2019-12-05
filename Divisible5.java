class Divisible5
{
  public static void main(String[] args) {
int count1=0,count2=0,count3=0,i=4;
boolean c=true;
    while(c)
    {
      if(i%2==0&&i%3==0&&i%5==0)
      {
        System.out.println(i);
        count1++;
      }
      i++;
      if (count1==5) {
        c=false;
      }
    }
  }
}
