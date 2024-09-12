package Recursion;

public class PrimeCheck {
    int count = 0;
    boolean result = false;

    public boolean check(int num, int counter) {
        if (counter == num) {
            return true;
        } else {
            if (num % counter == 0) {
                count++;
                res();
            }

        }
        return check(num, counter + 1);
    }

    public boolean res() {
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String []args){
        PrimeCheck ob=new PrimeCheck();
        boolean re=ob.check(4, 1);
        System.out.println("Result: "+re);
    }
}
