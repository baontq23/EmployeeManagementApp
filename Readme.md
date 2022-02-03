# Chương trình quản lý nhân viên

>Chương trình nhỏ được viết bằng Java

## Tính năng

- [x] Mở file và nhập thông tin từ file
- [x] Ghi thông tin vào file
- [x] Hiển thị danh sách nhân viên lên bảng
- [x] Tìm nhân viên và hiển thị lên form
- [x] Hiển thị nhân viên lên form khi click vào một hàng trên bảng
- [x] Hiển thị thông tin trạng thái
- [x] Thực hiện các nút điều hướng
- [x] Thêm nhân viên và có kiểm tra dữ liệu phải nhập trước khi lưu
- [x] Cập nhật và có kiểm tra dữ liệu phải nhập trước khi lưu
- [x] Xóa nhân viên
- [x] Hiển thị đồng hồ hệ thống theo từng phút (6000 mili giây)

## Cài đặt

Sử dụng [Netbeans](https://www.oracle.com/java/technologies/downloads/) v12.6 và [JDK](https://www.oracle.com/java/technologies/downloads/) mới nhất

## Chú ý

Trong quá trình xây dựng, tôi sử dụng 1 phương thức để tạo ra dữ liệu để thuận tiện hơn trong việc kiểm tra sự chính xác của chương trình
```
public void initEmp() {
        empList.add(new Employee("NV01", "bao", "baontq@gmail.com", 4333, 14));
        empList.add(new Employee("NV02", "nam", "namnt@gmail.com", 323, 27));
        empList.add(new Employee("NV03", "hoang", "hoanght@gmail.com", 1213, 17));
        empList.add(new Employee("NV04", "khanh", "khanhft@gmail.com", 4242, 15));
        empList.add(new Employee("NV05", "thu", "thunt@gmail.com", 1234, 14));

        empList.renderToTable(tblModel);
    }
```
Và ở phiên bản 1.5 tôi đã vô hiệu hoá nó.

Đường dẫn đọc ghi file, bạn có thể thay đổi trong phương thức `saveToFile()` và `loadFormFile()` tại lớp EmployeeList.

Bạn có thể sử dụng JFileChooser kết hợp `getCurrentDirectory().toString();` để lấy đường dẫn tự động theo ý muốn người dùng.

## Hình ảnh
<p align="center">
  <img src="https://github.com/baooshacker/EmployeeManagementApp/blob/main/img/MultiThread.png"/>
</p>


## Giai đoạn xây dựng
- [x] Thiết kế giao diện
- [x] Xây dựng chức năng
- [x] Kiểm tra dữ liệu đầu vào
- [x] Xử lý đa luồng
- [x] Lưu dữ liệu ra file
