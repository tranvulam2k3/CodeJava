-- Tạo cơ sở dữ liệu
create database test_quan_ly_truong_hoc;

-- Tạo bảng giao_vien
use test_quan_ly_truong_hoc;

-- Tạo bảng giao_vien
CREATE TABLE giao_vien (
    ma_gv CHAR(5) PRIMARY KEY,
    ho_ten_gv VARCHAR(255)
);

-- Tạo bảng lop
CREATE TABLE lop (
    ma_lop CHAR(5) PRIMARY KEY,
    ten_lop VARCHAR(255),
    ma_gvcn CHAR(5),
    nam_hoc VARCHAR(50),
    FOREIGN KEY (ma_gvcn) REFERENCES giao_vien(ma_gv)
);

-- Tạo bảng hoc_sinh
CREATE TABLE hoc_sinh (
    ma_hs CHAR(5) PRIMARY KEY,
    ho_ten_hs VARCHAR(255),
    ho_ten_ph VARCHAR(255),
    gioi_tinh VARCHAR(10),
    dia_chi VARCHAR(255),
    ma_lop CHAR(5),
    FOREIGN KEY (ma_lop) REFERENCES lop(ma_lop)
);

-- Tạo bảng mon_hoc
CREATE TABLE mon_hoc (
    ma_mh CHAR(5) PRIMARY KEY,
    ten_mh VARCHAR(255)
);

-- Tạo bảng ket_qua_hoc_tap
CREATE TABLE ket_qua_hoc_tap (
    ma_hs CHAR(5),
    hoc_ky VARCHAR(10),
    ma_mh CHAR(5),
    diem_thi_giua_ky FLOAT,
    diem_thi_cuoi_ky FLOAT,
    ngay_gio_thi_cuoi_ky DATETIME,
    PRIMARY KEY (ma_hs, hoc_ky, ma_mh),
    FOREIGN KEY (ma_hs) REFERENCES hoc_sinh(ma_hs),
    FOREIGN KEY (ma_mh) REFERENCES mon_hoc(ma_mh)
);

-- Tạo bảng phu_trach_bo_mon
CREATE TABLE phu_trach_bo_mon (
    ma_gvpt CHAR(5),
    ma_lop CHAR(5),
    ma_mh CHAR(5),
    hoc_ky VARCHAR(10),
    PRIMARY KEY (ma_gvpt, ma_lop, ma_mh, hoc_ky),
    FOREIGN KEY (ma_gvpt) REFERENCES giao_vien(ma_gv),
    FOREIGN KEY (ma_lop) REFERENCES lop(ma_lop),
    FOREIGN KEY (ma_mh) REFERENCES mon_hoc(ma_mh)
);

INSERT INTO giao_vien (ma_gv, ho_ten_gv)
VALUES ('GV001', 'Nguyễn Văn Anh'),
       ('GV002', 'Trần Quốc Bảo'),
       ('GV003', 'Lê Thị Lan'),
       ('GV004', 'Phạm Minh Đức'),
       ('GV005', 'Võ Văn Nghĩa'),
       ('GV006', 'Huỳnh Thị Hoa'),
       ('GV007', 'Nguyễn Hoàng Nam'),
       ('GV008', 'Trần Văn Khánh'),
       ('GV009', 'Lê Thị Mai'),
       ('GV010', 'Hoàng Xuân Thanh');

INSERT INTO lop (ma_lop, ten_lop, ma_gvcn, nam_hoc)
VALUES ('L0001', 'Lớp 1A', 'GV001', '2022-2023'),
       ('L0002', 'Lớp 2A', 'GV003', '2022-2023'),
       ('L0003', 'Lớp 1B', 'GV002', '2022-2023'),
       ('L0004', 'Lớp 2B', 'GV005', '2022-2023'),
       ('L0005', 'Lớp 3A', 'GV004', '2022-2023'),
       ('L0006', 'Lớp 4A', 'GV006', '2022-2023'),
       ('L0007', 'Lớp 3B', 'GV008', '2022-2023'),
       ('L0008', 'Lớp 4B', 'GV010', '2022-2023'),
       ('L0009', 'Lớp 5A', 'GV007', '2022-2023'),
       ('L0010', 'Lớp 5B', 'GV009', '2022-2023');

INSERT INTO hoc_sinh (ma_hs, ho_ten_hs, ho_ten_ph, gioi_tinh, dia_chi, ma_lop)
VALUES ('HS001', 'Nguyễn Văn Minh', 'Nguyễn Hoàng Linh', 'Nam', 'Thanh Khê', 'L0001'),
       ('HS002', 'Trần Thị Mai', 'Trần Văn Tuyến', 'Nữ', 'Hải Châu', 'L0002'),
       ('HS003', 'Lê Tuấn Anh', 'Lê Văn Tường', 'Nam', 'Thanh Khê', 'L0001'),
       ('HS004', 'Phạm Thị Hoa', 'Phạm Văn Lợi', 'Nữ', 'Sơn Trà', 'L0003'),
       ('HS005', 'Võ Minh Tuấn', 'Võ Văn Đại', 'Nam', 'Liên Chiểu', 'L0004'),
       ('HS006', 'Huỳnh Thị Lan', 'Huỳnh Văn Sơn', 'Nữ', 'Cẩm Lệ', 'L0005'),
       ('HS007', 'Nguyễn Hoàng Nam', 'Nguyễn Văn Quang', 'Nam', 'Hòa Vang', 'L0006'),
       ('HS008', 'Trần Minh Trí', 'Trần Văn Hoàng', 'Nam', 'Hải Châu', 'L0007'),
       ('HS009', 'Lê Thị Thanh', 'Lê Văn Tâm', 'Nữ', 'Thanh Khê', 'L0008'),
       ('HS010', 'Hoàng Quốc Bảo', 'Hoàng Văn Lâm', 'Nam', 'Cẩm Lệ', 'L0009'),
		('HS011', 'Nguyễn Thị Thu', 'Nguyễn Văn Hùng', 'Nữ', 'Thanh Khê', 'L0001'),
		('HS012', 'Trần Minh Hiếu', 'Trần Văn Hoàn', 'Nam', 'Hải Châu', 'L0002'),
		('HS013', 'Lê Thị Bình', 'Lê Văn Tuấn', 'Nữ', 'Thanh Khê', 'L0001'),
		('HS014', 'Phạm Minh Tuấn', 'Phạm Văn Đông', 'Nam', 'Sơn Trà', 'L0003'),
		('HS015', 'Võ Thị Hoài', 'Võ Văn An', 'Nữ', 'Liên Chiểu', 'L0004'),
		('HS016', 'Huỳnh Văn Thanh', 'Huỳnh Thị Trang', 'Nam', 'Cẩm Lệ', 'L0005'),
		('HS017', 'Nguyễn Văn Hải', 'Nguyễn Thị Ngọc', 'Nam', 'Hòa Vang', 'L0006'),
		('HS018', 'Trần Thị Hương', 'Trần Văn Đạo', 'Nữ', 'Hải Châu', 'L0007'),
		('HS019', 'Lê Minh Quân', 'Lê Thị Thảo', 'Nam', 'Thanh Khê', 'L0008'),
		('HS020', 'Hoàng Văn Phú', 'Hoàng Thị Lệ', 'Nam', 'Cẩm Lệ', 'L0009'),
        ('HS021', 'Nguyễn Minh Huy', 'Nguyễn Thị Mai', 'Nam', 'Thanh Khê', 'L0001'),
		('HS022', 'Trần Thị Thảo', 'Trần Văn Tùng', 'Nữ', 'Hải Châu', 'L0002'),
		('HS023', 'Lê Văn Đức', 'Lê Thị Hương', 'Nam', 'Thanh Khê', 'L0001'),
		('HS024', 'Phạm Thị Hoa', 'Phạm Văn Trung', 'Nữ', 'Sơn Trà', 'L0003'),
		('HS025', 'Võ Minh Tuấn', 'Võ Thị Ngọc', 'Nam', 'Liên Chiểu', 'L0004'),
		('HS026', 'Huỳnh Văn Quý', 'Huỳnh Thị Lan', 'Nam', 'Cẩm Lệ', 'L0005'),
		('HS027', 'Nguyễn Thị Tâm', 'Nguyễn Văn Anh', 'Nữ', 'Hòa Vang', 'L0006'),
		('HS028', 'Trần Văn Hoàng', 'Trần Thị Bình', 'Nam', 'Hải Châu', 'L0007'),
		('HS029', 'Lê Minh Tuấn', 'Lê Văn Thanh', 'Nam', 'Thanh Khê', 'L0008'),
		('HS030', 'Hoàng Thị Ngân', 'Hoàng Văn Phương', 'Nữ', 'Cẩm Lệ', 'L0009'),
		('HS031', 'Nguyễn Minh Thuận', 'Nguyễn Thị Hoài', 'Nam', 'Hòa Minh, Liên Chiểu, Đà Nẵng', 'L0001'),
		('HS032', 'Trần Thanh Thảo', 'Trần Văn Quân', 'Nữ', 'Hải Châu, Đà Nẵng', 'L0002'),
		('HS033', 'Lê Thị Kim', 'Lê Văn Trọng', 'Nữ', 'Cẩm Lệ, Đà Nẵng', 'L0003'),
		('HS034', 'Phạm Văn Hoàng', 'Phạm Thị Hà', 'Nam', 'Sơn Trà, Đà Nẵng', 'L0004'),
		('HS035', 'Võ Thị Lan', 'Võ Văn Sơn', 'Nữ', 'Ngũ Hành Sơn, Đà Nẵng', 'L0005'),
		('HS036', 'Huỳnh Văn Nam', 'Huỳnh Thị Thanh', 'Nam', 'Thanh Khê, Đà Nẵng', 'L0006'),
		('HS037', 'Nguyễn Thị Hương', 'Nguyễn Văn Huy', 'Nữ', 'Hòa Vang, Đà Nẵng', 'L0007'),
		('HS038', 'Trần Văn Đức', 'Trần Thị Ngọc', 'Nam', 'Hải Châu, Đà Nẵng', 'L0008'),
		('HS039', 'Lê Văn Quyền', 'Lê Thị Thu', 'Nam', 'Cẩm Lệ, Đà Nẵng', 'L0009'),
		('HS040', 'Hoàng Minh Tuấn', 'Hoàng Văn Hoa', 'Nam', 'Sơn Trà, Đà Nẵng', 'L0010'),
		('HS041', 'Trần Văn Hưng', 'Trần Thị Lan', 'Nam', 'Hòa Minh, Liên Chiểu, Đà Nẵng', 'L0001'),
		('HS042', 'Nguyễn Thị Hà', 'Nguyễn Văn Tâm', 'Nữ', 'Hải Châu, Đà Nẵng', 'L0002'),
		('HS043', 'Lê Minh Hoàng', 'Lê Thị Hoàng', 'Nam', 'Cẩm Lệ, Đà Nẵng', 'L0003'),
		('HS044', 'Phạm Thị Quỳnh', 'Phạm Văn Trung', 'Nữ', 'Sơn Trà, Đà Nẵng', 'L0004'),
		('HS045', 'Võ Minh Quân', 'Võ Thị Lan', 'Nam', 'Ngũ Hành Sơn, Đà Nẵng', 'L0005'),
		('HS046', 'Huỳnh Văn Thanh', 'Huỳnh Thị Thảo', 'Nam', 'Thanh Khê, Đà Nẵng', 'L0006'),
		('HS047', 'Nguyễn Văn Hùng', 'Nguyễn Thị Hương', 'Nam', 'Hòa Vang, Đà Nẵng', 'L0007'),
		('HS048', 'Trần Minh Tuấn', 'Trần Thị Phương', 'Nam', 'Hải Châu, Đà Nẵng', 'L0008'),
		('HS049', 'Lê Thị Bích', 'Lê Văn Trọng', 'Nữ', 'Cẩm Lệ, Đà Nẵng', 'L0009'),
		('HS050', 'Hoàng Văn Lâm', 'Hoàng Thị Thu', 'Nam', 'Sơn Trà, Đà Nẵng', 'L0010'),
        ('HS051', 'Trần Minh Quang', 'Trần Thị Ánh', 'Nam', 'Hòa Minh, Liên Chiểu, Đà Nẵng', 'L0001'),
		('HS052', 'Nguyễn Văn Khánh', 'Nguyễn Thị Hoa', 'Nam', 'Hải Châu, Đà Nẵng', 'L0002'),
		('HS053', 'Lê Thị Thủy', 'Lê Văn Huy', 'Nữ', 'Cẩm Lệ, Đà Nẵng', 'L0003'),
		('HS054', 'Phạm Minh Trí', 'Phạm Thị Ngọc', 'Nam', 'Sơn Trà, Đà Nẵng', 'L0004'),
		('HS055', 'Võ Thị Trang', 'Võ Văn Đức', 'Nữ', 'Ngũ Hành Sơn, Đà Nẵng', 'L0005'),
		('HS056', 'Huỳnh Minh Hoa', 'Huỳnh Thị Lan', 'Nam', 'Thanh Khê, Đà Nẵng', 'L0006'),
		('HS057', 'Nguyễn Văn Phúc', 'Nguyễn Thị Thu', 'Nam', 'Hòa Vang, Đà Nẵng', 'L0007'),
		('HS058', 'Trần Thị Thảo', 'Trần Văn Tài', 'Nữ', 'Hải Châu, Đà Nẵng', 'L0008'),
		('HS059', 'Lê Văn Long', 'Lê Thị Ngọc', 'Nam', 'Cẩm Lệ, Đà Nẵng', 'L0009'),
		('HS060', 'Hoàng Thị Hương', 'Hoàng Văn Đức', 'Nữ', 'Sơn Trà, Đà Nẵng', 'L0010'),
        ('HS061', 'Ngô Thị Kim', 'Ngô Văn Hải', 'Nữ', 'Sơn Trà, Đà Nẵng', 'L0001'),
		('HS062', 'Trương Văn Đạt', 'Trương Thị Nga', 'Nam', 'Hòa Vang, Đà Nẵng', 'L0002'),
		('HS063', 'Phan Minh Tuấn', 'Phan Thị Mai', 'Nam', 'Cẩm Lệ, Đà Nẵng', 'L0003'),
		('HS064', 'Lâm Thị Lan', 'Lâm Văn Đạt', 'Nữ', 'Hải Châu, Đà Nẵng', 'L0004'),
		('HS065', 'Trần Văn Hậu', 'Trần Thị Tuyết', 'Nam', 'Thanh Khê, Đà Nẵng', 'L0005'),
		('HS066', 'Võ Thị Hoàng', 'Võ Văn Long', 'Nữ', 'Ngũ Hành Sơn, Đà Nẵng', 'L0006'),
		('HS067', 'Huỳnh Minh Tuấn', 'Huỳnh Thị Thảo', 'Nam', 'Hòa Minh, Liên Chiểu, Đà Nẵng', 'L0007'),
		('HS068', 'Lý Thị Hương', 'Lý Văn Hiếu', 'Nữ', 'Sơn Trà, Đà Nẵng', 'L0008'),
		('HS069', 'Nguyễn Minh Đức', 'Nguyễn Thị Trang', 'Nam', 'Cẩm Lệ, Đà Nẵng', 'L0009'),
		('HS070', 'Hoàng Văn Tùng', 'Hoàng Thị Phương', 'Nam', 'Hải Châu, Đà Nẵng', 'L0010'),
        ('HS071', 'Nguyễn Thị Trang', 'Nguyễn Văn Long', 'Nữ', 'Hòa Vang, Đà Nẵng', 'L0001'),
		('HS072', 'Trần Văn Đạt', 'Trần Thị Nga', 'Nam', 'Cẩm Lệ, Đà Nẵng', 'L0002'),
		('HS073', 'Lê Minh Tuấn', 'Lê Thị Mai', 'Nam', 'Hòa Vang, Đà Nẵng', 'L0003'),
		('HS074', 'Phạm Văn Thanh', 'Phạm Văn Đạt', 'Nam', 'Ngũ Hành Sơn, Đà Nẵng', 'L0004'),
		('HS075', 'Lâm Minh Hiếu', 'Lâm Văn Hải', 'Nam', 'Hải Châu, Đà Nẵng', 'L0005'),
		('HS076', 'Trương Minh Tuấn', 'Trương Thị Tuyết', 'Nam', 'Cẩm Lệ, Đà Nẵng', 'L0006'),
		('HS077', 'Võ Văn Hậu', 'Võ Thị Hoàng', 'Nam', 'Hòa Minh, Liên Chiểu, Đà Nẵng', 'L0007'),
		('HS078', 'Huỳnh Thị Lan', 'Huỳnh Minh Tuấn', 'Nữ', 'Hòa Minh, Liên Chiểu, Đà Nẵng', 'L0008'),
		('HS079', 'Lý Văn Đạt', 'Lý Thị Hương', 'Nam', 'Sơn Trà, Đà Nẵng', 'L0009'),
		('HS080', 'Ngô Minh Trang', 'Ngô Thị Kim', 'Nam', 'Hòa Vang, Đà Nẵng', 'L0010'),
        ('HS081', 'Trần Văn Hùng', 'Trần Thị Lan', 'Nam', 'Cẩm Lệ, Đà Nẵng', 'L0001'),
		('HS082', 'Lê Thị Thảo', 'Lê Văn Minh', 'Nữ', 'Hải Châu, Đà Nẵng', 'L0002'),
		('HS083', 'Nguyễn Văn Long', 'Nguyễn Thị Hoài', 'Nam', 'Ngũ Hành Sơn, Đà Nẵng', 'L0003'),
		('HS084', 'Phạm Thị Hoa', 'Phạm Văn Đức', 'Nữ', 'Hòa Minh, Liên Chiểu, Đà Nẵng', 'L0004'),
		('HS085', 'Lâm Minh Tuấn', 'Lâm Văn Định', 'Nam', 'Sơn Trà, Đà Nẵng', 'L0005'),
		('HS086', 'Trương Thị Hồng', 'Trương Văn Thanh', 'Nữ', 'Hòa Minh, Liên Chiểu, Đà Nẵng', 'L0006'),
		('HS087', 'Võ Minh Hải', 'Võ Thị Thùy', 'Nam', 'Hòa Vang, Đà Nẵng', 'L0007'),
		('HS088', 'Huỳnh Văn Đạt', 'Huỳnh Thị Thanh', 'Nam', 'Cẩm Lệ, Đà Nẵng', 'L0008'),
		('HS089', 'Lý Minh Tuấn', 'Lý Thị Lan', 'Nam', 'Hòa Vang, Đà Nẵng', 'L0009'),
		('HS090', 'Ngô Thị Hà', 'Ngô Văn Nam', 'Nữ', 'Hải Châu, Đà Nẵng', 'L0010'),
        ('HS091', 'Nguyễn Thị Trang', 'Nguyễn Văn Lâm', 'Nữ', 'Hải Châu, Đà Nẵng', 'L0001'),
		('HS092', 'Trần Minh Tâm', 'Trần Thị Hoài', 'Nam', 'Ngũ Hành Sơn, Đà Nẵng', 'L0002'),
		('HS093', 'Lê Thị Thuận', 'Lê Văn Đạt', 'Nữ', 'Cẩm Lệ, Đà Nẵng', 'L0003'),
		('HS094', 'Phạm Minh Tú', 'Phạm Văn Hưng', 'Nam', 'Hòa Minh, Liên Chiểu, Đà Nẵng', 'L0004'),
		('HS095', 'Lâm Thị Mỹ Duyên', 'Lâm Văn Thảo', 'Nữ', 'Sơn Trà, Đà Nẵng', 'L0005'),
		('HS096', 'Trương Minh Thanh', 'Trương Thị Hồng', 'Nam', 'Hòa Minh, Liên Chiểu, Đà Nẵng', 'L0006'),
		('HS097', 'Võ Minh Trí', 'Võ Thị Thảo', 'Nam', 'Hòa Vang, Đà Nẵng', 'L0007'),
		('HS098', 'Huỳnh Thị Thùy Trang', 'Huỳnh Văn Tùng', 'Nữ', 'Cẩm Lệ, Đà Nẵng', 'L0008'),
		('HS099', 'Lý Văn Trường', 'Lý Thị Lan Anh', 'Nam', 'Hòa Vang, Đà Nẵng', 'L0009'),
		('HS100', 'Ngô Văn Nam', 'Ngô Thị Hà', 'Nam', 'Hải Châu, Đà Nẵng', 'L0010');
        
INSERT INTO mon_hoc (ma_mh, ten_mh)
VALUES 
    ('MH001', 'Toán học'),
    ('MH002', 'Ngữ văn'),
    ('MH003', 'Lịch sử'),
    ('MH004', 'Địa lý'),
    ('MH005', 'Sinh học'),
    ('MH006', 'Vật lí'),
    ('MH007', 'Hóa học'),
    ('MH008', 'Giáo dục công dân'),
    ('MH009', 'Thể dục'),
    ('MH010', 'Âm nhạc');

INSERT INTO ket_qua_hoc_tap (ma_hs, hoc_ky, ma_mh, diem_thi_giua_ky, diem_thi_cuoi_ky, ngay_gio_thi_cuoi_ky)
VALUES 
    ('HS001', 'Học kỳ 1', 'MH001', 8.5, 9.0, '2023-01-15 08:00:00'),
    ('HS002', 'Học kỳ 1', 'MH001', 7.0, 7.5, '2023-01-15 09:30:00'),
    ('HS003', 'Học kỳ 1', 'MH001', 6.5, 7.0, '2023-01-15 08:00:00'),
    ('HS004', 'Học kỳ 1', 'MH001', 8.0, 8.5, '2023-01-15 09:30:00'),
    ('HS005', 'Học kỳ 1', 'MH001', 9.0, 9.5, '2023-01-15 08:00:00'),
    ('HS006', 'Học kỳ 1', 'MH001', 7.5, 8.0, '2023-01-15 09:30:00'),
    ('HS007', 'Học kỳ 1', 'MH001', 6.0, 6.5, '2023-01-15 08:00:00'),
    ('HS008', 'Học kỳ 1', 'MH001', 8.5, 9.0, '2023-01-15 09:30:00'),
    ('HS009', 'Học kỳ 1', 'MH001', 7.0, 7.5, '2023-01-15 08:00:00'),
    ('HS010', 'Học kỳ 1', 'MH001', 6.5, 7.0, '2023-01-15 09:30:00'),
    ('HS011', 'Học kỳ 1', 'MH001', 8.0, 8.5, '2023-01-15 08:00:00'),
    ('HS012', 'Học kỳ 1', 'MH001', 9.0, 9.5, '2023-01-15 09:30:00'),
    ('HS013', 'Học kỳ 1', 'MH001', 7.5, 8.0, '2023-01-15 08:00:00'),
    ('HS014', 'Học kỳ 1', 'MH001', 6.0, 6.5, '2023-01-15 09:30:00'),
    ('HS015', 'Học kỳ 1', 'MH001', 8.5, 9.0, '2023-01-15 08:00:00'),
    ('HS016', 'Học kỳ 1', 'MH001', 7.0, 7.5, '2023-01-15 09:30:00'),
    ('HS017', 'Học kỳ 1', 'MH001', 6.5, 7.0, '2023-01-15 08:00:00'),
    ('HS018', 'Học kỳ 1', 'MH001', 8.0, 8.5, '2023-01-15 09:30:00'),
    ('HS019', 'Học kỳ 1', 'MH001', 9.0, 9.5, '2023-01-15 08:00:00'),
    ('HS020', 'Học kỳ 1', 'MH001', 7.5, 8.0, '2023-01-15 09:30:00'),
    ('HS021', 'Học kỳ 1', 'MH001', 6.0, 6.5, '2023-01-15 08:00:00'),
    -- ... (Thêm dữ liệu cho HS022 đến HS050)
    ('HS022', 'Học kỳ 1', 'MH001', 8.5, 9.0, '2023-01-15 09:30:00'),
    -- ... (Thêm dữ liệu cho HS023 đến HS050)
    ('HS023', 'Học kỳ 1', 'MH001', 6.5, 7.0, '2023-01-15 08:00:00'),
    -- ... (Thêm dữ liệu cho HS024 đến HS050)
    ('HS024', 'Học kỳ 1', 'MH001', 8.0, 8.5, '2023-01-15 09:30:00'),
    -- ... (Thêm dữ liệu cho HS025 đến HS050)
    ('HS025', 'Học kỳ 1', 'MH001', 9.0, 9.5, '2023-01-15 08:00:00'),
    -- ... (Thêm dữ liệu cho HS026 đến HS050)
    ('HS026', 'Học kỳ 1', 'MH001', 7.5, 8.0, '2023-01-15 09:30:00'),
    -- ... (Thêm dữ liệu cho HS027 đến HS050)
    ('HS027', 'Học kỳ 1', 'MH001', 6.0, 6.5, '2023-01-15 08:00:00'),
    -- ... (Thêm dữ liệu cho HS028 đến HS050)
    ('HS028', 'Học kỳ 1', 'MH001', 8.5, 9.0, '2023-01-15 09:30:00'),
    -- ... (Thêm dữ liệu cho HS029 đến HS050)
    ('HS029', 'Học kỳ 1', 'MH001', 7.0, 7.5, '2023-01-15 08:00:00'),
    -- ... (Thêm dữ liệu cho HS030 đến HS050)
    ('HS030', 'Học kỳ 1', 'MH001', 6.5, 7.0, '2023-01-15 09:30:00'),
    -- ... (Thêm dữ liệu cho HS031 đến HS050)
    ('HS031', 'Học kỳ 1', 'MH001', 8.0, 8.5, '2023-01-15 08:00:00'),
    -- ... (Thêm dữ liệu cho HS032 đến HS050)
    ('HS032', 'Học kỳ 1', 'MH001', 9.0, 9.5, '2023-01-15 09:30:00'),
    -- ... (Thêm dữ liệu cho HS033 đến HS050)
    ('HS033', 'Học kỳ 1', 'MH001', 7.5, 8.0, '2023-01-15 08:00:00'),
    -- ... (Thêm dữ liệu cho HS034 đến HS050)
    ('HS034', 'Học kỳ 1', 'MH001', 6.0, 6.5, '2023-01-15 09:30:00'),
    -- ... (Thêm dữ liệu cho HS035 đến HS050)
    ('HS035', 'Học kỳ 1', 'MH001', 8.5, 9.0, '2023-01-15 08:00:00'),
    -- ... (Thêm dữ liệu cho HS036 đến HS050)
    ('HS036', 'Học kỳ 1', 'MH001', 7.0, 7.5, '2023-01-15 09:30:00'),
    -- ... (Thêm dữ liệu cho HS037 đến HS050)
    ('HS037', 'Học kỳ 1', 'MH001', 6.5, 7.0, '2023-01-15 08:00:00'),
    -- ... (Thêm dữ liệu cho HS038 đến HS050)
    ('HS038', 'Học kỳ 1', 'MH001', 8.0, 8.5, '2023-01-15 09:30:00'),
    -- ... (Thêm dữ liệu cho HS039 đến HS050)
    ('HS039', 'Học kỳ 1', 'MH001', 9.0, 9.5, '2023-01-15 08:00:00'),
    -- ... (Thêm dữ liệu cho HS040 đến HS050)
    ('HS040', 'Học kỳ 1', 'MH001', 7.5, 8.0, '2023-01-15 09:30:00'),
    -- ... (Thêm dữ liệu cho HS041 đến HS050)
    ('HS041', 'Học kỳ 1', 'MH001', 6.0, 6.5, '2023-01-15 08:00:00'),
    -- ... (Thêm dữ liệu cho HS042 đến HS050)
    ('HS042', 'Học kỳ 1', 'MH001', 8.5, 9.0, '2023-01-15 09:30:00'),
    -- ... (Thêm dữ liệu cho HS043 đến HS050)
    ('HS043', 'Học kỳ 1', 'MH001', 7.0, 7.5, '2023-01-15 08:00:00'),
    -- ... (Thêm dữ liệu cho HS044 đến HS050)
    ('HS044', 'Học kỳ 1', 'MH001', 6.5, 7.0, '2023-01-15 09:30:00'),
    -- ... (Thêm dữ liệu cho HS045 đến HS050)
    ('HS045', 'Học kỳ 1', 'MH001', 8.0, 8.5, '2023-01-15 08:00:00'),
    -- ... (Thêm dữ liệu cho HS046 đến HS050)
    ('HS046', 'Học kỳ 1', 'MH001', 9.0, 9.5, '2023-01-15 09:30:00'),
    -- ... (Thêm dữ liệu cho HS047 đến HS050)
    ('HS047', 'Học kỳ 1', 'MH001', 7.5, 8.0, '2023-01-15 08:00:00'),
    -- ... (Thêm dữ liệu cho HS048 đến HS050)
    ('HS048', 'Học kỳ 1', 'MH001', 6.0, 6.5, '2023-01-15 09:30:00'),
    -- ... (Thêm dữ liệu cho HS049 đến HS050)
    ('HS049', 'Học kỳ 1', 'MH001', 8.5, 9.0, '2023-01-15 08:00:00'),
    -- ... (Thêm dữ liệu cho HS050)
    ('HS050', 'Học kỳ 1', 'MH001', 7.0, 7.5, '2023-01-15 09:30:00');

INSERT INTO phu_trach_bo_mon (ma_gvpt, ma_lop, ma_mh, hoc_ky)
VALUES 
    ('GV001', 'L0001', 'MH001', 'Học kỳ 1'),
    ('GV002', 'L0003', 'MH002', 'Học kỳ 1'),
    ('GV003', 'L0002', 'MH003', 'Học kỳ 1'),
    ('GV004', 'L0004', 'MH004', 'Học kỳ 1'),
    ('GV005', 'L0005', 'MH005', 'Học kỳ 1'),
    ('GV006', 'L0006', 'MH006', 'Học kỳ 1'),
    ('GV007', 'L0007', 'MH007', 'Học kỳ 1'),
    ('GV008', 'L0008', 'MH008', 'Học kỳ 1'),
    ('GV009', 'L0009', 'MH009', 'Học kỳ 1'),
    ('GV010', 'L0010', 'MH010', 'Học kỳ 1'),
    ('GV001', 'L0001', 'MH001', 'Học kỳ 2'),
    ('GV002', 'L0003', 'MH002', 'Học kỳ 2'),
    ('GV003', 'L0002', 'MH003', 'Học kỳ 2'),
    
    ('GV004', 'L0004', 'MH004', 'Học kỳ 2'),
    ('GV005', 'L0005', 'MH005', 'Học kỳ 2'),
    ('GV006', 'L0006', 'MH006', 'Học kỳ 2'),
    ('GV007', 'L0007', 'MH007', 'Học kỳ 2'),
    ('GV008', 'L0008', 'MH008', 'Học kỳ 2'),
    ('GV009', 'L0009', 'MH009', 'Học kỳ 2'),
    ('GV010', 'L0010', 'MH010', 'Học kỳ 2');
    
 -- b1
 -- a. Toàn bộ thông tin của toàn bộ giáo viên trong trường. 
SELECT * FROM test_quan_ly_truong_hoc.giao_vien;

--  b. Họ tên học sinh, giới tính, họ tên phụ huynh của toàn bộ sinh viên trong trường.
SELECT ho_ten_hs,gioi_tinh,ho_ten_ph FROM test_quan_ly_truong_hoc.hoc_sinh;

--  c. Toàn bộ thông tin của tất cả các lớp trong trường.
SELECT * FROM test_quan_ly_truong_hoc.lop;

-- b2
-- a. Những học sinh có giới tính là Nam.
SELECT * FROM hoc_sinh
WHERE gioi_tinh = 'Nam';

-- b. Những học sinh chưa có tên của phụ huynh.
SELECT * FROM hoc_sinh
WHERE ho_ten_ph = null;

-- c. Những lớp chưa có giáo viên chủ nhiệm.
SELECT * FROM test_quan_ly_truong_hoc.lop
WHERE ma_gvcn = null;

-- d. Những học sinh chưa được phân lớp.
SELECT * FROM hoc_sinh
WHERE ma_lop = null;

-- e. Những học sinh nữ có địa chỉ ở Thanh Khê.
SELECT * FROM hoc_sinh
WHERE gioi_tinh = 'Nữ'
AND dia_chi = 'Thanh Khê';

-- f. Những học sinh nam có địa chỉ ở Hải Châu hoặc những học sinh nữ có địa chỉ ở Thanh Khê.
SELECT hoc_sinh.* FROM hoc_sinh
WHERE gioi_tinh = 'Nữ'
AND dia_chi = 'Thanh Khê'
OR gioi_tinh = 'Nam'
AND dia_chi = 'Hải Châu';

-- g. Những học sinh nam chưa có tên phụ huynh và những học sinh nữ chưa được phân lớp.
SELECT * FROM hoc_sinh
WHERE gioi_tinh = 'Nam'
AND ho_ten_ph = null
AND gioi_tinh = 'Nữ'
AND ma_lop = null;

-- h. Những học sinh nam chưa được phân lớp và những học sinh nam chưa có tên phụ huynh.
SELECT * FROM hoc_sinh
WHERE gioi_tinh = 'Nam'
AND ho_ten_ph = null
AND ma_lop = null;

-- i. Mã môn học của những môn học được dạy trong học kỳ 2.
SELECT phu_trach_bo_mon.ma_mh FROM test_quan_ly_truong_hoc.phu_trach_bo_mon
WHERE hoc_ky = 'Học kỳ 2';


-- bai 3
-- a. Những học sinh có họ tên bắt đầu bằng từ Nguyễn.
	SELECT * FROM hoc_sinh WHERE ho_ten_hs like 'Nguyễn %';
-- b. Những học sinh có họ tên kết thúc bằng từ Nở.
	SELECT * FROM hoc_sinh
	WHERE ho_ten_hs like '%Nỡ';
-- c. Những học sinh có họ tên chứa từ Thị.
	SELECT * FROM hoc_sinh
	WHERE ho_ten_hs like '%thị%';
-- d. Những học sinh chứa từ Thị ở giữa (không được chứa ở đầu và ở cuối).
	SELECT * FROM hoc_sinh
	WHERE ho_ten_hs like '% thị %';
--  e. Những học sinh có họ tên với độ dài là 30 ký tự (kể cả khoảng trắng).
	SELECT * FROM hoc_sinh
	WHERE char_length(ho_ten_hs) = 30;
--   f. Những học sinh có họ tên với độ dài tối đa là 30 ký tự.
	SELECT * FROM hoc_sinh
	WHERE char_length(ho_ten_hs) <= 30 ;	
--     g. Những học sinh có họ tên với độ dài tối đa là 30 ký tự và bắt đầu bằng ký tự N.
	SELECT * FROM hoc_sinh
	WHERE char_length(ho_ten_hs) <= 30 
    AND  ho_ten_hs LIKE 'N%';
--     h. Những học sinh có họ tên bắt đầu bằng các ký tự: N, T, V.
	SELECT * FROM hoc_sinh
	WHERE ho_ten_hs LIKE 'N%'
    OR ho_ten_hs LIKE 'T%'
    OR ho_ten_hs LIKE 'V%';
--     i. Những học sinh có họ tên không được bắt đầu bằng các ký tự: N, T, V.
SELECT * FROM hoc_sinh
	WHERE ho_ten_hs NOT LIKE 'N%'
    AND ho_ten_hs NOT LIKE 'T%'
    AND ho_ten_hs NOT LIKE 'V%';
--     j. Những học sinh có họ tên với phần họ có đúng 4 ký tự.
SELECT * 
FROM hoc_sinh 
WHERE CHAR_LENGTH(SUBSTRING_INDEX(ho_ten_hs, ' ', 1)) = 4;

