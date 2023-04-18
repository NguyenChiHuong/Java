package ql_sv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QuanLi{
	private ArrayList<SinhVien> danhSach;

	public QuanLi() {
		this.danhSach = new ArrayList<SinhVien>();
	}

	public QuanLi(ArrayList<SinhVien> danhSach) {
		this.danhSach = danhSach;
	}

	public ArrayList<SinhVien> getDanhSach() {
		return danhSach;
	}

	public void setDanhSach(ArrayList<SinhVien> danhSach) {
		this.danhSach = danhSach;
	}
	
	//Thêm sinh viên vô danh sách
	public void themSinhVien(SinhVien sv) {
		this.danhSach.add(sv);
	}
	
	//Hiển thị thông tin ra màn hình
	public void hienThi() {
		for (SinhVien sinhVien : danhSach) {
			System.out.println(sinhVien);
		}
	}
	
	//Xóa toàn bộ sinh viên
	public void xoaToanBoSV() {
		this.danhSach.removeAll(danhSach);
	}
	
	//Kiểm tra danh sách có rỗng hay khong
	public boolean kiemTraRong() {
		return this.danhSach.isEmpty();
	}
	
	//Tìm kiếm sinh viên qua tên sinh viên
	public void timKiemTen(String ten) {
		for (SinhVien sinhVien : danhSach) {
			if(sinhVien.getTen().indexOf(ten) >= 0) {
				System.out.println(sinhVien);
			}
		}
	}
	
	//Kiểm tra xem sinh viên đó có trong danh sách không
	public boolean kiemTraSV(SinhVien sv) {
		return this.danhSach.contains(sv);
	}
	
	//Xóa 1 sinh viên trong danh sách
	public boolean xoaSinhVien(SinhVien sv) {
		return this.danhSach.remove(sv);
	}
	
	//Xắp Xếp danh sách sinh viên theo thứ tự giảm dần
	public void xapXepGiamDanTheoDiem() {
		Collections.sort(this.danhSach, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien sv1, SinhVien sv2) {
				if(sv1.getDiem() < sv2.getDiem()) {
					return 1;
				}else if(sv1.getDiem() > sv2.getDiem()) {
					return -1;
				}else {
					return 0;
				}
			}
		});
	}
	
	
}
