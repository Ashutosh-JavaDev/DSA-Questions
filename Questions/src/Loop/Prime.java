package Loop;

class prime {
    void Result() {
        for (int i = 2; i <= 100; i++) {
            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }
}

public class Prime {
    public static void main(String[] args) {
        prime ob = new prime();
        ob.Result();
    }
}
