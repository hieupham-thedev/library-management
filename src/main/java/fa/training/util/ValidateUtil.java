package fa.training.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidateUtil {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    public static boolean isValidNumber(String number) {
        try {
            Integer.valueOf(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isNonEmptyString(String string) {
        if (string != null && string.trim().length() > 0) {
            return true;
        }
        return false;
    }

    public static boolean isValidDate(String date) {
        if (date != null) {
            try {
                dateFormat.parse(date);
                return true;
            } catch (ParseException e) {
                return false;
            }
        }
        return false;
    }

    public static Date formatDate(String date) {
        try {
            return dateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
