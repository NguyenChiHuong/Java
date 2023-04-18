package exampleAbstract;

public class HSX {
	private String tenHSX;
	
	private String tenQG;
	
	public HSX(String tenHSX,String tenQG) {
		this.tenHSX = tenHSX;
		this.tenQG = tenQG;
	}
	
	public void setTenHSX(String tenHSX) {
		this.tenHSX = tenHSX;
	}
	
	public void setTenQG(String tenQG) {
		this.tenQG = tenQG;
	}
	
	public String getTenHSX() {
		return tenHSX;
	}
	
	public String getTenQG() {
		return tenQG;
	}
}
