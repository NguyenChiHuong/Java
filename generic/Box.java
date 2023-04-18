package generic;

public class Box<T>{
	private T giaTri;
	
	public Box(T giaTri) {
		this.giaTri = giaTri;
	}

	public T getGiaTri() {
		return giaTri;
	}

	public void setGiaTri(T giaTri) {
		this.giaTri = giaTri;
	}

}
