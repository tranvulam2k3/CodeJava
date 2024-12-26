package ss8_date_time.exercise;

public class Exercise3 {
    public static void main(String[] args) {
        byte byteValue = 100;
        short shortValue = byteValue;
        int intValue = shortValue;
        long longValue = intValue;
        float floatValue = longValue;
        double doubleValue = floatValue;

        double doubleValue2 = 100;
        float floatValue2 = (float) doubleValue2;
        long longValue2 = (long) floatValue2;
        int intValue2 = (int)longValue2;
        short shortValue2 = (short)intValue2;
        byte byteValue2 = (byte)shortValue2;

        double doubleValue22 = 123123.12;
        float floatValue22 = (float) doubleValue22;
        long longValue22 = (long) floatValue22;
        int intValue22 = (int)longValue22;
        short shortValue22 = (short)intValue22;
        byte byteValue22 = (byte)shortValue22;
    }
}
