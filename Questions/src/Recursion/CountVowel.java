package Recursion;

public class CountVowel {
    int count = 0;

    public int check(String str) {
        if (str.length() == 0) {
            return 0;
        }
        if (str.charAt(str.length() - 1) == 'a' || str.charAt(str.length() - 1) == 'e' || str.charAt(str.length() - 1) == 'i'
                || str.charAt(str.length() - 1) == 'o' || str.charAt(str.length() - 1) == 'u' || str.charAt(str.length() - 1) == 'A'
                || str.charAt(str.length() - 1) == 'E' || str.charAt(str.length() - 1) == 'I'
                || str.charAt(str.length() - 1) == 'O' || str.charAt(str.length() - 1) == 'U') {
                    check(str.substring(0, str.length()-1));
                    count++;
        }
        else{
            check(str.substring(0, str.length()-1));
        }
        return count;
    }
    public static void main(String[]args){
        CountVowel ob=new CountVowel();
        int res=ob.check("Ashutosh");
        System.out.println("Result: "+res);
    }
}
