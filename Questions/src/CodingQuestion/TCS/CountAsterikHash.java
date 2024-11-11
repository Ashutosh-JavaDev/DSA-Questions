package CodingQuestion.TCS;
class countAsterikHash{
    public void countAsterikHash(){
        int count=0;
        int count2=0;
        String str="#**##*";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='*'){
                count++;
            }
            else if(str.charAt(i)=='#'){
                count2++;
            }
        }
        System.out.println(count-count2);
    }
}
public class CountAsterikHash {
    
}
