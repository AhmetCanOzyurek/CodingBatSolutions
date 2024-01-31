package main.warmUp1Solutions;

public class Front3 {
    public String front3(String str) {
        if(str.length() <= 3 ) return str + str + str;

        String  letters3 = str.substring(0,3);
        return letters3 + letters3+letters3;
    }
}
