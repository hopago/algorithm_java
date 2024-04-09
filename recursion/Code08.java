package recursion;

public class Code08 {
    public static void main(String[] args) {
        printInBinary(99);
    }

    public static void printInBinary(int n) {
        if (n < 2)
            System.out.print(n);
        else {
            printInBinary(n / 2);
            System.out.print(n % 2);
        }
    }
}
