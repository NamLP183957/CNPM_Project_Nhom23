# QUẢN LÝ PHẢN ÁNH, KIẾN NGHỊ

## GIỚI THIỆU
Các hướng dẫn này sẽ cung cấp cho bạn một bản sao của dự án và chạy trên máy cục bộ của bạn. Hãy xem TRIỂN KHAI phần  để biết về các ghi chú khi triển khai trên hệ thống thực tế

## YÊU CẦU TRƯỚC KHI CÀI ĐẶT
Triển khai cơ sở dữ liệu trên hệ quản trị cơ sở dữ liệu MySQL

Database name: Quan_ly_phan_anh

Các bảng trong database:

* ![CoQuan](https://raw.githubusercontent.com/NamLP183957/CNPM_Project_Nhom23/master/DataBaseImage/CoQuan.jpg)

* ![PhanAnh](https://raw.githubusercontent.com/NamLP183957/CNPM_Project_Nhom23/master/DataBaseImage/PhanAnh.jpg)

* ![PhanHoi](https://raw.githubusercontent.com/NamLP183957/CNPM_Project_Nhom23/master/DataBaseImage/PhanHoi.jpg)

## CẤU TRÚC CỦA PROJECT
Project chia thành các gói (package) như sau

* icons: chứa các icon dùng trong project

* bean: chứa các lớp Bean đóng gói thực thể

* controllers: chứa các lớp điều khiển, xử lý nghiệp vụ chính

* models: định nghĩa các cấu trúc dữ liệu sử dụng trong phần mềm

* service:chứa các lớp tác động đến dữ liệu trong cơ sở dữ
liệu (cung cấp các phương thức thực hiện truy vấn SELECT, INSERT,
UPDATE, DELETE trên các bảng dữ liệu)

* utility: chứa các lớp tiện ích

* views: chứa các lớp kế thừa từ javax.swing.* định nghĩa các
màn hình giao diện người dùng cho ứng dụng  

## TRIỂN KHAI

* **Bước 1:** Download file zip về máy tính và thực hiện giải nén

* **Bước 2:** Mở công cụ NetBeans IDE

* **Bước 3:** Chọn File -> Open Project và mở project đã tải về
  
  ![SoucePackage](https://raw.githubusercontent.com/NamLP183957/CNPM_Project_Nhom23/master/DataBaseImage/CauTrucProject.jpg)

* **Bước 4:** Thêm vào thư mục Libraries của project MySQL JDBC Driver và các thư viện của freechart để vẽ biểu đồ
   
   ![Libraries](https://raw.githubusercontent.com/NamLP183957/CNPM_Project_Nhom23/master/DataBaseImage/ThemVaoThuVien.jpg)

* **Bước 5:** Chạy file LoginFrame.java để bắt đầu chạy thử


## THÀNH VIÊN ĐÓNG GÓP

Hoàng Trung Hiếu (hieu.ht183915@sis.hust.edu.vn)

Lê Phương Nam	(nam.lp183957@sis.hust.edu.vn)

Lê Minh Nghĩa (nghia.lm183960@sis.hust.edu.vn)

Trần Văn Tuyền (tuyen.tv184012@sis.hust.edu.vn)

Đỗ Kim Trà (tra.dk183999@sis.hust.edu.vn)
