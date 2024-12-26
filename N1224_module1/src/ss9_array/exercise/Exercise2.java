package ss9_array.exercise;


import java.util.Scanner;

public class Exercise2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("nhập số lượng nhân viên: ");
        int n = Integer.parseInt(sc.nextLine());
        String[] fullName = new String[n];
        int[] age = new int[n];
        int[] gender = new int[n];
        double[] salary = new double[n];
        double[] avgScore = new double[n];
        inputEmployee(fullName, age, gender, salary, avgScore, n);
        outputEmployee(fullName, age, gender, salary, avgScore, n);
    }

    public static void inputEmployee(String[] fullName, int[] age, int[] gender, double[] salary, double[] avgScore, int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập tên nhân viên thứ %d: ", i + 1);
            fullName[i] = sc.nextLine();
            System.out.printf("Nhập tuổi nhân viên thứ %d: ", i + 1);
            age[i] = Integer.parseInt(sc.nextLine());
            do {
                System.out.printf("Chọn giới tính nhân viên thứ %d \n1. Nam\n2. Nữ\n3. Khác \nLựa chọn của bạn là: ", i + 1);
                gender[i] = Integer.parseInt(sc.nextLine());
                if (gender[i] > 3 || gender[i] < 1) {
                    System.out.println("Giới tính không hợp lệ, vui lòng nhập lại!");
                }
            } while (gender[i] > 3 || gender[i] < 1);
            System.out.printf("Nhập lương nhân viên thứ %d: ", i + 1);
            salary[i] = Double.parseDouble(sc.nextLine());
            do {
                System.out.printf("Nhập điểm trung bình nhân viên thứ %d: ", i + 1);
                avgScore[i] = Double.parseDouble(sc.nextLine());
                if (avgScore[i] < 0 || avgScore[i] > 10) {
                    System.out.println("Điểm trung bình không hợp lệ, vui lòng nhập lại!");
                }
            } while (avgScore[i] < 0 || avgScore[i] > 10);
        }

    }

    public static void outputEmployee(String[] fullName, int[] age, int[] gender, double[] salary, double[] avgScore, int n) {
        System.out.println("Danh sách nhân viên: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("======Nhân viên thứ %d======\n", i + 1);
            System.out.println("Tên: " + fullName[i]);
            System.out.println("Tuổi: " + age[i]);
            System.out.println("Giới tính: " + ((gender[i] == 1) ? "Nam" : gender[i] == 2 ? "Nữ" : "Khác"));
            System.out.println("Lương: " + salary[i]);
            System.out.println("Điểm trung bình: " + avgScore[i]);
        }
    }
}