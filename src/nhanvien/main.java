package nhanvien;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		// khởi tạo lớp quản lí với biến manager để dùng trong main
		NhanvienQl manager = new NhanvienQl();

		Scanner scanner = new Scanner(System.in);
		int choice; // kiểm soát menu

		do {
			// giao diện menu
			System.out.println("----------------------------------");
			System.out.println("1. Thêm nhân viên");
			System.out.println("2. Xóa nhân viên");
			System.out.println("3. Cập nhật nhân viên");
			System.out.println("4. Tìm kiếm nhân viên");
			System.out.println("5. Hiển thị danh sách nhân viên");
			System.out.println("6. Nhân viên có lương lơn hon 100: ");
			System.out.println("0. Thoát");
			System.out.print("Chọn: ");
			choice = scanner.nextInt(); // Nhập lựa chọn - lưu vào biến choice
			scanner.nextLine(); // Xử lý dòng mới

			// Kiểm soát menu theo biến choice và sau đó xử lí từng trường hợp riêng biệt
			switch (choice) {
			case 1:
				System.out.print("Nhập mã nhân viên: ");
				String id = scanner.nextLine();
				System.out.print("Nhập tên nhân viên: ");
				String name = scanner.nextLine();
				System.out.print("Nhập tuổi: ");
				int age = scanner.nextInt();
				System.out.print("Nhập lương: ");
				double score = scanner.nextDouble();
				manager.addNhanvien(new Nhanvien(id, name, age, score));
				break;
			case 2:
				System.out.print("Nhập mã nhân viên cần xóa: ");
				String removeId = scanner.nextLine();
				manager.removeNhanvien(removeId);
				break;
			case 3:
				System.out.print("Nhập mã nhân viên cần cập nhật: ");
				String updateId = scanner.nextLine();
				System.out.print("Nhập tên mới: ");
				String newName = scanner.nextLine();
				System.out.print("Nhập tuổi mới: ");
				int newAge = scanner.nextInt();
				System.out.print("Nhập lương mới: ");
				double newScore = scanner.nextDouble();
				manager.updateNhanvien(updateId, newName, newAge, newScore);
				break;
			case 4:
				System.out.print("Nhập mã nhân viên cần tìm: ");
				String searchId = scanner.nextLine();
				Nhanvien foundNhanvien = manager.findNhanvien(searchId);
				if (foundNhanvien != null) {
					System.out.println("Thông tin nhân viên: " + foundNhanvien);
				} else {
					System.out.println("Không tìm thấy nhân viên.");
				}
				break;
			case 5:
				manager.hienthi();
				break;
			case 6:
				manager.checkLuong();
				break;
			case 0:
				System.out.println("Thoát chương trình.");
				break;
			default:
				System.out.println("Lựa chọn không hợp lệ.");
			}
		} while (choice != 0);
		scanner.close();
	}
}
