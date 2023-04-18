package exampleAbstract;

public class Test {
	public static void main(String[] args) {
		HSX hsx3 = new HSX("TOYOTA", "Japan");
		HSX hsx2 = new HSX("Dia hinh", "Korea");
		HSX hsx1 = new HSX("VN online", "Vietnamese");
		
		PhuongTien phuongTien3 = new MayBay("May bay", hsx3, "Hat nhan");
		PhuongTien phuongTien2 = new Oto("Oto", hsx2, "Xang");
		PhuongTien phuongTien1 = new XeDap("Xe dap", hsx1);
		
		System.out.println(phuongTien1);
		System.out.println("Van toc: "+phuongTien1.getVanToc());
		System.out.println(phuongTien2);
		System.out.println("Van toc: "+phuongTien2.getVanToc());
		System.out.println(phuongTien3);
		System.out.println("Van toc: "+phuongTien3.getVanToc());
		
		
		System.out.println(phuongTien1.layTenHSX(hsx1));
	}
}
