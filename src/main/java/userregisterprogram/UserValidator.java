package userregisterprogram;

public class UserValidator {
    public static void main(String[] args) {
        String firstName = "Aswin";
        String lastName = "Reddy";
        String email = "ashu@example.com";
        String mobile = "917654321980";
        String password = "As123@4";

        // Using lambda functions to validate user entries
        validate(firstName, s -> s.matches("^[A-Z]{1}[a-z]{2,}$"), "Invalid first name");
        validate(lastName, s -> s.matches("^[A-Z]{1}[a-z]{2,}$"), "Invalid last name");
        validate(email, s -> s.matches("^[^.][A-Za-z0-9+-.]{1,}@[A-Za-z0-9+_-]{0,}[.][com|in|au|net]{1,3}[.]{0,1}[com|in|au|net]{1,3}$"), "Invalid email");
        validate(mobile, s -> s.matches("^[91]{2}[0-9]{10}$"), "Invalid mobile number");
        validate(password, s -> s.matches("[A-Z]{1}[a-z]{3}[@][0-9]{2}"), "Invalid password");
    }

    private static void validate(String input, UserValidator validator, String errorMessage) {
        if (validator.validate(input)) {
            System.out.println(input + " is valid.");
        } else {
            System.out.println(input + " is not valid. " + errorMessage);
        }
    }
}


