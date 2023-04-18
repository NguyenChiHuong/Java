package exampleAbstract;

public abstract class PhuongTien {
	private String loaiPT;
	
	private HSX hsx;
	
	public PhuongTien(String loaiPT,HSX hsx) {
		this.hsx = hsx;
		this.loaiPT = loaiPT;
	}
	
	public void setLoaiPT(String loaiPT) {
		this.loaiPT = loaiPT;
	}
	
	public String getloaiPT() {
		return loaiPT;
	}
	
	public void setHSX(HSX hsx) {
		this.hsx = hsx;
	}
	
	public HSX getHSX() {
		return hsx;
	}
	
	public String layTenHSX(HSX tenHSX) {
		return hsx.getTenHSX();
	}
	
	public void batDau() {
		System.out.println("Bat dau");
	}
	
	public void tangToc() {
		System.out.println("Tang toc");
	}
	
	public void dungLai() {
		System.out.println("Dung lai");
	}
	
	public abstract double getVanToc();
}
