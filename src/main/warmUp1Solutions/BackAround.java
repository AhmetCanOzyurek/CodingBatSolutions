package main.warmUp1Solutions;

public class BackAround {
    public String backAround(String str) {
        if(str.length() == 0) return str;

        String lastLetter = str.substring(str.length()-1);

        return lastLetter +str+ lastLetter;

    }
}
