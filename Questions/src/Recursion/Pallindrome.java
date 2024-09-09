package Recursion;

public class Pallindrome {
    int rev = 0, d = 1;

    public void check(int num) {
        if (num == 0) {
            return;
        } else {
            rev = rev * 10 + num % 10;
            check(num / 10);
        }
    }

    public static void main(String[] args) {
        Pallindrome ob = new Pallindrome();
        ob.check(121);

    }
}