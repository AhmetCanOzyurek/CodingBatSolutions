package main.warmUp2Solutions;


public class CountXX {
    int countXX(String str) {
        int count = 0;
        String xFinder = "";
        for(int i = 0; i < str.length()-1;i++){
            xFinder = str.substring(i,i+2);
            if(xFinder.equals("xx")){
                count ++;
            }
        }
        return count;
    }
}
