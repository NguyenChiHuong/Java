package informaitonStudent;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		Date date1 = new Date(12, 10, 1110);
		Date date2 = new Date(12, 10, 1110);
		Date date3 = new Date(14, 10, 1110);
		
		Classes classes1 = new Classes("Lop 10", "KKT");
		Classes classes2 = new Classes("Lop 11", "KT");
		Classes classes3 = new Classes("Lop 12", "CT");
		
		Student student1 = new Student(1, "hs111 111", date1, 7, classes1);
		Student student2 = new Student(2, "hs2 222", date2, 4, classes2);
		Student student3 = new Student(3, "hs3 55555555", date3, 9, classes3);
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3+"\n");
		
		student1.nameKHStudent();
		student2.nameKHStudent();
		student3.nameKHStudent();
		System.out.println("\nCho biet sinh vien co dau hay khong ?");
		student1.partSubject();
		student2.partSubject();
		student3.partSubject();
		
		System.out.println(student1.checkStudentDate(student2));
		System.out.println(student2.checkStudentDate(student3));
		System.out.println(student3.checkStudentDate(student1)+"\n");
		
		Student[] students = new Student[] {student1,student2,student3};
		
		System.out.println("Truoc khi xap xep: " + Arrays.toString(students));
		
		Arrays.sort(students);
		System.out.println("Sau khi xap xep: " + Arrays.toString(students));
		
		System.out.println("Sau khi tim kiem: "+ Arrays.binarySearch(students, student3));
		
	}
}
