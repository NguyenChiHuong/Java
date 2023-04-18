package movieTheater;

public class Test {
	public static void main(String[] args) {
		ShowDate showDate1 = new ShowDate(12, 10, 2220);
		ShowDate showDate2 = new ShowDate(13, 10, 2221);
		ShowDate showDate3 = new ShowDate(14, 10, 2222);
		
		HSX hsx1 = new HSX("3D", "France");
		HSX hsx2 = new HSX("4D", "Spanish");
		HSX hsx3= new HSX("5D", "America");
		
		Firm firm1 = new Firm("111", 1999, hsx1, 200000, showDate1);
		Firm firm2 = new Firm("112", 2000, hsx2, 200000, showDate2);
		Firm firm3 = new Firm("113", 2005, hsx3, 300000, showDate3);
		
		System.out.println(firm1);
		System.out.println(firm2);
		System.out.println(firm3);
		
		System.out.println("\nKiem tra gia ve nho hon firm1 - firm2: "+firm1.checkPriceTicket(firm2));
		System.out.println("Kiem tra gia ve nho hon firm2 - firm3: "+firm2.checkPriceTicket(firm3));
		System.out.println("Kiem tra gia ve nho hon firm3 - firm1: "+firm3.checkPriceTicket(firm1));
		
		firm1.nameHSXFirm();
		firm2.nameHSXFirm();
		firm3.nameHSXFirm();
		
		System.out.println(firm1.priceTicketKM(10));
		System.out.println(firm2.priceTicketKM(15));
		System.out.println(firm3.priceTicketKM(20));
	}
}
