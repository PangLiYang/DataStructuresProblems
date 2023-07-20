import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public int[] twoSum(int nums[], int target) {
        Set<Integer> mappingSet = new HashSet<>();
        int res;

        for (int i: nums) {
            res = target - i;
            if (mappingSet.contains(res)) {
                int[] result = new int[2];
                result[0] = res;
                result[1] = i;
                return result;
            }
            mappingSet.add(i);
        }

        return null;
    }

    public static void main(String[] args) {
        int[] arr =new int[]{1, 5, 7, 8};
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(arr, 12);
        for (int i: result) {
            System.out.println(i);
        }
    }
}
