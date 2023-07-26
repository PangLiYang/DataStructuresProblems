public class Partition {
    private class IntList {
        private int first;
        private IntList rest;

        public IntList reverse() {
            return new IntList();
        };
    }

    public static IntList[] partition(IntList lst, int k) {
        IntList[] array = new IntList[k];
        int index = 0;
        IntList L = lst.reverse();
        while(L != null) {
            IntList curr = L;
            L = L.rest;
            curr.rest = array[index];
            array[index] = curr;
            index = (index + 1) % k;
        }

        return array;
    }
}
