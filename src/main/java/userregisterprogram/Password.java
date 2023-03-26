package userregisterprogram;
import java.util.*;
import java.util.regex.Pattern;

public class Password {
    public static Object Password2(String name){

        boolean result = Pattern.matches("[A-Z]{1}[a-z]{3}[@][0-9]{2}", name);

        return result;
    }


    public static void main(String[] args) {

    }

}
