package file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class DiChuyenFileVaSaoChepFile {
	File file;
	
	public static void copyAll(File file1 ,File file2) {
		//Copy chính thư mục đó
		try {
			Files.copy(file1.toPath(), file2.toPath(),StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(file1.isDirectory()) {
			File[] fileCon = file1.listFiles();
			for (File file : fileCon) {
				File file_new = new File(file2.getAbsoluteFile() +"/"+file.getName());
				copyAll(file, file_new);
			}
		}
	}
	
	public static void main(String[] args) {
		File file1 = new File("D:\\Java\\OPP_java\\src\\file\\forder1");
		File file2 = new File("D:\\Java\\OPP_java\\src\\file\\f1");
		File file3 = new File("D:\\Java\\OPP_java\\src\\file\\forder2/forder1");
		
		//Sửa tên thư mục và tập tin
		//file1.renameTo(file2);
		
		//Sửa tên thư mục và tập tin
		try {
			Files.move(file1.toPath(), file2.toPath(),StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Di chuyển file vào file khác
		try {
			Files.move(file1.toPath(), file3.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Copy file sang file khác-------lưu ý: cách này chỉ copy được thư mục hoặc tập tin chứ không thể copy được tập tin con
//		File file1 = new File("D:\\Java\\OPP_java\\src\\file\\forder1");
//		File file2 = new File("D:\\Java\\OPP_java\\src\\file\\f1");
		try {
			Files.copy(file2.toPath(), file1.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Copy file sang file khác 
//		File file2 = new File("D:\\Java\\OPP_java\\src\\file\\forder1");
//		File file1 = new File("D:\\Java\\OPP_java\\src\\file\\f1");
		copyAll(file1, file2);
	}
}
