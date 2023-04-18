package exampleInterface;

public class Test {
	public static void main(String[] args) {
		System.out.println("May tinh fx500");
		MayTinhFX500 fx500 = new MayTinhFX500();
		
		System.out.println(fx500.cong(10, 5));
		System.out.println(fx500.tru(10, 5));
		System.out.println(fx500.nhan(10, 5));
		System.out.println(fx500.chia(10, 5));
		
		MayTinhVinacal500 vinacal500 = new MayTinhVinacal500();
		System.out.println("May tinh vinacal");
		System.out.println(vinacal500.cong(20, 10));
		System.out.println(vinacal500.tru(20, 10));
		System.out.println(vinacal500.nhan(20, 10));
		System.out.println(vinacal500.chia(20, 10));
		
		double[] arr1 = new double[] {3,7,9,4,7,5,6};
		double[] arr2 = new double[] {3,7,9,4,7,5,6};
		
		XapXepChen chen = new XapXepChen();
		XapXepChon chon = new XapXepChon();
		
		chen.sapXepTang(arr1);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(" "+arr1[i]);
		}
		System.out.println("");
		chen.sapXepGiam(arr1);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(" "+arr1[i]);
		}
		System.out.println("\n");
		chon.sapXepTang(arr2);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(" " +arr2[i]);
		}
		System.out.println("");
		chon.sapXepGiam(arr2);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(" " +arr2[i]);
		}
		
		PhanMemMayTinh mayTinh = new PhanMemMayTinh();
		
		System.out.println("\n"+mayTinh.cong(10, 5));
		double[] arr3 = new double[] {3,8,7,5,6};
		mayTinh.sapXepGiam(arr3);
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(" "+arr3[i]);
		}
	}
}
