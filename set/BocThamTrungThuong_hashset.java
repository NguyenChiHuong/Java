package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class BocThamTrungThuong_hashset {
	
	Set<String> bocThamTrungThuong = new HashSet<String>();
	public BocThamTrungThuong_hashset() {
		// TODO Auto-generated constructor stub
	}
	
	public int giaTri;
	
	public int getGiaTri() {
		return giaTri;
	}
	public void setGiaTri(int giaTri) {
		this.giaTri = giaTri;
	}
	
	public boolean themPhieu(String giaTri) {
		return this.bocThamTrungThuong.add(giaTri);
	}
	
	public boolean xoaPhieu(String giaTri) {
		return this.bocThamTrungThuong.remove(giaTri);
	}
	
	public boolean kiemTraTonTai(String giaTri) {
		return this.bocThamTrungThuong.contains(giaTri);
	}
	
	public boolean xoaTatCa() {
		return this.bocThamTrungThuong.removeAll(bocThamTrungThuong);
	}
	
	public int soLuongPhieu() {
		return this.bocThamTrungThuong.size();
	}
	
	public String bocTham() {
		String ketQua = "";
		Random random = new Random();
		int viTri = random.nextInt(this.bocThamTrungThuong.size());
		ketQua = (String) bocThamTrungThuong.toArray()[viTri];
		return ketQua;
	}
	
	public void inCacPhieu() {
		System.out.println(Arrays.toString(this.bocThamTrungThuong.toArray()));
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BocThamTrungThuong_hashset bocThamTrungThuong_hashset = new BocThamTrungThuong_hashset();
		int luaChon = 0;
		do {
			System.out.println("======================MENU====================");
			System.out.println("1. Thêm mã số dự thưởng");
			System.out.println("2. Xóa mã số dự thưởng");
			System.out.println("3. Kiểm tra mã số dự thưởng có tồn tại hay không");
			System.out.println("4. Xóa tatts cả các phiếu dự thưởng");
			System.out.println("5. Số lượng phiếu dự thưởng");
			System.out.println("6. Bốc thăm phiếu dự thưởng");
			System.out.println("7. In ra tất cả các phiếu");
			System.out.println("0. Thoát");
			System.out.println("Mời bạn chọn: ");
			luaChon = scanner.nextInt();
			if(luaChon==1 || luaChon==2 || luaChon ==3) {
				scanner.nextLine();
				System.out.println("Nhập giá trị: ");
				String giaTri = scanner.nextLine();
				if(luaChon==1) {
					bocThamTrungThuong_hashset.themPhieu(giaTri);
				}else if(luaChon==2) {
					bocThamTrungThuong_hashset.xoaPhieu(giaTri);
				}else if(luaChon==3) {
					System.out.println("kiểm tra tồn tại: " + bocThamTrungThuong_hashset.kiemTraTonTai(giaTri));
				}
			}else {
				if(luaChon==4) {
					bocThamTrungThuong_hashset.xoaTatCa();
				}else if(luaChon==5) {
					System.out.println("Số lượng phiếu dự thưởng: " + bocThamTrungThuong_hashset.soLuongPhieu());
				}else if(luaChon==6) {
					System.out.println(bocThamTrungThuong_hashset.bocTham()); 
				}else if(luaChon==7) {
					bocThamTrungThuong_hashset.inCacPhieu();
				}
			}
		}while(luaChon != 0);
	}
}
