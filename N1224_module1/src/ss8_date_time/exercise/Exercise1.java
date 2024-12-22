package ss8_date_time.exercise;

public class Exercise1 {
    public static void main(String[] args) {
        String str = "Hello World";

        //a.
        StringBuilder stringBuilder = new StringBuilder(str);
        String str1 = stringBuilder.substring(6);

        StringBuffer stringBuffer = new StringBuffer(str);
        String str2 = stringBuffer.substring(6);

        System.out.println("Cau A");
        System.out.println(str1);
        System.out.println(str2);

        //b.
        stringBuilder.replace(4, 5, "f");
        stringBuffer.replace(4, 5, "f");

        System.out.println("Cau B");
        System.out.println(stringBuilder);
        System.out.println(stringBuffer);

        //c.
        String str3 = "Hello";
        String str4 = "World";

        String result1 = str3 + str4;
        StringBuilder stringBuilder1 = new StringBuilder(str3);
        stringBuilder1.append(str4);
        String result2 = stringBuilder1.toString();

        StringBuffer stringBuffer1 = new StringBuffer(str3);
        stringBuffer1.append(str4);
        String result3 = stringBuffer1.toString();

        System.out.println("Cau C");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        //d.
        String a = "A";
        String b = new String("A");
        String c = "C";

        b.concat("B");

        String d = c.concat("C");

        StringBuffer e = new StringBuffer("E");
        e.append("F");

        StringBuilder g = new StringBuilder("G");
        g.append("H");

        System.out.println("Cau D");
        System.out.println(a + b + c + d + e + g);

        //e.
        String str6 = "Hello";
        String str7 = new String("Hello");
        String str8 = "Hello";

        System.out.println("So sánh String");
        System.out.println("str6.equals(str7): " + str6.equals(str7));
        System.out.println("str6 == str7: " + str6 == str7);
        System.out.println("str7 == str8: " + str7 == str8);

        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("Hello");
        System.out.println("\nSo sánh StingBuffer");
        System.out.println("sb1.equals(sb2): " + sb1.equals(sb2));
        System.out.println("sb1 == sb2: " + (sb1 == sb2));

        StringBuilder sb3 = new StringBuilder("Hello");
        StringBuilder sb4 = new StringBuilder("Hello");
        System.out.println("\nSo sánh StingBuidle");
        System.out.println("sb3.equals(sb4): " + sb3.equals(sb4));
        System.out.println("sb3 == sb4: " + (sb3 == sb4));


    }
}
