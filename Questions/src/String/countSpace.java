package String;

import java.util.Scanner;

class StringCount {
    int Count(String str) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
    }
}

public class countSpace {

}
