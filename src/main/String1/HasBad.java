package main.String1;

public class HasBad {
    public boolean hasBad(String str) {
        if(str.length() <= 3 && !str.equals("bad")) return false;
        for(int i = 0;i < 2;i++){
            if(str.substring(i,i+3).equals("bad")){
                return true;
            }
        }
        return false;
    }
}
