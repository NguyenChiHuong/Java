package taiXiu;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 * Một người chơi sẽ có tài khoản. Người chơi có quyền đặt cược số tiền 
 * ít hơn hoặc bằng số tiền họ đang có .
 * Luật chơi như sau:
 * Có 3 viên xúc sắc . Mỗi viên có 6 mặt có giá trị từ 1 đến 6
 * 1. Nếu tổng = 3 hoặc 18 thì cái ăn hết người chơi thua
 * 2. Nếu tổng = 4 đến 10 thì người chơi đặt xỉu là người chơi thắng,ngược lại thua.
 * 3. Nếu tổng = 11 đến 17 thì người chơi đặt tài là người chơi thắng,ngược lại thua.
 */

public class TaiXiu {
	public static void main(String[] args) {
		double taiKhoan = 5000000;
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			Locale locale = new Locale("vi", "vn");
			NumberFormat format = NumberFormat.getCurrencyInstance(locale);
			
			int luachon = 0;
			do {
				System.out.println("\n--------------------MENU----------------------");
				System.out.println("Hãy chọn 1 để bắt đầu chơi");
				System.out.println("Ngược lại nhấn phím bất kì(*) để thoát.");
				luachon = scanner.nextInt();
				if (luachon == 1) {
					System.out.println("------------BẮT ĐẦU CHƠI-------------------");
					System.out.println("So tien trong tai khoan: " + format.format(taiKhoan) + ", bạn muốn đặt cược?: ");
					//Đặt cược tiền
					double datCuoc = 0;
					do {
						datCuoc = scanner.nextDouble();
					} while (datCuoc <= 0 || datCuoc > taiKhoan);
					
					//Lựa chọn tài ,xỉu
					int luaChonTaiXiu = 0;
					System.out.println("Mời bạn chọn: 1.Tài  2.Xỉu");
					do {
						luaChonTaiXiu = scanner.nextInt();
					}while(luaChonTaiXiu !=1 && luaChonTaiXiu !=2);
					
					//Reo xúc xắc
					Random random = new Random();
					int xucxac1 = random.nextInt(6) + 1;
					int xucxac2 = random.nextInt(6) + 1;
					int xucxac3 = random.nextInt(6) + 1;
					int tong = xucxac1 + xucxac2 + xucxac3;
					
					//Kết quả
					System.out.println("Kết quả reo 3 xúc xắc là: " + xucxac1 +"-"+ xucxac2 +"-"+xucxac3);
					System.out.println("Kết quả tài xỉu: " + tong);
					if(luaChonTaiXiu == 1) {
						if(tong >= 11 && tong <=17) {
							taiKhoan += datCuoc;
							System.out.println("Bạn chọn : Tài .Bạn dành chiến thắng");
							System.out.println("Tài khoản của bạn còn: " + format.format(taiKhoan));
						}else {
							taiKhoan -= datCuoc;
							System.out.println("Bạn chọn : Tài .Bạn bị thua cuộc");
							System.out.println("Tài khoản của bạn còn: " + format.format(taiKhoan));
						}
					}else if(luaChonTaiXiu == 2) {
						if(tong >= 5 && tong <= 10) {
							taiKhoan += datCuoc;
							System.out.println("Bạn chọn : Xỉu .Bạn dành chiến thắng");
							System.out.println("Tài khoản của bạn còn: " + format.format(taiKhoan));
						}else if(tong >= 11 && tong <= 17){
							taiKhoan -= datCuoc;
							System.out.println("Bạn chọn : Xỉu .Bạn bị thua cuộc");
							System.out.println("Tài khoản của bạn còn: " + format.format(taiKhoan));
						}else {
							taiKhoan -= datCuoc;
							System.out.println("Nhà cái thắng .Bạn ");
							System.out.println("Tài khoản của bạn còn: " + format.format(taiKhoan));
						}
					}
				}
			} while (luachon !=0);
		}
	}
}
