package recursion;

public class Code09 {
    public static int sum(int n, int[] data) {
        if (n <= 0)
            return 0;
        else
            return sum(n - 1, data) + data[n - 1];
    }
}
