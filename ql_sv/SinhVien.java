package ql_sv;

import java.util.Objects;

public class SinhVien implements Comparable<SinhVien>{
	private String ten;
	
	private int namSinh;
	
	private double diem;
	
	
	
	public SinhVien(String ten) {
		this.ten = ten;
	}

	public SinhVien(String ten, int namSinh, double diem) {
		this.ten = ten;
		this.namSinh = namSinh;
		this.diem = diem;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}

	@Override
	public String toString() {
		return "SinhVien [ten=" + ten + ", namSinh=" + namSinh + ", diem=" + diem + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(diem, namSinh, ten);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		return Objects.equals(ten, other.ten);
	}

	@Override
	public int compareTo(SinhVien o) {
		return this.ten.compareTo(o.ten);
	}
	
	
}
