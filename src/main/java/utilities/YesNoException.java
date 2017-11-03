package utilities;

public class YesNoException {

    public static String throwYesNoException(String input) throws Exception {
        if (!("yes".equalsIgnoreCase(input) || "no".equalsIgnoreCase(input))) {
            throw new Exception("You didn't enter yes or no.");
        }
        else {
            return input;
        }
    }

}
