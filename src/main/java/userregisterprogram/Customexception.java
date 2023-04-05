package userregisterprogram;
import java.util.regex.Pattern;

public class Customexception {
    public static Object firstName(String name) {

        boolean result = Pattern.matches("[A-Za-z]{3,10}", name);
//        boolean result = Pattern.matches("^Cap\\w{2,}$", name);
        return result;
    }

    public static Object LastName(String LastNametest) {

        boolean LastName = Pattern.matches("[A-Za-z]{3,10}", LastNametest);
        return LastName;
    }

    public static Object ValidEmail(String ValidEmail) {

//        boolean Email = Pattern.matches("[a-zA-Z0-9]+[@][a-z]+[.][a-z]{2,}", ValidEmail);
        boolean Email = Pattern.matches("^[\\w. ]{1,}[@][a-z]{1,}[.]com$", ValidEmail);
        return Email;
    }


        public static Object PhoneNumber(String name){

            boolean result = Pattern.matches("[91]{2}\\s[0-9]{10}+", name);

            return result;

//        boolean LastName = Pattern.matches("[91 ]+[0-9]{10}", ValidNumber);
 //       return LastName;
    }

    public static Object Checkpassword(String password) {
        boolean pass = Pattern.matches("(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}", password);
        return pass;
    }


    public static void main(String[] args) {
    }
}