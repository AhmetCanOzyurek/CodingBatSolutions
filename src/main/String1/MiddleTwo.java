package main.String1;

import org.jetbrains.annotations.NotNull;

public class MiddleTwo {
    public String middleTwo(@NotNull String str) {
        int mid = str.length()/2;
        return str.substring(mid-1,mid+1);
    }
}
