package recursion;

public class Code07 {
    public static void main(String[] args) {
        int result = gcd(3, 9);
        System.out.print(result);
    }

    public static int gcd(int m, int n) {
        if (m < n) {
            int tmp = m;
            m = n;
            n = tmp;
        }
        if (m % n == 0)
            return n;
        else
            return gcd(n, m % n);
    }
}
