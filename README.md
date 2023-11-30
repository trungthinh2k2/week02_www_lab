# week02_www_lab
## I. Yêu cầu bài tập
  Một công ty cần lập một API cho trang web bán hàng của họ. Thông tin cần lưu trữ bao gồm:
- employee (emp_id, full_name, dob, email, phone, address, status)
- product (product_id, name, description, unit, manufacturer_name, status)
- customer (cust_id, cust_name, email, phone, address)
- product_image (product_id, image_id, path, alternative)
- orders (order_id, order_date, emp_id, cust_id)
- order_detail (order_id, product_id, quantity, price, note)
- product_price (product_id, price_date_time, price, note)
Diễn giải:
- Một product có nhiều image, một image thuộc về một product. Status chỉ trạng thái kinh
doanh của sản phẩm: 1- đang kinh doanh, 0 - tạm ngưng, -1 - không kinh doanh nữa.
- Employee có status: 1- đang làm việc, 0 - tạm nghỉ, -1 – nghỉ việc.
- Một order có nhiều order_detail, một order_detail thuộc về một order.
- Một order thuộc về một employee, một employeecó nhiều order.
- Một customer có nhiều order, một order chỉ thuộc một customer.
- Một product_detail có một giá (price) được lưu trong product_price. Một giá được xác định
bằng product_id và price_date_time. Tại thời điểm lập order, giá được lấy với
price_date_time gần nhất.
Lập REST API cho các thao tác cần thiết của yêu cầu này (dùng JakartaEE):
- Các thao tác CRUD cho các đối tượng, lập order. (dùng JPA).
- Thống kê order theo ngày, theo khoảng thời gian.
- Thống kê order theo nhân viên bán hàng trong 1 khoảng thời gian.
## II. Những yêu cầu đã làm được
  ### 1. Ánh xạ CSDL
  ![AnhXaCSDL](https://github.com/trungthinh2k2/week02_www_lab/assets/89030667/07c1ff69-ad00-4268-b6b9-c8e9921705b3)
  ### 2. Lấy danh sách Employee
![ListEmployee](https://github.com/trungthinh2k2/week02_www_lab/assets/89030667/f536000d-c588-4de7-b2da-eb4124e475ae)

  ### 3. Thêm Employee mới
  ![InsertEmployee](https://github.com/trungthinh2k2/week02_www_lab/assets/89030667/6cc425d7-c0fe-4a9f-95ce-2d8912a18bbb)

  ### 4. Lấy danh sách customer
  ![ListCustomer](https://github.com/trungthinh2k2/week02_www_lab/assets/89030667/d3b114b1-5e47-4a15-bcb1-ba0e3a79ff6e)
  ### 5. Thêm customer mới
  ![InsertCustomer](https://github.com/trungthinh2k2/week02_www_lab/assets/89030667/10a10f30-fb41-4c34-b0d8-d0d892dc2ca9)
  ### CSDL sau khi thêm
  ![CSDL](https://github.com/trungthinh2k2/week02_www_lab/assets/89030667/f761bd82-4304-44af-99b5-9801c7088547)
  ![CSDL2](https://github.com/trungthinh2k2/week02_www_lab/assets/89030667/19bb47ac-a32e-4c0c-b61e-6e026deec5ee)

## II. Những hạn chế chưa làm được
  ### 1. Chưa lập được
  ### 2. Chưa thực hiện được các thao tác thống kê
 
## III. Các công cụ sử dụng
 * IDE: IntelliJ
 * Web server: Tomcat
 * Database server: MySQL
