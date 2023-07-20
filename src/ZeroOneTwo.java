public class ZeroOneTwo {
    public static void spSort(int[] arr) {
        int p = 0;
        int q = arr.length - 1;
        int pos = 0;

        while (pos <= q) {
            if (arr[pos] == 0) {
                swap(arr, p, pos);
                p += 1;
                pos += 1;
            } else if (arr[pos] == 2) {
                swap(arr, q, pos);
                q -= 1;
            } else {
                pos += 1;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] input = {1, 0, 0, 2, 2, 0, 1, 1, 0, 2, 0, 1, 2, 1, 2};
        spSort(input);
        for (int i: input) {
            System.out.print(i + ", ");
        }
    }
}
