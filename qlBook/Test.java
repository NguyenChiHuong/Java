package qlBook;

public class Test {
	public static void main(String[] args) {
		NS ns1 = new NS(11, 10, 2000);
		NS ns2 = new NS(12, 11, 2001);
		NS ns3 = new NS(13, 12, 2002);
		
		TG tg1 = new TG("tacGia1", ns1);
		TG tg2 = new TG("tacGia2", ns2);
		TG tg3 = new TG("tacGia3", ns3);
		
		Book book1 = new Book("Doremon", 20000, 1999, tg1);
		Book book2 = new Book("Conan", 25000, 1999, tg2);
		Book book3 = new Book("Dragon ball", 15000, 1990, tg3);
		
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3);
		
		System.out.println("\nKiem tra cung nam sinh book1 - book2:"+book1.checkAlsoYearXB(book2));
		System.out.println("Kiem tra cung nam sinh book2 - book3:"+book2.checkAlsoYearXB(book3));
		System.out.println("Kiem tra cung nam sinh book3 - book1:"+book3.checkAlsoYearXB(book1));
		
		System.out.println("Sau khi giam gia book1 :"+book1.priceAfterDown(10));
		System.out.println("Sau khi giam gia book2 :"+book2.priceAfterDown(5));
		System.out.println("Sau khi giam gia book3 :"+book3.priceAfterDown(15));
	}
}
