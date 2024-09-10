package Recursion;

public class StringCount {
    int count = 0;

    public int result(String str) {
        if (str.length() < 0) {
            return 0;
        } else {
            // char ch=str.charAt(str.length()-1);
            count++;
            result(str.substring(0, str.length() - 1));
        }
        return count;
    }

    public static void main(String[] args) {
        StringCount ob = new StringCount();
        int res = ob.result("Ashutosh");
        System.out.println("Result: " + res);
    }
}
