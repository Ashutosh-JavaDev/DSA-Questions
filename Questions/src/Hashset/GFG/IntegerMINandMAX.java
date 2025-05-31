package Hashset.GFG;

public class IntegerMINandMAX {
    public static void minMax() {
        int arr[] = { 12, 32, 24, 42, 13 };
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

    public static void main(String[] args) {
        minMax();

    }
}
