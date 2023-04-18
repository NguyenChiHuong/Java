package computer;

public class Test {
	public static void main(String[] args) {
		Date date1 = new Date(12, 10, 1110);
		Date date2 = new Date(13, 10, 1110);
		Date date3 = new Date(14, 10, 1110);
		
		Country country1 = new Country(1, "America");
		Country country2 = new Country(2, "Denmark");
		Country country3 = new Country(3, "France");
		
		HSX hsx1 = new HSX("Apple", country1);
		HSX hsx2 = new HSX("Apple", country2);
		HSX hsx3 = new HSX("Apple", country3);
		
		MyComputer computer1 = new MyComputer(hsx1, date1, 212121.2, 12);
		MyComputer computer2 = new MyComputer(hsx2, date2, 12121.5, 12);
		MyComputer computer3 = new MyComputer(hsx3, date3, 2121231.4, 12);
	
		System.out.println(computer1);
		System.out.println(computer2);
		System.out.println(computer3);
		
		System.out.println("Gia ban computer1 < computer3: "+computer1.checkPriceComputer(computer3));
		System.out.println("Gia ban computer2 < computer1: "+computer2.checkPriceComputer(computer1));
		System.out.println("Gia ban computer3 < computer2: "+computer3.checkPriceComputer(computer2));
		
		computer1.nameCountryComputer();
		computer2.nameCountryComputer();
		computer3.nameCountryComputer();
	}
}
