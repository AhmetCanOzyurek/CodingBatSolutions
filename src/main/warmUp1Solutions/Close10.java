package main.warmUp1Solutions;

public class Close10 {
    public int close10(int a, int b) {
        int aMinus = Math.abs(a - 10);
        int bMinus = Math.abs(b - 10);

        if(aMinus == bMinus ) return 0;
        elseif(aMinus < bMinus ) return a;
  else return b;

    }
}
