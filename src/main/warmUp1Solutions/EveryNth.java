package main.warmUp1Solutions;

public class EveryNth {
    public String everyNth(String str, int n) {
        String every = "";
        for (int i = 0; i < str.length(); i += n) {
            every += str.charAt(i);
            if (n >= str.length())
                break;
        }
        return every;
    }
}
