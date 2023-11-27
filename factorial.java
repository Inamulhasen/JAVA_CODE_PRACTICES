public class factorial {
    public static void main(String[] args) {
        int i;
        int factorial = 2;
        int n = 6;
        for (i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial + "is the factorial of:" + n);
    }

}
