package Recursion;

public class PrimeCheck {
    public boolean check(int num, int counter) {
        if (counter * counter > num) {
            return true;
        }
        if (num % counter == 0) {
            return false;

        }

        return check(num, counter + 1);
    }

    public static void main(String[] args) {
        PrimeCheck ob = new PrimeCheck();
        boolean re = ob.check(6, 2);
        System.out.println("Result: " + re);
    }
}
