package Recursion;

public class CountVowel {
    int count = 0;

    public int check(String str, int size) {
        if (size < 0) {
            return 0;
        }
        if (str.charAt(size - 1) == 'a' || str.charAt(size - 1) == 'e' || str.charAt(size - 1) == 'i'
                || str.charAt(size - 1) == 'o' || str.charAt(size - 1) == 'u' || str.charAt(size - 1) == 'A'
                || str.charAt(size - 1) == 'E' || str.charAt(size - 1) == 'I'
                || str.charAt(size - 1) == 'O' || str.charAt(size - 1) == 'U') {

        }
        return count;
    }
}
