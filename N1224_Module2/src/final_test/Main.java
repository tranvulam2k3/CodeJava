package final_test;

import ss9_set_map.phone_managerment.DienThoai;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static List<KhachHang> khachHangList = new ArrayList<>();
    static List<GoiBaoHiem> goiBaoHiemList = new ArrayList<>();

    public static void main(String[] args) {
        int choice;
        while (true) {
            do {
                System.out.println("=============MENU=============");
                System.out.println("1.Nhap thong tin ");
                System.out.println("2.Xuat thong tin ");
                System.out.println("3.Tìm kiếm thông tin người tham gia bảo hiểm khi người dùng nhập vào số chứng minh thư  ");
                System.out.println("4.Hiển thị thông tin của tất cả các gói bảo hiểm có mức phí đóng bảo hiểm là cao nhất ");

                System.out.println("=========================================");

                System.out.print("CHỌN CHỨC NĂNG MUỐN CHỌN: ");
                choice = Integer.parseInt(sc.nextLine());
                if (choice < 1 || choice > 4) {
                    System.out.println("KHÔNG CÓ CHỨC NĂNG ĐÓ, VUI LÒNG CHỌN LẠI !!!!!!");
                    continue;
                }

                switch (choice) {
                    case 1:
                        nhapThongTin();
                        break;
                    case 2:
                        xuatThongTin();
                        break;
                    case 3:
                        timTheoCMT();
                        break;
                    case 4:
                        phiBaoHiemCao();
                        break;

                    default:
                        return;
                }
            } while (true);
        }
    }

    public static void nhapThongTin() {
        int choice;

        KhachHang khachHang = new KhachHang();
        khachHang.nhapKhachHang();
        khachHangList.add(khachHang);
        while (true) {
            do {
                System.out.println("============MENU===========");
                System.out.println("Moi chon loai bao hiem");
                System.out.println("1. Bao hiem tu vong");
                System.out.println("2. Bao hiem sinh ky");
                System.out.println("3. Bao hiem hop dong");
                System.out.println("4. Trở về menu chính");
                System.out.print("CHỌN CHỨC NĂNG MUỐN CHỌN: ");
                choice = Integer.parseInt(sc.nextLine());
                if (choice < 1 || choice > 4) {
                    System.out.println("KHÔNG CÓ CHỨC NĂNG ĐÓ, VUI LÒNG CHỌN LẠI !!!!!!");
                    continue;
                }

                switch (choice) {
                    case 1:
                        BaoHiemTuVong baoHiemTuVong = new BaoHiemTuVong();
                        baoHiemTuVong.nhapBaoHiemTuVong();
                        goiBaoHiemList.add(baoHiemTuVong);
                        return;
                    case 2:
                        BaoHiemSinhKy baoHiemSinhKy = new BaoHiemSinhKy();
                        baoHiemSinhKy.nhapBaoHiemSinhKy();
                        goiBaoHiemList.add(baoHiemSinhKy);
                        return;
                    case 3:
                        BaoHiemHopDong baoHiemHopDong = new BaoHiemHopDong();
                        baoHiemHopDong.nhapBaoHiemHopDong();
                        goiBaoHiemList.add(baoHiemHopDong);
                        return;
                    case 4:
                        return;
                    default:
                        return;
                }
            } while (false);
        }
    }

    public static void xuatThongTin() {
        System.out.println(khachHangList.size());
        System.out.println(goiBaoHiemList.size());
        for (int i = 0; i < khachHangList.size(); i++) {
            khachHangList.get(i).xuatKhachHang();
            for (int j = i; j < goiBaoHiemList.size(); j++) {
                goiBaoHiemList.get(i).xuatBaoHiem();
                System.out.println("================================================");
                break;
            }
        }
    }

    public static void timTheoCMT(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so chung minh thu: ");
        String chungMinhThu = sc.nextLine();

        for (int i = 0; i < khachHangList.size(); i++) {
            for (int j = 0; j < goiBaoHiemList.size(); j++) {
                if(chungMinhThu.equals(khachHangList.get(i).getSoCMT())){
                    khachHangList.get(i).xuatKhachHang();
                    goiBaoHiemList.get(i).xuatBaoHiem();
                    return;
                }else{
                    System.out.println("Khong tim thay !!!");
                    return;
                }
            }
        }
    }

    public static void phiBaoHiemCao(){
        goiBaoHiemList.sort(Comparator.comparing(GoiBaoHiem::getMucDich).reversed());
        for (int i = 0; i <= goiBaoHiemList.size(); i++) {
            goiBaoHiemList.get(i).xuatBaoHiem();
            System.out.println("************************************");
        }
    }
}

