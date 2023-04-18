package computer;

import java.util.Objects;

public class MyComputer {
	private HSX hsx;
	
	private Date date;
	
	private double price;
	
	private int timeBH;
	
	public MyComputer(HSX hsx, Date date,double price,int timeBH) {
		this.hsx = hsx;
		this.date = date;
		this.price = price;
		this.timeBH = timeBH;
	}
	
	public void setHSX(HSX hsx) {
		this.hsx = hsx;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setTimeBH(int timeBH) {
		this.timeBH = timeBH;
	}
	
	public HSX getHSX() {
		return hsx;
	}
	
	public Date getDate() {
		return date;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getTimeBH() {
		return timeBH;
	}

	@Override
	public String toString() {
		return "Ten hang: " + hsx.getNHang()+", Ma QG: "+ hsx.getCountry().getCodeC() +", Ten QG: "+hsx.getCountry().getNameC() + ", date: " + date.getDay()+"/" + date.getMonth()+"/" + date.getYear() + ", price :" + price + ", timeBH :" + timeBH ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, hsx, price, timeBH);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyComputer other = (MyComputer) obj;
		return Objects.equals(date, other.date) && Objects.equals(hsx, other.hsx)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && timeBH == other.timeBH;
	}
	
	public boolean checkPriceComputer(MyComputer otherComputer) {
		return this.price < otherComputer.price;
	}
	
	public void nameCountryComputer() {
		System.out.println("Quoc gia san xuat may tinh:" + this.hsx.getCountry().getNameC() );
	}
}
