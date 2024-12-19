package ss7_debug_string.exercise;

public class Exercise2 {
    public static void main(String[] args) {
        //a
        String aStr = "1000000";
        int a = Integer.parseInt(aStr);

        //b
        String b = String.valueOf(a);

        //c
        String cStr = "1234567890123456789";
        long c = Long.parseLong(cStr);

        //d
        String d = String.valueOf(c);

        //e
        String eStr = "12.2F";
        float e = Float.parseFloat(eStr);

        //f
        String fStr = String.valueOf(e);

        //g
        String gStr = "9.8D";
        double g = Double.parseDouble(gStr);

        //h
        String hStr = String.valueOf(g);

        //i
        String iStr = "100";
        short i = Short.parseShort(iStr);

        //k
        String kStr = String.valueOf(i);
    }
}
