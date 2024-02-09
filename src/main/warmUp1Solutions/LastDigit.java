package main.warmUp1Solutions;

public class LastDigit {
    public boolean lastDigit(int a, int b) {
        int aMod = a % 10;
        int bMod = b % 10;

        if(aMod == bMod)
            return true;

        return false;
    }
}
