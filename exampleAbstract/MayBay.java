package exampleAbstract;


public class MayBay extends PhuongTien{
	
	private String loaiNL;
	
	public MayBay(String loaiPT, HSX hsx,String loaiNL) {
		super(loaiPT, hsx);
		this.loaiNL = loaiNL;
	}

	public String getLoaiNL() {
		return loaiNL;
	}

	public void setLoaiNL(String loaiNL) {
		this.loaiNL = loaiNL;
	}
	
	
	@Override
	public String toString() {
		return "MayBay [loaiNL=" + loaiNL + "]";
	}

	@Override
	public double getVanToc() {
		return 1000;
	}
	
	public void catCanh() {
		System.out.println("Cat canh");
	}
	
	public void haCanh() {
		System.out.println("Ha canh");
	}
}
