package ss5_overrice_overloading.exercise3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<DienThoai> phone = new ArrayList<>();

    static {
        phone.add(new DienThoaiCu("DTC001", "Iphone 13 Pro Max", new BigDecimal("9000000.0"), 12, "Apple", 95, "Còn zin"));
        phone.add(new DienThoaiCu("DTC002", "Iphone 13 Pro", new BigDecimal("8900000.0"), 12, "Apple", 90, "Mất zin"));
        phone.add(new DienThoaiMoi("DTM001", "Iphone 16 Pro Max 1T", new BigDecimal("90000000.0"), 24, "Apple", 30));
        phone.add(new DienThoaiMoi("DTM002", "Iphone 15 Pro Max", new BigDecimal("50000000.0"), 24, "Apple", 50));
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("=============MENU=============");
            System.out.println("1. XEM DANH SÁCH ĐIỆN THOẠI");
            System.out.println("2. THÊM MỚI");
            System.out.println("3. CẬP NHẬT");
            System.out.println("4. XÓA");
            System.out.println("5. XẮP XẾP THEO GIÁ");
            System.out.println("6. TÌM KIẾM");
            System.out.println("7. TÍNH TỔNG TIỀN");
            System.out.println("8. GIẢM GIÁ CHO ĐIỆN THOẠI CŨ");
            System.out.println("9. THOÁT");
            System.out.println("=========================================");

            System.out.print("CHỌN CHỨC NĂNG MUỐN CHỌN: ");
            choice = Integer.parseInt(sc.nextLine());
            if (choice < 1 || choice > 9) {
                System.out.println("KHÔNG CÓ CHỨC NĂNG ĐÓ, VUI LÒNG CHỌN LẠI !!!!!!");
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
                    sortByMount();
                    break;
                case 6:
                    findPhone();
                    break;
                case 7:
                    System.out.println("TỔNG CỦA TẤT CẢ ĐIỆN THOẠI: " + moneyPhone());
                    break;
                case 8:
                    System.out.println("NHẬP VÀO PHẦN TRĂM MUỐN GIẢM GIÁ: ");
                    BigDecimal percent = new BigDecimal(sc.nextLine());
                    applyDiscountToOldPhone(percent);
                    System.out.println("ĐÃ GIẢM GIÁ !!!!");
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
                System.out.println("1. XEM TẤT CẢ");
                System.out.println("2. XEM ĐIỆN THOẠI CŨ");
                System.out.println("3. XEM ĐIỆN THOẠI MỚI");
                System.out.println("4. TRỞ VỀ MENU CHÍNH");

                System.out.print("CHỌN CHỨC NĂNG MUỐN CHỌN: ");
                choose = Integer.parseInt(sc.nextLine());

                switch (choose) {
                    case 1:
                        System.out.println("=======DANH SÁCH TẤT CẢ ĐIỆN THOẠI=======");
                        for (int i = 0; i < phone.size(); i++) {
                            phone.get(i).output();
                            System.out.println("=============================");
                        }
                        break;
                    case 2:
                        System.out.println("=======DANH SÁCH ĐIỆN THOẠI CŨ=======");
                        for (DienThoai phone : phone) {
                            if (phone.getId().startsWith("DTC")) {
                                phone.output();
                                System.out.println("=============================");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("=======DANH SÁCH ĐIỆN THOẠI MỚI=======");
                        for (DienThoai phone : phone) {
                            if (phone.getId().startsWith("DTM")) {
                                phone.output();
                                System.out.println("=============================");
                            }
                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("KHÔNG CÓ CHỨC NĂNG ĐÓ, VUI LÒNG CHỌN LẠI !!!!!!");
                }
            } while (choose < 1 || choose > 4);
        }
    }

    public static void addPhone() {
        while (true) {
            int choose;
            do {
                System.out.println("=============THÊM MỚI ĐIỆN THOẠI=============");
                System.out.println("1. THÊM MỚI ĐIỆN THOẠI MỚI");
                System.out.println("2. THÊM MỚI ĐIỆN THOẠI CŨ");
                System.out.println("3. TRỞ VỀ MENU CHÍNH");

                System.out.print("CHỌN CHỨC NĂNG MUỐN CHỌN: ");
                choose = Integer.parseInt(sc.nextLine());

                switch (choose) {
                    case 1:
                        DienThoaiMoi newPhones = new DienThoaiMoi();
                        newPhones.setId(Main.getNewPhoneId());
                        newPhones.input();
                        phone.add(newPhones);
                        break;
                    case 2:
                        DienThoaiCu oldPhones = new DienThoaiCu();
                        oldPhones.setId(Main.getOldPhoneId());
                        oldPhones.input();
                        phone.add(oldPhones);
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("KHÔNG CÓ CHỨC NĂNG ĐÓ, VUI LÒNG CHỌN LẠI !!!!!!");
                }
            } while (choose < 1 || choose > 3);
        }
    }

    public static String getNewPhoneId() {
        int temp = 0;
        String lastId = "";
        for (int i = 0; i < phone.size(); i++) {
            if (phone.get(i).getId().startsWith("DTM")) {
                temp++;
                lastId = phone.get(i).getId();
            }
        }

        if (temp != 0) {
            int numberPart = Integer.parseInt(lastId.substring(3));
            numberPart++;
            return String.format("DTM%03d", numberPart);
        }
        return "DTM001";
    }

    public static String getOldPhoneId() {
        int temp = 0;
        String lastId = "";
        for (int i = 0; i < phone.size(); i++) {
            if (phone.get(i).getId().startsWith("DTC")) {
                temp++;
                lastId = phone.get(i).getId();
            }
        }

        if (temp != 0) {
            int numberPart = Integer.parseInt(lastId.substring(3));
            numberPart++;
            System.out.println(numberPart);
            return String.format("DTC%03d", numberPart);
        }
        return "DTC001";
    }

    public static void updatePhone() {
        System.out.println("============UPDATE PHONE==========");
        System.out.println("NHẬP VÀO MÃ ĐIỆN THOẠI: ");
        String idPhone = sc.nextLine();
        boolean found = false;

        for (DienThoai phones : phone) {
            if (phones.getId().equalsIgnoreCase(idPhone)) {
                found = true;
                if (phones.getId().startsWith("DTC")) {
                    DienThoaiCu oldPhone = (DienThoaiCu) phones;
                    oldPhone.input();
                    System.out.println("*** CẬP NHẬT THÔNG TIN ĐIỆN THOẠI CŨ THÀNH CÔNG!!!");
                } else if (phones.getId().startsWith("DTM")) {
                    DienThoaiMoi newPhone = (DienThoaiMoi) phones;
                    newPhone.input();
                    System.out.println("*** CẬP NHẬT THÔNG TIN ĐIỆN THOẠI MỚI THÀNH CÔNG!!!");
                }
                break;
            }
        }
        if (!found) {
            System.out.println("KHÔNG TÌM THẤY MÃ ĐIỆN THOẠI ĐÓ!!!");
        }
    }

    public static void deletePhone() {
        System.out.println("=============DELETE PHONE============");
        System.out.println("NHẬP VÀO MÃ ĐIỆN THOẠI: ");
        String idPhone = sc.nextLine();
        boolean found = false;

        for (DienThoai phones : phone) {
            if (phones.getId().equalsIgnoreCase(idPhone)) {
                found = true;
                phone.remove(phones);
                System.out.println("*** ĐÃ XÓA THÀNH CÔNG!");
                break;
            }
        }
        if (!found) {
            System.out.println("KHÔNG TÌM THẤY MÃ ĐIỆN THOẠI ĐÓ!!!");
        }
    }

    public static void sortByMount() {
        while (true) {
            int choose;
            do {
                System.out.println("=============XẮP XẾP ĐIỆN THOẠI THEO GIÁ=============");
                System.out.println("1. TĂNG DẦN");
                System.out.println("2. GIẢM DẦN");
                System.out.println("3. TRỞ VỀ MENU CHÍNH");

                System.out.print("CHỌN CHỨC NĂNG MUỐN CHỌN: ");
                choose = Integer.parseInt(sc.nextLine());

                switch (choose) {
                    case 1:
                        phone.sort(Comparator.comparing(DienThoai::getGiaDienThoai));
                        System.out.println("*** SẮP XẾP TĂNG DẦN THÀNH CÔNG!!!");
                        break;
                    case 2:
                        phone.sort(Comparator.comparing(DienThoai::getGiaDienThoai).reversed());
                        System.out.println("*** SẮP XẾP GIẢM DẦN THÀNH CÔNG!!!");
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("KHÔNG CÓ CHỨC NĂNG ĐÓ, VUI LÒNG CHỌN LẠI !!!!!!");
                }
            } while (choose < 1 || choose > 3);
        }
    }

    public static void findPhone() {
        while (true) {
            int choose;
            do {
                System.out.println("=============TÌM KIẾM ĐIỆN THOẠI =============");
                System.out.println("1. THEO LOẠI");
                System.out.println("2. THEO GIÁ");
                System.out.println("3. THEO TÊN");
                System.out.println("4. TRỞ VỀ MENU CHÍNH");

                System.out.print("CHỌN CHỨC NĂNG MUỐN CHỌN: ");
                choose = Integer.parseInt(sc.nextLine());

                switch (choose) {
                    case 1:
                        findByCategoryPhone();
                        break;
                    case 2:
                        findByMountPhone();
                        break;
                    case 3:
                        findByNamePhone();
                        return;
                    default:
                        System.out.println("KHÔNG CÓ CHỨC NĂNG ĐÓ, VUI LÒNG CHỌN LẠI !!!!!!");
                }
            } while (choose < 1 || choose > 3);
        }
    }

    public static void findByCategoryPhone() {
        System.out.println("============TÌM KIẾM THEO LOẠI ĐIỆN THOẠI================");
        System.out.print("NHẬP LOẠI ĐIỆN THOẠI CẦN TÌM ('DTC' or 'DTM'): ");
        String idCategory = sc.nextLine();
        for (DienThoai phones : phone) {
            if (idCategory.equalsIgnoreCase("DTC")) {
                if (phones.getId().startsWith("DTC")) {
                    phones.output();
                    System.out.println("=============================");
                }
            } else if (idCategory.equalsIgnoreCase("DTM")) {
                if (phones.getId().startsWith("DTM")) {
                    phones.output();
                    System.out.println("=============================");
                }
            } else {
                System.out.println("KHÔNG CÓ SẢN PHẨM NÀO !!!!");
                System.out.println("============================");
                break;
            }

        }
    }

    public static void findByMountPhone() {
        System.out.println("============TÌM KIẾM THEO GIÁ ĐIỆN THOẠI================");
        System.out.println("NHẬP VÀO KHOẢNG GIÁ MUỐN TÌM");
        System.out.print("NHẬP VÀO GIÁ TỪ: ");
        BigDecimal minPrice = new BigDecimal(sc.nextLine());

        System.out.print("NHẬP VÀO GIÁ ĐẾN: ");
        BigDecimal maxPrice = new BigDecimal(sc.nextLine());
        boolean checkList = false;
        for (DienThoai phones : phone) {
            if (phones.getGiaDienThoai().compareTo(minPrice) >= 0 && phones.getGiaDienThoai().compareTo(maxPrice) <= 0) {
                checkList = true;
                phones.output();
                System.out.println("=========================================");
            }
            if (!checkList) {
                System.out.println("KHÔNG CÓ SẢN PHẨM NÀO !!!!");
                break;
            }
        }
    }

    public static void findByNamePhone() {
        System.out.println("============TÌM KIẾM THEO TÊN ĐIỆN THOẠI================");
        System.out.println("NHẬP VÀO TÊN MUỐN TÌM: ");
        String name = sc.nextLine();
        boolean checkList = false;
        for (DienThoai phones : phone) {
            if (phones.getTenDienThoai().contains(name)) {
                checkList = true;
                phones.output();
                System.out.println("=========================================");
            }
            if (!checkList) {
                System.out.println("KHÔNG CÓ SẢN PHẨM NÀO !!!!");
                break;
            }
        }
    }

    public static BigDecimal moneyPhone() {
        BigDecimal sum = BigDecimal.ZERO;
        for (DienThoai phones : phone) {
            sum = sum.add(phones.getGiaDienThoai());
        }
        return sum;
    }

    public static void applyDiscountToOldPhone(BigDecimal money) {
        for (DienThoai phones : phone) {
            if (phones instanceof DienThoaiCu) {
                ((DienThoaiCu) phones).applyDiscount(money);
            }
        }
    }
}
