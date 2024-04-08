package recursion;

public class Code03 {
    public static void main(String[] args) {
        int result = func(10);
        System.out.print(result);
    }

    public static int func(int n) {
        if (n <= 0)
            return 0;
        else {
            return n + func(n - 1);
        }
    }
}
