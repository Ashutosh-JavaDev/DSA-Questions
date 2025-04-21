class StringFun {
    int first=-1;
    int last=-1;
    void ApperanceString(String str,char ch,int len) {
        if (last > str.length() - 1) {
            return;
        } else {
            char sc=str.charAt(len);
            if(sc==ch){
                if(first==-1){
                    first=len;
                }
                else{
                    last=len;
                }
            }
                 ApperanceString(str, ch, len+1);
                 System.out.println("First Occurence: "+first);
                 System.out.println("Second Occurence: "+last);

        }
    }
}

public class StringApperance {
    public static void main(String[] args) {
        StringFun ob=new StringFun();
        ob.ApperanceString("abahjhaawbsas", 'a', 0);
    }
}
