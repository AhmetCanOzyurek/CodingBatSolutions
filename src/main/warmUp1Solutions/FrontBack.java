package main.warmUp1Solutions;

public class FrontBack {
    public String frontBack(String str) {
        if(str.length() == 1 || str.isEmpty()) return str;

        String firstLetter = str.substring(0,1);
        String lastLetter=  str.substring(str.length()-1);


        return lastLetter+ str.substring(1,str.length()-1)+firstLetter;
    }
}
