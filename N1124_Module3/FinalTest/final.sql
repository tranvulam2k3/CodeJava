create database final_test;

use final_test;

CREATE TABLE DON_VI_UNG_HO
(
    MaDVUH             VARCHAR(10) PRIMARY KEY,
    HoTenNguoiDaiDien  VARCHAR(50),
    DiaChiNguoiDaiDien VARCHAR(50),
    SoDienThoaiLienLac VARCHAR(10),
    SoCMNDNguoiDaiDien VARCHAR(9),
    SoTaiKhoanNganHang VARCHAR(10),
    TenNganHang        VARCHAR(50),
    ChiNhanhNganHang   VARCHAR(50),
    TenChuTKNganHang   VARCHAR(50)
);

CREATE TABLE HO_DAN
(
    MaHoDan      VARCHAR(10) PRIMARY KEY,
    HoTenChuHo   VARCHAR(50),
    ToDanPho     INT,
    KhoiHoacThon VARCHAR(50),
    SoDienThoai  VARCHAR(10),
    DiaChiNha    VARCHAR(50),
    SoNhanKhau   INT,
    DienGiaDinh  VARCHAR(50),
    LaHoNgheo    VARCHAR(10)
);

CREATE TABLE DOT_UNG_HO
(
    MaDotUngHo VARCHAR(10) PRIMARY KEY,
    MaDVUH     VARCHAR(10),
    NgayUngHo  DATE,
    FOREIGN KEY (MaDVUH) REFERENCES DON_VI_UNG_HO (MaDVUH)
);

CREATE TABLE HINH_THUC_UNG_HO
(
    MaHinhThucUngHo  VARCHAR(10) PRIMARY KEY,
    TenHinhThucUngHo VARCHAR(50)
);

CREATE TABLE DOT_NHAN_UNG_HO
(
    MaDotNhanUngHo VARCHAR(10) PRIMARY KEY,
    MaHoDan        VARCHAR(10),
    NgayNhanUngHo  DATE,
    FOREIGN KEY (MaHoDan) REFERENCES HO_DAN (MaHoDan)
);

CREATE TABLE CHI_TIET_UNG_HO
(
    MaDotUngHo      VARCHAR(10),
    MaHinhThucUngHo VARCHAR(10),
    SoLuongUngHo    INT,
    DonViTinh       VARCHAR(10),
    PRIMARY KEY (MaDotUngHo, MaHinhThucUngHo),
    FOREIGN KEY (MaDotUngHo) REFERENCES DOT_UNG_HO (MaDotUngHo),
    FOREIGN KEY (MaHinhThucUngHo) REFERENCES HINH_THUC_UNG_HO (MaHinhThucUngHo)
);

CREATE TABLE CHI_TIET_NHAN_UNG_HO
(
    MaDotNhanUngHo   VARCHAR(10),
    MaHinhThucUngHo  VARCHAR(10),
    SoLuongNhanUngHo INT,
    DonViTinh        VARCHAR(10),
    PRIMARY KEY (MaDotNhanUngHo, MaHinhThucUngHo),
    FOREIGN KEY (MaDotNhanUngHo) REFERENCES DOT_NHAN_UNG_HO (MaDotNhanUngHo),
    FOREIGN KEY (MaHinhThucUngHo) REFERENCES HINH_THUC_UNG_HO (MaHinhThucUngHo)

);

INSERT INTO DON_VI_UNG_HO
VALUES ('CN001', 'NGUYEN VAN A', 'NUI THANH, QUANG NAM', '0907111111', '123423111', '76864000', 'TIEN PHONG BANK',
        'DA NANG', 'NGUYEN VAN A'),
       ('CN002', 'NGUYEN VAN B', 'TAM KY, QUANG NAM', '0907111112', '123423112', '76864001', 'VIETCOMBANK', 'DA NANG',
        'NGUYEN VAN B'),
       ('CTY01', 'NGUYEN VAN C', 'DA NANG', '0907111113', '123423113', '76864002', 'DONG A BANK', 'DA NANG',
        'NGUYEN VAN C'),
       ('CTY02', 'NGUYEN VAN D', 'QUANG NGAI', '0907111114', '123423114', '76864030', 'MB BANK', 'DA NANG',
        'NGUYEN VAN D');
-- Câu 1: Xóa những đơn vị ủng hộ có tài khoản ngân hàng được mở ở ngân hàng "DongA"
DELETE
FROM DON_VI_UNG_HO
WHERE TenNganHang = 'DONG A BANK';

-- Câu 2: Cập nhật hình thức ủng hộ có tên là "Mi tom" thành "Mi an lien"
UPDATE HINH_THUC_UNG_HO
SET TenHinhThucUngHo = 'MI AN LIEN'
WHERE TenHinhThucUngHo = 'MI TOM';

-- Câu 3: Liệt kê những chủ hộ có họ tên bắt đầu là ký tự 'Ph' và có độ dài nhiều nhất là 30
-- ký tự (kể cả ký tự trắng)
SELECT *
FROM HO_DAN
WHERE HoTenChuHo LIKE 'PH%'
  AND LENGTH(HoTenChuHo) <= 30;

-- Câu 4: Liệt kê những đợt nhận ủng hộ có NgayNhanUngHo nằm trong năm 2015 và có
-- MaHoDan kết thúc bằng ký tự '1' (ký tự số 1)
SELECT *
FROM DOT_NHAN_UNG_HO
WHERE YEAR(NgayNhanUngHo) = 2015
  AND MaHoDan LIKE '%1';

-- Câu 5: Liệt kê MaDVUH, HoTenNguoiDaiDien, MaDotUngHo, NgayUngHo của những
-- đợt ủng hộ diễn ra trước ngày 30/04/2016. Kết quả hiển thị cần được sắp xếp giảm dần
-- theo NgayUngHo và tăng dần theo HoTenNguoiDaiDien
SELECT DON_VI_UNG_HO.MaDVUH, HoTenNguoiDaiDien, MaDotUngHo, NgayUngHo
FROM DON_VI_UNG_HO
         INNER JOIN DOT_UNG_HO on DON_VI_UNG_HO.MaDVUH = DOT_UNG_HO.MaDVUH
WHERE NgayUngHo < '2016-04-30'
ORDER BY NgayUngHo DESC, HoTenNguoiDaiDien;

-- Câu 6: Liệt kê những hộ dân là hộ nghèo và chưa từng được nhận ủng hộ lần nào

SELECT *
FROM HO_DAN
WHERE LaHoNgheo = 'DUNG'
  AND MaHoDan NOT IN (SELECT MaHoDan FROM DOT_NHAN_UNG_HO);

-- Câu 7: Liệt kê họ tên của những chủ hộ đang có trong hệ thống. Nếu họ tên trùng nhau
-- thì chỉ hiển thị 1 lần. Học viên cần thực hiện yêu cầu này bằng 2 cách khác nhau (mỗi cách được tính 0.5 điểm)
-- C1
SELECT HoTenChuHo
FROM HO_DAN
GROUP BY HoTenChuHo;
-- C2
SELECT DISTINCT (HoTenChuHo)
FROM HO_DAN;

-- Câu 8: Liệt kê MaHoDan, HoTenChuHo, ToDanPho, KhoiHoacThon,
-- MaDotNhanUngHo, NgayNhanUngHo, MaHinhThucUH, SoLuongNhanUngHo,
-- DonViTinh của tất cả hộ dân đang có trong hệ thống
SELECT HO_DAN.MaHoDan,
       HO_DAN.HoTenChuHo,
       HO_DAN.ToDanPho,
       HO_DAN.KhoiHoacThon,
       DOT_NHAN_UNG_HO.MaDotNhanUngHo,
       DOT_NHAN_UNG_HO.NgayNhanUngHo,
       CHI_TIET_NHAN_UNG_HO.MaHinhThucUngHo,
       CHI_TIET_NHAN_UNG_HO.SoLuongNhanUngHo,
       CHI_TIET_NHAN_UNG_HO.DonViTinh
FROM HO_DAN
         LEFT JOIN DOT_NHAN_UNG_HO
                   ON HO_DAN.MaHoDan = DOT_NHAN_UNG_HO.MaHoDan
         LEFT JOIN CHI_TIET_NHAN_UNG_HO
                   ON DOT_NHAN_UNG_HO.MaDotNhanUngHo = CHI_TIET_NHAN_UNG_HO.MaDotNhanUngHo;

-- Câu 9: Liệt kê những đơn vị ủng hộ có tài khoản ngân hàng ở ngân hàng "DongA", từng
-- ít nhất 5 lần hỗ trợ cho người dân với TenHinhThucUngHo là "Mi an lien" trong năm 2016
SELECT DOT_UNG_HO.MaDotUngHo, DON_VI_UNG_HO.MaDVUH, DON_VI_UNG_HO.HoTenNguoiDaiDien
FROM DON_VI_UNG_HO
         INNER JOIN DOT_UNG_HO on DON_VI_UNG_HO.MaDVUH = DOT_UNG_HO.MaDVUH
         INNER JOIN CHI_TIET_UNG_HO on DOT_UNG_HO.MaDotUngHo = CHI_TIET_UNG_HO.MaDotUngHo
         INNER JOIN HINH_THUC_UNG_HO on CHI_TIET_UNG_HO.MaHinhThucUngHo = HINH_THUC_UNG_HO.MaHinhThucUngHo
WHERE TenNganHang = 'DONG A BANK'
  AND TenHinhThucUngHo = 'MI AN LIEN'
  AND YEAR(NgayUngHo) = 2016
GROUP BY DOT_UNG_HO.MaDotUngHo, DON_VI_UNG_HO.HoTenNguoiDaiDien, DON_VI_UNG_HO.MaDVUH
HAVING COUNT(DOT_UNG_HO.MaDotUngHo) >= 5;

-- Câu 10: Liệt kê những hộ dân đã từng được nhận ủng hộ với TenHinhThucUngHo là
-- "Mi an lien" và chưa từng được nhận ủng hộ với TenHinhThucUngHo là "Gao"
SELECT HO_DAN.*
FROM HO_DAN
         INNER JOIN DOT_NHAN_UNG_HO on HO_DAN.MaHoDan = DOT_NHAN_UNG_HO.MaHoDan
         INNER JOIN CHI_TIET_NHAN_UNG_HO on DOT_NHAN_UNG_HO.MaDotNhanUngHo = CHI_TIET_NHAN_UNG_HO.MaDotNhanUngHo
         INNER JOIN HINH_THUC_UNG_HO on CHI_TIET_NHAN_UNG_HO.MaHinhThucUngHo = HINH_THUC_UNG_HO.MaHinhThucUngHo
WHERE TenHinhThucUngHo = 'MI AN LIEN'
EXCEPT
SELECT HO_DAN.*
FROM HO_DAN
         INNER JOIN DOT_NHAN_UNG_HO on HO_DAN.MaHoDan = DOT_NHAN_UNG_HO.MaHoDan
         INNER JOIN CHI_TIET_NHAN_UNG_HO on DOT_NHAN_UNG_HO.MaDotNhanUngHo = CHI_TIET_NHAN_UNG_HO.MaDotNhanUngHo
         INNER JOIN HINH_THUC_UNG_HO on CHI_TIET_NHAN_UNG_HO.MaHinhThucUngHo = HINH_THUC_UNG_HO.MaHinhThucUngHo
WHERE TenHinhThucUngHo = 'GAO'

