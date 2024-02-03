package main.warmUp1Solutions;

public class MixStart {
    public boolean mixStart(String str) {
        if(str.length() > 2)
            return (str.substring(1,3).contains("ix"));

        return false;
    }
}
