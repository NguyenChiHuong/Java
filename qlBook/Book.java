package qlBook;

import java.time.MonthDay;
import java.util.Objects;

public class Book{
	private String bookN;
	
	private float price;
	
	private int yearXB;
	
	private TG tg;

	public Book(String bookN, float price, int yearXB, TG tg) {
		this.bookN = bookN;
		this.price = price;
		this.yearXB = yearXB;
		this.tg = tg;
	}

	public String getBookN() {
		return bookN;
	}

	public void setBookN(String bookN) {
		this.bookN = bookN;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getYearXB() {
		return yearXB;
	}

	public void setYearXB(int yearXB) {
		this.yearXB = yearXB;
	}

	@Override
	public String toString() {
		return "[Ten sach:" + bookN + ", Gia:" + price + ", Nam xb:" + yearXB + ", Tac gia:" + tg.getTgia() +", Date:"+""+tg.getNs().getDay()+"/"+tg.getNs().getMonth()+"/"+tg.getNs().getYear()+ "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(bookN, price, tg, yearXB);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(bookN, other.bookN) && Float.floatToIntBits(price) == Float.floatToIntBits(other.price)
				&& Objects.equals(tg, other.tg) && yearXB == other.yearXB;
	}
	
	boolean checkAlsoYearXB(Book otherBook) {
		return yearXB == otherBook.yearXB;
	}
	
	float priceAfterDown(float percent) {
		return this.price * (1 - percent/100);
	}
}
