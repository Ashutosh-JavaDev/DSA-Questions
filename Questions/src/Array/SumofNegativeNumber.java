package Array;

public class SumofNegativeNumber {
    int arr[], size;

    SumofNegativeNumber() {
        BasicClass on = new BasicClass();
        this.arr = on.getArr();
        this.size = on.getSize();
        int sum = 0;
        System.out.print("Sum of " + size + " Positive Number is: ");
        for (int i = 0; i < size; i++) {
            if (arr[i] < 0) {
                sum += arr[i];
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        new SumofNegativeNumber();
    }
}
