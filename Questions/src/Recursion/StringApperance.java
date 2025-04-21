class StringFun {
    int first = -1;
    int last = -1;

    void ApperanceString(String str, char ch, int len) {
        if (len==str.length()) {
            System.out.println("First Occurence: " + first);
            System.out.println("Second Occurence: " + last);
            return;
        }
        char sc = str.charAt(len);
        if (sc == ch) {
            if (first == -1) {
                first = len;
            } else {
                last = len;
            }
        }
        ApperanceString(str, ch, len + 1);

    }
}

public class StringApperance {
    public static void main(String[] args) {
        StringFun ob = new StringFun();
        ob.ApperanceString("abahjhaawbsas", 'a', 0);
    }
}
