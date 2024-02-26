package main.warmUp2Solutions;

public class StringYak {
    public String stringYak(String str) {
        // String result = str.replace("yak", "");
        // return result;
        String result = "";

        for(int i = 0;i<str.length() ;i++){
            if(i+2<str.length()&&str.charAt(i)== 'y' &&str.charAt(i+2) == 'k'){
                i+=2;
            }else
                result += str.charAt(i);
        }
        return result;
    }

}
