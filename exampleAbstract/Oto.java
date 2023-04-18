package exampleAbstract;

public class Oto extends PhuongTien{
	private String loaiNL;
	
	public Oto(String loaiPT, HSX hsx,String loaiNL) {
		super(loaiPT, hsx);
		this.loaiNL = loaiNL;
	}
	
	public void setLoaiNL(String loaiNL) {
		this.loaiNL = loaiNL;
	}
	
	public String getLoaiNL() {
		return loaiNL;
	}
	
	@Override
	public String toString() {
		return "Oto [loaiNL=" + loaiNL + "]";
	}

	@Override
	public double getVanToc() {
		return 100;
	}
	
}
