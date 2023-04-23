package file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class XoaThuMucVaTapTin {
	File file;
	
	public static void xoaFile1(File file) {
		if(file.isFile()) {
			//Xóa tập tin con 
			System.out.println("Đã xóa: "+file.getAbsolutePath());
			file.delete();
		}else if(file.isDirectory()) {
			//Xóa từng tập tin con trong thư mục 
			File[] fileCon = file.listFiles();
			for (File f : fileCon) {
				xoaFile1(f);
			}
			//Xóa thư mục
			System.out.println("Đã xóa: "+file.getAbsolutePath());
			file.delete();
		}
	}
	
	public static void xoaFile2(File file) {
		if(file.isFile()) {
			//Xóa tập tin con 
			System.out.println("Đã xóa: "+file.getAbsolutePath());
			Path fileCon = file.toPath();
			try {
				Files.delete(fileCon);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else if(file.isDirectory()) {
			//Xóa từng tập tin con trong thư mục 
			File[] fileCon = file.listFiles();
			for (File f : fileCon) {
				xoaFile2(f);
			}
			//Xóa thư mục
			System.out.println("Đã xóa: "+file.getAbsolutePath());
			Path pathFile = file.toPath();
			try {
				Files.delete(pathFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		//File file1= new File("D:\\Java\\OPP_java\\src\\file\\forder1");
		File file2= new File("D:\\Java\\OPP_java\\src\\file\\forder2");
		//xoaFile1(file1);
		xoaFile2(file2);
	}
}
