package main.warmUp2Solutions;

public class FrontTimes {
    public String frontTimes(String str, int n) {
        String repeat = "";

        for(int i = 0;i < n;i++){
            if(str.length()<3){
                repeat += str;
            }else{
                repeat += str.substring(0,3);
            }
        }

        return repeat;
    }
}
