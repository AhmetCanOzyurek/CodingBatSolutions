package main.warmUp2Solutions;

public class Last2 {
    public int last2(String str) {
        if(str.length()<=2) return 0;
        String compare = str.substring(str.length()-2);
        int count = 0;
        for(int i = 0; i< str.length()-2;i++){
            String result = str.substring(i,i+2);
            if(compare.equals(result)){
                count++;
            }
        }
        return count;
    }
}
