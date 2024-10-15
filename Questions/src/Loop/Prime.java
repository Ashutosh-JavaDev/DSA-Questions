package Loop;
class prime {
    void Result() {
        int count = 0;
        for (int i = 2; i <= 100; i++) {
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
    public static void main(System[]args){
        prime ob=new prime();

    }
}
