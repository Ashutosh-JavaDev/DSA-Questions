package Recursion;

public class Pallindrome {
    int rev=0, d=1;
    public void check(int num){
        if(num==0){
            return;
        }
        else{
            rev=num%10;
            d=d*10+rev;
            check(num/10);
        }
    }
    public static void main(String[]args){
        Pallindrome  ob=new Pallindrome();
        ob.check(121);
        
    }
}