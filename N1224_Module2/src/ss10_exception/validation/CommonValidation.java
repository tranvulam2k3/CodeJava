package ss10_exception.validation;

import ss10_exception.exception.EmptyFieldException;
import ss10_exception.exception.MinLengthException;
import ss10_exception.exception.NegativeNumberException;
import ss10_exception.exception.NumberOutOfRangeException;

public class CommonValidation {
    public static void validationIsEmpty(String value, String fieldName) throws EmptyFieldException {
        if (value.isEmpty()) {
            throw new EmptyFieldException(fieldName + "không được để trống !");
        }
    }

    public static int parseInt(String value, String fieldName) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new NumberFormatException(fieldName + "phải là số nguyên !");
        }
    }

    public static double parseDouble(String value, String fieldName) {
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            throw new NumberFormatException(fieldName + "phải là số thực !");
        }
    }

    public static void validationNumberOutOfRangeException(double value, String fieldName, double minValue, double maxValue)
            throws NumberOutOfRangeException {
        if (value < minValue || value > maxValue) {
            throw new NumberOutOfRangeException(String.format("%s nam ngoai khoang gia tri hop le [%s , %s]", fieldName, maxValue, maxValue));
        }
    }

    public static void validateMinLength(String value, String fieldName, int minLength) throws MinLengthException {
        if (value.length() < minLength) {
            throw new MinLengthException(String.format("%s phải có ít nhất %s kí tự.", fieldName, minLength));
        }
    }

    public static void validateIsNegativeNumber(double value, String fieldName) throws NegativeNumberException {
        if (value < 0) {
            throw new NegativeNumberException(fieldName + "không được số âm");
        }
    }
}
