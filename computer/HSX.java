package computer;

public class HSX {
	private String nHang;
	
	private Country country;
	
	public HSX(String nHang, Country country) {
		this.nHang = nHang;
		this.country = country;
	}
	
	public void setNHang(String nHang) {
		this.nHang = nHang;
	}
	
	public void setCountry(Country country) {
		this.country = country;
	}
	
	public String getNHang() {
		return nHang;
	}
	
	public Country getCountry() {
		return country;
	}
}
