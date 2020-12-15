-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th12 14, 2020 lúc 02:06 AM
-- Phiên bản máy phục vụ: 10.4.11-MariaDB
-- Phiên bản PHP: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `quan_ly_phan_anh`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `co_quan`
--

CREATE TABLE `co_quan` (
  `TEN_CO_QUAN` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `DIA_CHI` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `co_quan`
--

INSERT INTO `co_quan` (`TEN_CO_QUAN`, `DIA_CHI`) VALUES
('BHXH QUẬN HAI BÀ TRƯNG', '6 NGÕ 167 GIẢI PHÓNG'),
('CÔNG AN QUẬN HAI BÀ TRƯNG', '96 TÔ HIẾN THÀNH'),
('PHÒNG LAO ĐỘNG THƯƠNG BINH XÃ HỘI', '7 THANH NHÀN'),
('PHÒNG THANH TRA QUẬN HAI BÀ TRƯNG', '44 TRẦN XUÂN SOẠN'),
('TAND QUẬN HAI BÀ TRƯNG', '434A TRẦN KHÁT CHÂN'),
('UBND QUẬN HAI BÀ TRƯNG', '30 LÊ ĐẠI HÀNH'),
('VĂN PHÒNG ĐĂNG KÝ ĐẮT ĐAI QUẬN HAI BÀ TRƯNG', '36 LÊ ĐẠI HÀNH');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phan_anh`
--

CREATE TABLE `phan_anh` (
  `MA_PHAN_ANH` int(11) NOT NULL,
  `NGUOI_PHAN_ANH` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `NOI_DUNG` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `NGAY_PHAN_ANH` date DEFAULT NULL,
  `PHAN_LOAI` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `TRANG_THAI` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phan_hoi`
--

CREATE TABLE `phan_hoi` (
  `MA_PHAN_ANH` int(11) NOT NULL,
  `NGAY_PHAN_HOI` date DEFAULT NULL,
  `NGUOI_LIEN_QUAN` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `NOI_DUNG` varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CO_QUAN` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tai_khoan`
--

CREATE TABLE `tai_khoan` (
  `ID` int(11) NOT NULL,
  `USERNAME` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `PASSWORD` varchar(30) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tai_khoan`
--

INSERT INTO `tai_khoan` (`ID`, `USERNAME`, `PASSWORD`) VALUES
(1, 'username', '12345678');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `co_quan`
--
ALTER TABLE `co_quan`
  ADD PRIMARY KEY (`TEN_CO_QUAN`);

--
-- Chỉ mục cho bảng `phan_anh`
--
ALTER TABLE `phan_anh`
  ADD PRIMARY KEY (`MA_PHAN_ANH`);

--
-- Chỉ mục cho bảng `phan_hoi`
--
ALTER TABLE `phan_hoi`
  ADD PRIMARY KEY (`MA_PHAN_ANH`),
  ADD KEY `FK_PHANANH` (`CO_QUAN`);

--
-- Chỉ mục cho bảng `tai_khoan`
--
ALTER TABLE `tai_khoan`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `phan_anh`
--
ALTER TABLE `phan_anh`
  MODIFY `MA_PHAN_ANH` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `tai_khoan`
--
ALTER TABLE `tai_khoan`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `phan_hoi`
--
ALTER TABLE `phan_hoi`
  ADD CONSTRAINT `FK_PHANANH` FOREIGN KEY (`CO_QUAN`) REFERENCES `co_quan` (`TEN_CO_QUAN`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
