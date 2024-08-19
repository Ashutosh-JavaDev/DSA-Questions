package Array;

public class CommonArray {
    int arr[], size;

    CommonArray() {
        BasicClass ob = new BasicClass();
        this.arr = ob.getArr();
        this.size = ob.getSize();
        int count = 0;
        System.out.print("Common Number in the Array: ");
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }

            }
            if (count >= (size % 2)) {
                System.out.print(arr[i]);
            }
        }

    }
    public static void main(String[] args) {
        new CommonArray();
    }
}
