package main.warmUp2Solutions;

public class StringX {
    public String stringX(String str) {
        String xLess = "";
        for(int i=0;i<str.length();i++){
            if(!(i > 0&& i< str.length()-1 && str.substring(i,i+1).equals("x"))){
                xLess += str.substring(i,i+1);
            }
        }
        return xLess;
    }
}
