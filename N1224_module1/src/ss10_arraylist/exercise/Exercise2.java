package ss10_arraylist.exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> fullName = new ArrayList<>();
    static ArrayList<Integer> age = new ArrayList<>();
    static ArrayList<Integer> gender = new ArrayList<>();
    static ArrayList<Double> salary = new ArrayList<>();
    static ArrayList<Double> avgScore = new ArrayList<>();

    public static void main(String[] args) {

        System.out.print("Nhập số lượng nhân viên cần thêm: ");
        int n = Integer.parseInt(sc.nextLine());

        input(fullName, age, gender, salary, avgScore, n);
        output(fullName, age, gender, salary, avgScore);
    }

    public static void input(ArrayList<String> fullName, ArrayList<Integer> age, ArrayList<Integer> gender, ArrayList<Double> salary, ArrayList<Double> avgScore, int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("========Mời nhập thông tin nhân viên thứ %d======== ", i + 1);
            System.out.printf("\nNhập tên nhân viên thứ %d: ", i + 1);
            fullName.add(sc.nextLine());

            System.out.printf("Nhập tuổi nhân viên thứ %d: ", i + 1);
            age.add(Integer.parseInt(sc.nextLine()));

            int g;
            do {
                System.out.printf("Chọn giới tính nhân viên thứ %d \n1. Nam\n2. Nữ\n3. Khác \nLựa chọn của bạn là: ", i + 1);
                g = Integer.parseInt(sc.nextLine());
                if (g > 3 || g < 1) {
                    System.out.println("Giới tính không hợp lệ, vui lòng nhập lại!");
                }
            } while (g > 3 || g < 1);
            gender.add(g);

            System.out.printf("Nhập lương nhân viên thứ %d: ", i + 1);
            salary.add(Double.parseDouble(sc.nextLine()));

            double score;
            do {
                System.out.printf("Nhập điểm trung bình nhân viên thứ %d: ", i + 1);
                score = Double.parseDouble(sc.nextLine());
                if (score < 0 || score > 10) {
                    System.out.println("Điểm trung bình không hợp lệ, vui lòng nhập lại!");
                }
            } while (score < 0 || score > 10);
            avgScore.add(score);
        }
    }

    public static void output(ArrayList<String> fullName, ArrayList<Integer> age, ArrayList<Integer> gender, ArrayList<Double> salary, ArrayList<Double> avgScore) {
        System.out.println("============Danh sách nhân viên============ ");
        for (int i = 0; i < fullName.size(); i++) {
            System.out.printf("======Nhân viên thứ %d======", i + 1);
            System.out.println("\nTên: " + fullName.get(i));
            System.out.println("Tuổi: " + age.get(i));
            System.out.println("Giới tính: " + (gender.get(i) == 1 ? "Nam" : gender.get(i) == 2 ? "Nữ" : "Khác"));
            System.out.println("Lương: " + salary.get(i));
            System.out.println("Điểm trung bình: " + avgScore.get(i));
        }
    }
}