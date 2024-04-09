package recursion.string;

public class Code02 {
    public static void main(String[] args) {
        printCharsReverse("Hopago");
    }

    public static void printCharsReverse(String str) {
        if (str.length() == 0)
            return;
        else {
            printCharsReverse(str.substring(1)); // opago, pago, ago, go, o
            System.out.print(str.charAt(0)); // ogapoH
        }
    }
}
