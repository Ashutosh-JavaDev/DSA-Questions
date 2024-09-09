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
    public boolean Result(int num){
        rev=0;
        check(num);
        return rev==num;

    }
    public static void main(String[] args) {
        Pallindrome ob = new Pallindrome();
        int num=121;
        // ob.check(121);
        if(ob.Result(num)){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not Palindrome");
        }

    }
}