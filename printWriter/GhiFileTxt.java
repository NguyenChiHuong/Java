package printWriter;

import java.io.PrintWriter;

public class GhiFileTxt {
	public static void main(String[] args) {
		try (PrintWriter pW = new PrintWriter("D:\\Java\\OPP_java\\src\\printWriter\\GhiFile.txt", "UTF-8")) {
			pW.print("Xin chào");
			pW.println();
			pW.print("Con số:");
			pW.print(' ');
			pW.print(10);
			pW.println();
			Student st = new Student(1, "Phạm Nhật Vượng");
			pW.print(st);
			pW.flush();
			pW.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
