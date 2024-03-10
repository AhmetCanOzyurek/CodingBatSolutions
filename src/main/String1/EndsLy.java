package main.String1;

import org.jetbrains.annotations.NotNull;

public class EndsLy {
    public boolean endsLy(@NotNull String str) {
        if(str.length()<2) return false;

        if(str.substring(str.length()-2).equals("ly"))
            return true;

        return false;
    }
}
