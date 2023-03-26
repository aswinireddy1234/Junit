package userregisterprogram;
import java.util.*;
import java.util.regex.Pattern;

public class PhoneNumber {

        public static Object PhoneNumber2(String name){

            boolean result = Pattern.matches("[91]{2}\\s[0-9]{10}+", name);

            return result;
        }


        public static void main(String[] args) {

        }

}
