package example_enum;

public class Test {

	public static void main(String[] args) {
		int x = Month.Tháng_10.getNgay();
		System.out.println(x);
		
		ThoiKhoaBieu khoaBieu = new ThoiKhoaBieu(Day.thuhai, "Toán");
		ThoiKhoaBieu khoaBieu1 = new ThoiKhoaBieu(Day.thuba, "Văn");
		ThoiKhoaBieu khoaBieu2 = new ThoiKhoaBieu(Day.thutu, "Anh");
		
		System.out.println(khoaBieu);
		System.out.println(khoaBieu1);
		System.out.println(khoaBieu2);
	}

}
