package movieTheater;

import java.util.Objects;

public class Firm {
	private String nFirm;
	
	private int nSX;
	
	private HSX hsx;
	
	private float priceTicket;
	
	private ShowDate showDate;
	
	public Firm(String nFirm , int nSX, HSX hsx, float priceTicket, ShowDate showDate) {
		this.nFirm = nFirm;
		this.nSX = nSX;
		this.hsx = hsx;
		this.priceTicket = priceTicket;
		this.showDate = showDate;
	}

	public String getnFirm() {
		return nFirm;
	}

	public void setnFirm(String nFirm) {
		this.nFirm = nFirm;
	}

	public int getnSX() {
		return nSX;
	}

	public void setnSX(int nSX) {
		this.nSX = nSX;
	}

	public HSX getHsx() {
		return hsx;
	}

	public void setHsx(HSX hsx) {
		this.hsx = hsx;
	}

	public float getPriceTicket() {
		return priceTicket;
	}

	public void setPriceTicket(float priceTicket) {
		this.priceTicket = priceTicket;
	}

	public ShowDate getShowDate() {
		return showDate;
	}

	public void setShowDate(ShowDate showDate) {
		this.showDate = showDate;
	}

	@Override
	public String toString() {
		return "[nFirm=" + nFirm + ", nSX=" + nSX + ", hsx=" + hsx.getHangSX() +", hsx=" + hsx.getCountry()+ ", priceTicket=" + priceTicket + ", showDate="
				+ showDate.getDay()+"/" + showDate.getMonth()+ "/"+showDate.getYear()+"]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(hsx, nFirm, nSX, priceTicket, showDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Firm other = (Firm) obj;
		return Objects.equals(hsx, other.hsx) && Objects.equals(nFirm, other.nFirm) && nSX == other.nSX
				&& Float.floatToIntBits(priceTicket) == Float.floatToIntBits(other.priceTicket)
				&& Objects.equals(showDate, other.showDate);
	}
	
	Boolean checkPriceTicket(Firm otherFirm) {
		return priceTicket < otherFirm.priceTicket;
	}
	
	void nameHSXFirm() {
		System.out.println(this.hsx.getHangSX());
	}
	
	float priceTicketKM(float percent) {
		return this.priceTicket * (1 - percent/100);
	}
}
