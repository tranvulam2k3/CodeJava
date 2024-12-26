package ss10_arraylist.exercise;

import java.util.*;

public class Exercise3 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> fullName = new ArrayList<>();
    static ArrayList<Integer> age = new ArrayList<>();
    static ArrayList<Integer> gender = new ArrayList<>();
    static ArrayList<Double> salary = new ArrayList<>();
    static ArrayList<Double> avgScore = new ArrayList<>();

    public static void main(String[] args) {

        System.out.print("Nhập số lượng nhân viên cần thêm: ");
        int n = sc.nextInt();

        inputEmployee(n);
        System.out.println("============Danh sách nhân viên============ ");
        for (int i = 0; i < n; i++)
            outputEmployee(i);

        int index = findHighestAvgScore(avgScore);
        System.out.println("==========================================");
        System.out.println("Nhân viên có điểm trung bình cao nhất là: ");
        outputEmployee(index);

        System.out.println("==========================================");
        System.out.print("Nhập tên nhân viên cần tìm: ");
        String name = sc.nextLine();
        findEmployeeByFullname(name);

        sortByAge();
        System.out.println("==========================================");
        System.out.println("Danh sách nhân viên sau khi sắp xếp theo tuổi: ");
        for (int i = 0; i < n; i++)
            outputEmployee(i);

    }

    public static void inputEmployee(int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("========Mời nhập thông tin nhân viên thứ %d======== ", i + 1);
            System.out.printf("Nhập tên nhân viên thứ %d: ", i + 1);
            fullName.add(sc.nextLine());

            System.out.printf("Nhập tuổi nhân viên thứ %d: ", i + 1);
            age.add(Integer.parseInt(sc.nextLine()));

            int choose;
            do {
                System.out.printf("Chọn giới tính nhân viên thứ %d \n1. Nam\n2. Nữ\n3. Khác \nLựa chọn của bạn là: ", i + 1);
                choose = Integer.parseInt(sc.nextLine());
                if (choose > 3 || choose < 1) {
                    System.out.println("Giới tính không hợp lệ, vui lòng nhập lại!");
                }
            } while (choose > 3 || choose < 1);
            gender.add(choose);

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

    public static void outputEmployee(int i) {
        System.out.printf("======Nhân viên thứ %d======\n", i + 1);
        System.out.println("Tên: " + fullName.get(i));
        System.out.println("Tuổi: " + age.get(i));
        System.out.println("Giới tính: " + (gender.get(i) == 1 ? "Nam" : gender.get(i) == 2 ? "Nữ" : "Khác"));
        System.out.println("Lương: " + salary.get(i));
        System.out.println("Điểm trung bình: " + avgScore.get(i));
    }

    public static int findHighestAvgScore(ArrayList<Double> avgScore) {
        double max = avgScore.get(0);
        int index = 0;
        for (int i = 1; i < avgScore.size(); i++) {
            if (avgScore.get(i) > max) {
                max = avgScore.get(i);
                index = i;
            }
        }
        return index;
    }

    public static void findEmployeeByFullname(String name) {
        for (int i = 0; i < fullName.size(); i++) {
            if (fullName.get(i).equals(name)) {
                outputEmployee(i);
            }
        }
    }

    public static void sortByAge() {
        for (int i = 0; i < age.size() - 1; i++) {
            for (int j = i + 1; j < age.size(); j++) {
                if (age.get(i) > age.get(j)) {
                    Collections.swap(age, i, j);
                    Collections.swap(fullName, i, j);
                    Collections.swap(gender, i, j);
                    Collections.swap(salary, i, j);
                    Collections.swap(avgScore, i, j);
                }
            }
        }
    }
}