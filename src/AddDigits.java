public class AddDigits {
    public int addDigits(int i) {
        return addDigitsHelper(i);
    }

    private int addDigitsHelper(int i) {
        if (i < 10) {
            return i;
        }

        int sum = 0;
        while (i != 0) {
            sum += i % 10;
            i /= 10;
        }

        return addDigitsHelper(sum);
    }

    public static void main(String[] args) {
        int i = 16578;
        AddDigits addDigits = new AddDigits();
        System.out.println(addDigits.addDigits(i));
    }
}
