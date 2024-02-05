package main.warmUp1Solutions;

public class StartOz {
    public String startOz(String str) {
        if(str.isEmpty()) return "";
        if(str.length() == 1 && (str.equals("o")||str.equals("z"))) return str;
        if(str.startsWith("oz")) return "oz";
        else if(str.charAt(0) == 'o') return "o";
        else if (str.charAt(1) == 'z') return "z";
        else return "";
    }
}
