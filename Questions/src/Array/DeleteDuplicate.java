package Array;

public class DeleteDuplicate {
    int arr[], size;

    DeleteDuplicate() {
        BasicClass ob = new BasicClass();
        this.arr = ob.getArr();
        this.size = ob.getSize();
        int count = 0;
        int temp[]=new int[count];
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    temp[i]=arr[i];
                    count++;

                }
            }
        }
        if (count > 0) {
            System.out.println("Total Number of Duplicate found in array: " + count);
        } else {
            System.out.println("No Duplicates Found");
        }
    }

    public static void main(String[] args) {
        new DeleteDuplicate();
    }
}
