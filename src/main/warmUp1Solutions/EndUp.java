package main.warmUp1Solutions;

public class EndUp {
    public String endUp(String str) {
        int len = str.length();
        if(len <= 3) return str.toUpperCase();

        String lastThree = str.substring(len - 3 ,len );

        return str.substring(0,len-3) + lastThree.toUpperCase();
    }
}
