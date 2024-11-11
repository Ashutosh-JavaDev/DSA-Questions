package CodingQuestion.TCS;
class countAsterikHash{
    public void CountAsterikHash(){
        int count=0;
        int count2=0;
        String str="#**##**";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='*'){
                count++;
            }
            else if(str.charAt(i)=='#'){
                count2++;
            }
        }
        int value=count-count2;
        System.out.println(value);
        if(value<0){
            System.out.println("# is More than *");
        }

        else if(value>0){
            System.out.println("* is More than #");
        }
        else{
            System.out.println("Both are Equal");
        }
    }
}
public class CountAsterikHash {
    public static void main(String[]args){
        countAsterikHash ob=new countAsterikHash();
        ob.CountAsterikHash();
    }
}
