package map;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TuDien_treeMap {
	Map<String, String> tudien = new TreeMap<String,String>();
	private String tuVung;
	private String yNghia;
	public String getTuVung() {
		return tuVung;
	}


	public void setTuVung(String tuVung) {
		this.tuVung = tuVung;
	}


	public String getyNghia() {
		return yNghia;
	}


	public void setyNghia(String yNghia) {
		this.yNghia = yNghia;
	}


	public TuDien_treeMap() {
		// TODO Auto-generated constructor stub
	}

	
	public String themTu(String tuVung,String yNghia) {
		return this.tudien.put(tuVung, yNghia);
	}
	
	public String xoaTuVung(String tuVung) {
		return this.tudien.remove(tuVung);
	}
	
	public String traTu(String tuVung) {
		String yNghia = this.tudien.get(tuVung);
		return yNghia;
	}
	
	public void inDanhSachTuVung() {
		Set<String> setTuVung = this.tudien.keySet();
		System.out.println(Arrays.toString(setTuVung.toArray()));
	}
	
	public int laySoLuongTu() {
		return this.tudien.size();
	}
	
	public void xoaTatCa() {
		this.tudien.clear();
	}
	
	public static void main(String[] args) {
		TuDien_treeMap tuDien_treeMap = new TuDien_treeMap();
		Scanner scanner = new Scanner(System.in);
		int luaChon = 0;
		do {
			System.out.println("====================MENU==================");
			System.out.println("1. Thêm từ vựng vào từ điển");
			System.out.println("2. Xóa từ vựng");
			System.out.println("3. Tra từ");
			System.out.println("4. In danh sách từ");
			System.out.println("5. Lấy số lượng từ");
			System.out.println("6. Xóa tất cả các từ khóa");
			System.out.println("0. Thoát");
			System.out.println("Mời bạn chọn: ");
			luaChon = scanner.nextInt();
			if(luaChon==1) {
				scanner.nextLine();
				System.out.println("Nhập từ vựng: ");
				String tuVung = scanner.nextLine();
				System.out.println("Nhập ý nghĩa: ");
				String yNghia = scanner.nextLine();
				tuDien_treeMap.themTu(tuVung, yNghia); 
			}else if(luaChon==2 || luaChon ==3 ) {
				if(luaChon==2) {
					scanner.nextLine();
					System.out.println("Nhập từ vựng cần xóa: ");
					String tuVung = scanner.nextLine();
					tuDien_treeMap.xoaTuVung(tuVung);
				}else {
					scanner.nextLine();
					System.out.println("Nhập từ vựng: ");
					String tuVung = scanner.nextLine();
					System.out.println(tuDien_treeMap.traTu(tuVung));
				}
			}else {
				if(luaChon==4 || luaChon ==5 || luaChon==6) {
					if(luaChon==4) {
						tuDien_treeMap.inDanhSachTuVung();
					}else if(luaChon==5) {
						System.out.println(tuDien_treeMap.laySoLuongTu());
					}else {
						tuDien_treeMap.xoaTatCa();
					}
				}
			}
			
		}while(luaChon != 0);
	}
}
