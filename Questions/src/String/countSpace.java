package String;

import java.util.Scanner;

class StringCount {
    int Count(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
}

public class countSpace {
    public static void main(String[] args) {

        StringCount ob = new StringCount();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        int res = ob.Count(str);
        System.out.println("Numbers of Space: "+res);
    }
}
