package file;

import java.io.File;
import java.io.IOException;

public class TaoThuMucVaTapTin {

	public static void main(String[] args) {
		File thuMuc = new File("D:\\Java\\OPP_java\\src\\file");
		
		//Kiểm tra thư mục có tồn tại trong file đó không?
		System.out.println("Kiểm tra tồn tại : " + thuMuc.exists());
		
		//Tạo thư mục trong file có sẵn
		File thuMuc1 = new File("D:\\Java\\OPP_java\\src\\file\\folder1");
		thuMuc1.mkdir(); //make directory
		
		//Tạo nhiều thư mục trong file có sẵn
		File thuMuc2 = new File("D:\\Java\\OPP_java\\src\\file\\folder1\\f2\\f3");
		thuMuc2.mkdirs();
		
		//Tạo tập tin trong thư mục có sẵn
		File tapTin1 = new File("D:\\Java\\OPP_java\\src\\file\\folder1\\taptin.txt");
		File tapTin2 = new File("D:\\Java\\OPP_java\\src\\file\\folder1\\f2\\taptin.xml");
		File tapTin3 = new File("D:\\Java\\OPP_java\\src\\file\\folder1\\f2\\f3\\taptin.pdf");
		try {
			tapTin1.createNewFile();
			tapTin2.createNewFile();
			tapTin3.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
