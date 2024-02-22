package main.warmUp2Solutions;

public class StringMatch {
    public int stringMatch(String a, String b) {
        int count = 0;
        int length = 0;
        if(a.length() > b.length()){
            length= b.length();
        }else{
            length = a.length();
        }
        for(int i = 0;i<length-1;i++){
            if(a.substring(i,i+2).equals(b.substring(i,i+2)))
                count++;
        }
        return count;
    }
}
