package main.warmUp1Solutions;

public class Front22 {
    public String front22(String str) {
        if(str.length() <=2) return str + str + str;

        String firstTwo = str.substring(0,2);

        return firstTwo + str + firstTwo;

    }
}
