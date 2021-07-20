## Tổng quan về Linux
- Được phát hành vào năm 1991. Là một hệ điều hành mã nguồn mở.
- Khi chạy hệ điều hành, cần sử dụng giao diện và các câu lệnh cho phép truy cập vào các dịch vụ của hệ điều hành.
## Các câu lệnh cơ bản trong Linux
1. **pwd : In ra đường dẫn của vị trí đang đứng.**
2. **ls :Hiển thị các tệp tin, các thư mục trong thư mục của vị trí hiện tại.**
- ls -a : Hiển thị các file.
- ls -l: Hiển thị kích thước file, ngày giờ.
3. **mkdir : Tạo thư mục mới.**
- mkdir folder : tạo thư mục tên folder.
- mkdir -p /folder1/folder2/folder3 : tạo thư mục chứa nhiều thư mục con.
4. **rm : Xóa tệp tin**
- rm <tên tập tin>: dùng để xoá tập tin.
- rm <tên thư mục> : dùng để xoá một thư mục rỗng.
- rm -r <tên thư mục> : xoá bất kỳ thư mục nào.
5. **mv :Dùng để di chuyển tập tin đến một thư mục mới đồng thời đổi tên tập tin đó.**
- mv <tên tập tin cũ> <tên thư mục đích / tên tập tin mới>: di chuyển một tập tin đến thư mục mới đồng thời đổi tên tập tin.
6. **cp : Dùng để sao chép tệp tin hay thư mục đến thư mục khác.**
- cp <tên tập tin> <tên thư mục> : dùng để copy một tập tin vào một thư mục.
- cp -r <tên thư mục nguồn> <tên thư mục đích> : dùng để copy thư mục nguồn vào thư mục đích.
7. **touch : Tạo file mới.**
- touch <tên tập tin>
8. **man : Hiển thị hướng dẫn các câu lệnh**
- man <tên câu lệnh>
9. **cd : Đổi vị trí thư mục hiện tại - di chuyển đến vị trí thư mục khác.**
- cd . : đứng nguyên ở thư mục hiện tại.
- cd ..  : di chuyển đến thư mục cha của thư mục hiện tại.
- cd -  : di chuyển đến thư mục trước khi di chuyển đến thư mục hiện tại.
- cd <tên thư mục con>: di chuyển đến thư mục con bên trong thư mục hiện tại.
- cd <đường dẫn đến thư mục> : di chuyển đến thư mục với đường dẫn là đường dẫn cứng.
10. **cat : Hiển thị toàn bộ nội dung file văn bản.**
- cat File.
11. **df : Hiển thị mức độ chiếm dụng không gian đĩa cứng của tập tin hệ thống ở tất cả các phân vùng được gắn kết.**
- df -h: hiển thị theo đơn vị MB GB.
12. **du : Hiển thị mức chiếm dụng không gian đĩa cứng ở thư mục hiện tại và các thư mục con.**
- du -h: kết quả hiển thị sử dụng đơn vị là KB, MB hay GB.
- du -s: hiển thị tổng dung lượng.
13. **top : Hiển thị thông tin về hệ thống Linux của bạn, các tiến trình đang chạy và tài nguyên hệ thống, bao gồm: CPU, RAM,...**
14. **ifconfig : Hiển thị danh sách các thiết bị mạng trên máy tính. Qua đó có thể biết được địa chỉ IP hiện tại của máy.**
15. **sudo : Khi dùng sudo, máy tính hiểu rằng bạn đang thực thi câu lệnh với quyền cao nhất.**
- sudo shutdown -h now: tắt máy tính ngay lập tức.
- sudo reboot : khởi động lại máy tính.
- sudo 



