package main.String1;

import org.jetbrains.annotations.NotNull;

public class NTwice {
    public String nTwice(@NotNull String str, int n) {
        return str.substring(0,n) + str.substring(str.length()-n);
    }
}
