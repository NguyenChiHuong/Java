package example_enum;

public class ThoiKhoaBieu {
	private Day ngay;
	
	private String monHoc; 
	public ThoiKhoaBieu() {
		// TODO Auto-generated constructor stub
	}
	public ThoiKhoaBieu(Day ngay, String monHoc) {
		this.ngay = ngay;
		this.monHoc = monHoc;
	}
	public Day getNgay() {
		return ngay;
	}
	public void setNgay(Day ngay) {
		this.ngay = ngay;
	}
	public String getMonHoc() {
		return monHoc;
	}
	public void setMonHoc(String monHoc) {
		this.monHoc = monHoc;
	}
	@Override
	public String toString() {
		return "ThoiKhoaBieu [ngay=" + ngay + ", monHoc=" + monHoc + "]";
	}
}
