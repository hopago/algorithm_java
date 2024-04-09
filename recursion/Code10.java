package recursion;

public class Code10 {
    int search(int[] data, int n, int target) {
        for (int i = 0; i < n; i++) {
            if (data[i] == target)
                return i;
        }
        return -1;
    }

    int explicitSearch(int[] data, int begin, int end, int target) {
        if (begin > end)
            return -1;
        else if (target == data[begin])
            return begin;
        else
            return explicitSearch(data, begin + 1, end, target);
    }

    int findMax(int[] data, int begin, int end) {
        if (begin == end)
            return data[begin];
        else
            return Math.max(data[begin], findMax(data, begin + 1, end));
    }

    public static int binarySearch(String[] items, String target, int begin, int end) {
        if (begin > end)
            return -1;
        else {
            int middle = (begin + end) / 2;
            int comparedResult = target.compareTo(items[middle]);
            if (comparedResult == 0)
                return middle;
            else if (comparedResult < 0)
                return binarySearch(items, target, begin, middle - 1);
            else
                return binarySearch(items, target, middle + 1, end);
        }
    }
}
