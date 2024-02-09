package main.warmUp1Solutions;

public class StringE {
    public boolean stringE(String str) {
        int x = 0;
        for(int i = 0; i < str.length(); i++ ){
            if(str.charAt(i) == 'e')
                x++;
        }
        return (x<=3 && x>=1);
    }
}
