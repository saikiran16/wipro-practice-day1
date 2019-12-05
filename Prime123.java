class Prime123 {
    public static void main(String[] args) {
        int j,n=99;
        boolean flag = false;
        for(j=10;j<n;j++){
        for(int i = 2; i <= n/2; ++i)
        {
            // condition for nonprime number
            if(n % i == 0)
            {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(j + " is a prime number.");
        else
            System.out.println(j + " is not a prime number.");
    }
  }
}
