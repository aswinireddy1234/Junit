package userregisterprogram;
import java.util.*;
import java.util.regex.Pattern;

public class Email {

        public static Object Email2(String name){

            boolean result = Pattern.matches("^[\\w. ]{1,}[@][a-z]{1,}[.]com$", name);

            return result;
        }


        public static void main(String[] args) {

        }

}
