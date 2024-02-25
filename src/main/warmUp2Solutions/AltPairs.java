package main.warmUp2Solutions;

public class AltPairs {
    public String altPairs(String str) {
        String pairs = "";
        for(int i = 0; i < str.length();i+=4){
            int end = i+2;
            if(end >str.length()){
                end = str.length();
            }
            pairs+= str.substring(i,end);
        }
        return pairs;
    }
}
