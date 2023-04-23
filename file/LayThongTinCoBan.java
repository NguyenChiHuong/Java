package file;

import java.io.File;
import java.util.Scanner;

public class LayThongTinCoBan {
	File file;

	public LayThongTinCoBan(String tenFile) {
		this.file = new File(tenFile);
	}
	
	public boolean kiemTraThucThi() {
		return this.file.canExecute();
	}
	
	public boolean kiemTraDoc() {
		return this.file.canRead();
	}
	
	public boolean kiemTraGhi() {
		return this.file.canWrite();
	}
	
	public void inDuongDan() {
		System.out.println(this.file.getAbsolutePath());
	}
	
	public void inTenFile() {
		System.out.println(this.file.getName());
	}
	
	public void kiemTraThuMucHayTapTin() {
		if(this.file.isDirectory()) {
			System.out.println("Đây là thư mục");
		}else if(this.file.isFile()){
			System.out.println("Đây là tập tin");
		}else {
			System.out.println("Bạn nhập sai");
		}
	}
	
	public void inDanhSachCacFileCon() {
		if(this.file.isDirectory()) {
			File[] fileCon = this.file.listFiles();
			for (int i = 0; i < fileCon.length; i++) {
				System.out.println(this.file.getAbsolutePath());
			}
		}else if(this.file.isFile()){
			System.out.println("Đây là tập tin không thể có tập tin con");
		}
	}
	
	public void inCayThuMuc() {
		this.inChiTietCayThuMuc(file, 1);
	}
	
	public void inChiTietCayThuMuc(File f,int bac) {
		for (int i = 0; i < bac; i++) {
			System.out.print("\t");
		}
		System.out.print("|__");
		System.out.println(f.getName());
		if(f.isDirectory()&&f.canRead()) {
			File[] fileCon = f.listFiles();
			for (File file : fileCon) {
				inChiTietCayThuMuc(file, bac + 1);
			}
		}
	}
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Nhập file: ");
			String tenfile = scanner.nextLine();
			LayThongTinCoBan thongTinCoBan = new LayThongTinCoBan(tenfile);
			int luaChon = 0; 
			do {
				System.out.println("=================MENU=================");
				System.out.println("1. Kiểm tra file có thể thực thi hay không");
				System.out.println("2. Kiểm tra file có thể đọc");
				System.out.println("3. Kiểm tra file có thể viết ghi");
				System.out.println("4. In đường dẫn: ");
				System.out.println("5. In tên file: ");
				System.out.println("6. Kiểm tra file là thư mục hay tập tin");
				System.out.println("7. In ra danh sách các file con");
				System.out.println("8. In ra cây thư mục");
				System.out.println("9. Thoát");
				System.out.println("Mời bạn chọn: ");
				luaChon = scanner.nextInt();
				switch (luaChon) {
				case 1: {
					System.out.println("Kiểm tra thực thi: " + thongTinCoBan.kiemTraThucThi());
					break;
				}case 2:{
					System.out.println("Kiểm tra đọc: " + thongTinCoBan.kiemTraDoc());
					break;
				}case 3:{
					System.out.println("Kiểm tra ghi: " + thongTinCoBan.kiemTraGhi());
					break;
				}case 4:{
					thongTinCoBan.inDuongDan();
					break;
				}case 5:{
					thongTinCoBan.inTenFile();
					break;
				}case 6:{
					thongTinCoBan.kiemTraThuMucHayTapTin();
					break;
				}case 7:{
					thongTinCoBan.inDanhSachCacFileCon();
					break;
				}case 8:{
					thongTinCoBan.inCayThuMuc();
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + luaChon);
				}
				scanner.nextLine();
			}while(luaChon != 0);
		}
	}
	
}
