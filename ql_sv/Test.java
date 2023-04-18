package ql_sv;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		QuanLi quanLi = new QuanLi();
		
		try (Scanner scanner = new Scanner(System.in)) {
			int luaChon = 0;
			do {
				System.out.println("===================================MENU==================================");
				System.out.println(" 1. Nhập danh sách sinh viên"+
								    "2. Xuất danh sách sinh viên"+
								    "3. Xóa tất cả sinh viên trong danh sách"+
								    "4. Kiểm tra danh sách có rỗng hay không"+
								    "5. Tìm Kiếm sinh viên trong danh sách qua tên sinh viên"+
								    "6. Kiểm tra xem có sinh viên đó có trong danh sách hay không"+
								    "7. Xóa 1 sinh viên trong danh sách"+
								    "8. Xắp xếp điểm sinh viên theo thứ tự giảm dần"+
								    "0. Thoát ra khỏi chương trình");
				System.out.println("Mời bạn chọn: ");
				luaChon = scanner.nextInt();
				if(luaChon==1) {
					scanner.nextLine();
					System.out.println("-----------Nhập danh sách sinh viên--------------");
					System.out.println("Nhập tên sinh viên: "); String ten = scanner.nextLine();
					System.out.println("Nhập ngày sinh: "); int ngaySinh = scanner.nextInt();
					System.out.println("Nhập điểm: ");	double diem = scanner.nextDouble();
					SinhVien sv = new SinhVien(ten, ngaySinh, diem);
					quanLi.themSinhVien(sv);
				}else if(luaChon==2) {
					System.out.println("--------------Danh sách sinh viên---------------");
					quanLi.hienThi();
				}else if(luaChon==3) {
					System.out.println("----------------Xóa tất cả sinh viên ----------------");
					quanLi.xoaToanBoSV();
				}else if(luaChon==4) {
					System.out.println("Kiểm tra danh sách có rỗng: " + quanLi.kiemTraRong());
				}else if(luaChon==5) {
					System.out.println("Nhập tên sinh viên cần tìm kiếm: ");
					scanner.nextLine();
					String ten = scanner.nextLine();
					quanLi.timKiemTen(ten);
				}else if(luaChon==6) {
					scanner.nextLine();
					System.out.println("Nhập tên sinh viên cần kiểm tra: ");
					String ten = scanner.nextLine();
					SinhVien sv = new SinhVien(ten);
					System.out.println("Sinh viên có tồn tại hay không: " + quanLi.kiemTraSV(sv));
				}else if(luaChon==7) {
					scanner.nextLine();
					System.out.println("Xóa 1 sinh viên trong danh sách: ");
					String ten = scanner.nextLine();
					SinhVien sv = new SinhVien(ten);
					quanLi.xoaSinhVien(sv);
				}else if(luaChon==8) {
					System.out.println("Xắp xếp giảm của điểm: ");
					quanLi.xapXepGiamDanTheoDiem();
					quanLi.hienThi();
				}
			}while(luaChon!=0);
		}
		
	}
}
