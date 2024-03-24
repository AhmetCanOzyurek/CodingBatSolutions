package main.String1;

public class MiddleThree {
    public String middleThree(String str) {
        if(str.length() == 3) return str;
        int thr= str.length()/2 -1;

        String res =str.substring(thr,thr+3);

        return res;
    }
}
