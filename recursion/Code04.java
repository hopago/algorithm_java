package recursion;

// factorial
public class Code04 {
    public static void main(String[] args) {
        int result = factorial(5);
        System.out.print(result);
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
