package Array;

public class StoreEven {
    int arr[], second[], third[], size1, size2;

    StoreEven() {
        BasicClass ob = new BasicClass();
        this.arr = ob.getArr();
        this.size1 = ob.getSize();
        BasicClass ob2 = new BasicClass();
        this.second = ob2.getArr();
        this.size2 = ob2.getSize();
        int even1 = 0;
        int even2 = 0;
        int total = even1 + even2;
        third = new int[total];
        for (int i = 0; i < size1; i++) {
            if (arr[i] % 2 == 0) {
                even1++;
            }
        }
        for (int i = 0; i < size2; i++) {
            if (second[i] % 2 == 0) {
                even2++;
            }
        }
        int index = 0;
        for (int i = 0; i < size1; i++) {
            if (arr[i] % 2 == 0) {
                third[index++] = arr[i];

            }
        }
        for (int i = 0; i < size2; i++) {
            if (second[i] % 2 == 0) {
                third[index++] = second[i];
            }
        }
    }
    public static void main(String[]args){
        
    }
}
