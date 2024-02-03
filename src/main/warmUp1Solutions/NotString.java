package main.warmUp1Solutions;

public class NotString {
    public String notString(String str) {
        if(str.length() < 3) return "not " + str;

        String firstThree = str.substring(0,3);

        if(firstThree.equals("not")) return str;
        return "not " + str;
    }
}
