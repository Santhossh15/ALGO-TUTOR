
public class computncr2 {
    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        int p = 13;
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int n_r_fact = factorial(n - r);
        System.out.println(((int) n_fact / (n_r_fact * r_fact)) % p);
    }

    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
