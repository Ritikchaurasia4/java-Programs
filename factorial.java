public class factorial {
    public  static int  printFactorial(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        int fact1 = printFactorial(n-1);
        int fact2 = n * fact1;
        return fact2;
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = printFactorial(n);
        System.out.print(ans);
    }
}