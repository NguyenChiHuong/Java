package generic;

public class Test {

	public static void main(String[] args) {
		Box<String> box = new Box<String>("hello");
		Box<Integer> box1 = new Box<Integer>(15);
		Box<Double> box2 = new Box<Double>(15.5);
		System.out.println("Gia trị: " + box.getGiaTri());
		System.out.println("Gia trị: " + box1.getGiaTri());
		System.out.println("Gia trị: " + box2.getGiaTri());
	}

}
