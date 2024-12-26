package ss9_array.exercise;

import java.util.*;

public class Exercise3 {
    static Scanner sc = new Scanner(System.in);
    static String[] fullName;
    static int[] age;
    static int[] gender;
    static double[] salary;
    static double[] avgScore;

    public static void main(String[] args) {
        System.out.print("Nhập số lượng nhân viên: ");
        int n = Integer.parseInt(sc.nextLine());

        fullName = new String[n];
        age = new int[n];
        gender = new int[n];
        salary = new double[n];
        avgScore = new double[n];

        inputEmployee(n);
        System.out.println("===============Danh sách nhân viên=============== ");
        for (int i = 0; i < n; i++)
            outputEmployee(i);

        int index = findHighestAvgScore(avgScore);
        System.out.println("============================== ");
        System.out.println("Nhân viên có điểm trung bình cao nhất là: ");
        outputEmployee(index);

        System.out.println("============================== ");
        System.out.print("Nhập tên nhân viên cần tìm: ");
        String name = sc.nextLine();
        findEmployeeByFullname(name, n);

        sortByAge(n);
        System.out.println("============================== ");
        System.out.println("Danh sách nhân viên sau khi sắp xếp theo tuổi: ");
        for (int i = 0; i < n; i++)
            outputEmployee(i);
    }

    public static void inputEmployee(int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("=====Nhập thông tin nhân viên thứ %d=====", i + 1);
            System.out.printf("\nNhập tên nhân viên thứ %d: ", i + 1);
            fullName[i] = sc.nextLine();

            System.out.printf("Nhập tuổi nhân viên thứ %d: ", i + 1);
            age[i] = Integer.parseInt(sc.nextLine());

            int g;
            do {
                System.out.printf("Chọn giới tính nhân viên thứ %d \n1. Nam\n2. Nữ\n3. Khác \nLựa chọn của bạn là: ", i + 1);
                g = Integer.parseInt(sc.nextLine());
                if (g > 3 || g < 1) {
                    System.out.println("Giới tính không hợp lệ, vui lòng nhập lại!");
                }
            } while (g > 3 || g < 1);
            gender[i] = g;

            System.out.printf("Nhập lương nhân viên thứ %d: ", i + 1);
            salary[i] = Double.parseDouble(sc.nextLine());

            double score;
            do {
                System.out.printf("Nhập điểm trung bình nhân viên thứ %d: ", i + 1);
                score = Double.parseDouble(sc.nextLine());
                if (score < 0 || score > 10) {
                    System.out.println("Điểm trung bình không hợp lệ, vui lòng nhập lại!");
                }
            } while (score < 0 || score > 10);
            avgScore[i] = score;
        }
    }

    public static void outputEmployee(int i) {
        System.out.printf("======Nhân viên thứ %d======\n", i + 1);
        System.out.println("Tên: " + fullName[i]);
        System.out.println("Tuổi: " + age[i]);
        System.out.println("Giới tính: " + (gender[i] == 1 ? "Nam" : gender[i] == 2 ? "Nữ" : "Khác"));
        System.out.println("Lương: " + salary[i]);
        System.out.println("Điểm trung bình: " + avgScore[i]);
    }

    public static int findHighestAvgScore(double[] avgScore) {
        double max = avgScore[0];
        int index = 0;
        for (int i = 1; i < avgScore.length; i++) {
            if (avgScore[i] > max) {
                max = avgScore[i];
                index = i;
            }
        }
        return index;
    }

    public static void findEmployeeByFullname(String name, int n) {
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (fullName[i].equalsIgnoreCase(name)) {
                outputEmployee(i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy nhân viên nào có tên: " + name);
        }
    }

    public static void sortByAge(int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (age[i] > age[j]) {
                    swap(i, j);
                }
            }
        }
    }

    public static void swap(int i, int j) {
        int tempAge = age[i];
        age[i] = age[j];
        age[j] = tempAge;

        String tempName = fullName[i];
        fullName[i] = fullName[j];
        fullName[j] = tempName;

        int tempGender = gender[i];
        gender[i] = gender[j];
        gender[j] = tempGender;

        double tempSalary = salary[i];
        salary[i] = salary[j];
        salary[j] = tempSalary;

        double tempAvgScore = avgScore[i];
        avgScore[i] = avgScore[j];
        avgScore[j] = tempAvgScore;
    }
}