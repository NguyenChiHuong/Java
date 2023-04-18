package computer;

public class Country {
	private int codeC;
	
	private String nameC;
	
	public Country(int codeC,String nameC) {
		this.codeC = codeC;
		this.nameC = nameC;
	}
	
	public void setCodeC(int codeC) {
		this.codeC = codeC;
	}
	
	public void setNameC(String nameC) {
		this.nameC = nameC;
	}
	
	public int getCodeC() {
		return codeC;
	}
	
	public String getNameC() {
		return nameC;
	}
}
