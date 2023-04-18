package exampleAbstract;

public class XeDap extends PhuongTien{
	
	public XeDap(String loaiPT , HSX hsx) {
		super(loaiPT,hsx);
	}
	
	@Override
	public String toString() {
		return "XeDap []";
	}


	public double getVanToc() {
		return 10;
	}
}
