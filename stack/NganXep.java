package stack;

import java.util.Scanner;
import java.util.Stack;

public class NganXep {
	public static void main(String[] args) {
		Stack<String> xapXep = new Stack<String>();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập chuỗi: ");
		String ten = scanner.nextLine();
		for (int i = 0; i < ten.length(); i++) {
			xapXep.push(ten.charAt(i)+"");
		}
		for (int i = 0; i < ten.length(); i++) {
			System.out.print(xapXep.pop());
		}
		
		Stack<Integer> nhiPhan = new Stack<Integer>();
		System.out.println("Nhập số bất kì: ");
		int x = scanner.nextInt();
		while(x > 0) {
			int soDu = x % 2;
			nhiPhan.push(soDu);
			x = x /2;
		}
		try {
			int n = nhiPhan.size();
			while (n >= 1) {
				System.out.print(nhiPhan.pop());
			} 
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
