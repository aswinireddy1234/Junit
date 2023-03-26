package userregisterprogram;
import java.util.*;
import java.util.regex.Pattern;

public class FirstName {
    public static Object FirstName2(String name){

        boolean result = Pattern.matches("[A-Za-z]{3,10}", name);
//        boolean result = Pattern.matches("^Cap\\w{2,}$", name);
        return result;
    }

    public static void main(String[] args) {

    }
}

