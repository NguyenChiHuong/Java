package example_enum;

public enum Month {
	Tháng_1(31),
	Tháng_2(30),
	Tháng_3(31),
	Tháng_4(30),
	Tháng_5(31),
	Tháng_6(30),
	Tháng_7(31),
	Tháng_8(30),
	Tháng_9(31),
	Tháng_10(30),
	Tháng_11(31),
	Tháng_12(30);
	
	public final int songay;
	
	Month(int songay) {
		this.songay = songay;
	}
	
	public int getNgay() {
		return songay;
	}
}
