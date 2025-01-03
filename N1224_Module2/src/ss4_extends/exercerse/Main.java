package ss4_extends.exercerse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<DienThoaiCu> oldPhonesList = new ArrayList<>();
    static ArrayList<DienThoaiMoi> newPhonesList = new ArrayList<>();

    static {
        oldPhonesList.add(new DienThoaiCu("DTC001", "Iphone 13 Pro Max", 200000.0, 12, "Apple", 95, "Còn zin"));
        oldPhonesList.add(new DienThoaiCu("DTC002", "Iphone 13 Pro", 9000000.0, 12, "Apple", 90, "Mất zin"));
        newPhonesList.add(new DienThoaiMoi("DTM001", "Iphone 16 Pro Max 1T", 99999999.0, 24, "Apple", 30));
        newPhonesList.add(new DienThoaiMoi("DTM002", "Iphone 15 Pro Max", 77777777.0, 24, "Apple", 50));
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("=============MENU=============");
            System.out.println("1. Xem danh sách điện thoại");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Xắp xếp theo giá");
            System.out.println("6. Tìm kiếm");
            System.out.println("7. Tính tổng tiền");
            System.out.println("8. Giảm giá cho điện thoại cũ");
            System.out.println("9. Thoát");
            System.out.println("=========================================");

            System.out.print("Chọn chức năng mong muốn: ");
            choice = Integer.parseInt(sc.nextLine());
            if (choice < 1 || choice > 9) {
                System.out.println("Không có chức năng đó, vui lòng nhập lại !!!!!!");
                continue;
            }

            switch (choice) {
                case 1:
                    showList();
                    break;
                case 2:
                    addPhone();
                    break;
                case 3:
                    updatePhone();
                    break;
                case 4:
                    deletePhone();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                default:
                    return;
            }
        } while (true);
    }

    public static void showList() {
        while (true) {
            int choose;
            do {
                System.out.println("=============DANH SÁCH ĐIỆN THOẠI=============");
                System.out.println("1. Xem tất cả");
                System.out.println("2. Xem điện thoại cũ");
                System.out.println("3. Xem điện thoại mới");
                System.out.println("4. Trở về menu chính");

                System.out.print("Mời bạn lựa chọn: ");
                choose = Integer.parseInt(sc.nextLine());

                switch (choose) {
                    case 1:
                        System.out.println("=======DANH SÁCH TẤT CẢ ĐIỆN THOẠI=======");
                        for (int i = 0; i < oldPhonesList.size(); i++) {
                            System.out.println("********Thông tin điện thoại thứ " + (i + 1));
                            oldPhonesList.get(i).output();
                        }
                        for (int i = 0; i < newPhonesList.size(); i++) {
                            System.out.println("********Thông tin điện thoại thứ " + (i + 1 + oldPhonesList.size()));
                            newPhonesList.get(i).output();
                        }
                        break;
                    case 2:
                        System.out.println("=======DANH SÁCH ĐIỆN THOẠI CŨ=======");
                        for (int i = 0; i < oldPhonesList.size(); i++) {
                            System.out.println("********Thông tin điện thoại thứ " + (i + 1));
                            oldPhonesList.get(i).output();
                        }
                        break;
                    case 3:
                        System.out.println("=======DANH SÁCH ĐIỆN THOẠI MỚI=======");
                        for (int i = 0; i < newPhonesList.size(); i++) {
                            System.out.println("********Thông tin điện thoại thứ " + (i + 1));
                            newPhonesList.get(i).output();
                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Không có chức năng đó, vui lòng nhập lại !!!!!!");
                }
            } while (choose < 1 || choose > 4);
        }
    }

    public static void addPhone(){
        while (true) {
            int choose;
            do {
                System.out.println("=============THÊM MỚI ĐIỆN THOẠI=============");
                System.out.println("1. Thêm mới điện thoại mới");
                System.out.println("2. Thêm mới điện thoại cũ");
                System.out.println("3. Trở về menu chính");

                System.out.print("Mời bạn lựa chọn: ");
                choose = Integer.parseInt(sc.nextLine());

                switch (choose) {
                    case 1:
                        DienThoaiMoi newPhones = new DienThoaiMoi();
                        newPhones.setId(Main.getNewPhoneId());
                        newPhones.input();
                        newPhonesList.add(newPhones);
                        break;
                    case 2:
                        DienThoaiCu oldPhones = new DienThoaiCu();
                        oldPhones.setId(Main.getOldPhoneId());
                        oldPhones.input();
                        oldPhonesList.add(oldPhones);
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Không có chức năng đó, vui lòng nhập lại !!!!!!");
                }
            } while (choose < 1 || choose > 3);
        }
    }

    public static String getNewPhoneId() {
        if (newPhonesList.isEmpty()) {
            return "DTM001";
        }

        String lastId = newPhonesList.get(newPhonesList.size() - 1).getId();
        int numberPart = Integer.parseInt(lastId.substring(3));
        numberPart++;

        return String.format("DTM%03d", numberPart);
    }

    public static String getOldPhoneId() {
        if (oldPhonesList.isEmpty()) {
            return "DTC001";
        }

        String lastId = oldPhonesList.get(oldPhonesList.size() - 1).getId();
        int numberPart = Integer.parseInt(lastId.substring(3));
        numberPart++;

        return String.format("DTM%03d", numberPart);
    }

    public static void updatePhone(){
        System.out.println("============UPDATE PHONE==========");
        System.out.println("Nhập vào mã điện thoại: ");
        String idPhone = sc.nextLine();
        if(idPhone.startsWith("DTC")){
            for(DienThoaiCu oldPhone : oldPhonesList){
                if(oldPhone.getId().equals(idPhone)){
                    oldPhone.input();
                    System.out.println("Cập nhật thành công !!!!");
                }else{
                    System.out.println("Không tìm thấy mã!!!");
                }
            }
        }else if(idPhone.startsWith("DTM")){
            for(DienThoaiMoi newPhone : newPhonesList){
                if(newPhone.getId().equals(idPhone)){
                    newPhone.input();
                    System.out.println("Cập nhật thành công !!!!");
                }else{
                    System.out.println("Không tìm thấy mã!!!");
                }
            }
        }else{
            System.out.println("Mã không hợp lệ !!!!!");
        }
    }

    public static void deletePhone(){
        System.out.println("=============DELETE PHONE============");
        System.out.println("Nhập vào mã điện thoại: ");
        String idPhone = sc.nextLine();
        if(idPhone.startsWith("DTC")){
            for(DienThoaiCu oldPhone : oldPhonesList){
                if(oldPhone.getId().equals(idPhone)){
                    oldPhonesList.remove(oldPhone);
                    System.out.println("Xóa thành công !!!!");
                }else{
                    System.out.println("Không tìm thấy mã!!!");
                }
            }
        }else if(idPhone.startsWith("DTM")){
            for(DienThoaiMoi newPhone : newPhonesList){
                if(newPhone.getId().equals(idPhone)){
                    newPhonesList.remove(newPhone);
                    System.out.println("Xóa thành công !!!!");
                }else{
                    System.out.println("Không tìm thấy mã!!!");
                }
            }
        }else{
            System.out.println("Mã không hợp lệ !!!!!");
        }
    }

}
