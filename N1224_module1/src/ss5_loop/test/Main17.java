package ss5_loop.test;

public class Main17 {
    public static void main(String[] args) {
        int n = 123;
        // a.Check so doi xung
        String str = Integer.toString(n);

        boolean isSymetric = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isSymetric = false;
                break;
            }
        }
        if (isSymetric) {
            System.out.printf("%d la so doi xung", n);
        } else {
            System.out.printf("%d khong phai la so doi xung", n);
        }

        // b.Check so nguyen to
        boolean isElement = true;
        if (n < 2) {
            isElement = false;
        }
        for (int ii = 2; ii < n; ii++) {
            if (n % ii == 0) {
                isElement = false;
                break;
            }
        }
        if (isElement) {
            System.out.printf("\n%d la so nguyen to", n);
        } else {
            System.out.printf("\n%d khong phai nguyen to", n);
        }

        //c. Check cac chu so co tang dan
        String str1 = Integer.toString(n);
        boolean isAscending = true;

        for (int iii = 0; iii < str1.length() - 1; iii++) {
            if (str.charAt(iii) >= str1.charAt(iii + 1)) {
                isAscending = false;
                break;
            }
        }
        if (isAscending) {
            System.out.printf("\n%d chua cac so tang dan", n);
        } else {
            System.out.printf("\n%d khong chua cac so tang dan", n);
        }
    }
}
