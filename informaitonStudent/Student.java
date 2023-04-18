package informaitonStudent;

import java.util.Objects;

public class Student implements Comparable<Student>{
	private int studentCode;
	
	private String studentName;
	
	private Date date;
	
	private float dTB;
	
	private Classes classes;

	public Student(int studentCode, String studentName, Date date, float dTB,Classes classes) {
		this.studentCode = studentCode;
		this.studentName = studentName;
		this.date = date;
		this.dTB = dTB;
		this.classes = classes;
	}

	public int getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(int studentCode) {
		this.studentCode = studentCode;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getdTB() {
		return dTB;
	}

	public void setdTB(float dTB) {
		this.dTB = dTB;
	}

	public Classes getclasses() {
		return classes;
	}

	public void setclasses(Classes classes) {
		this.classes = classes;
	}

	@Override
	public String toString() {
		return "studentCode:" + studentCode + ", studentName:" + studentName + ", date:" + date.getDay()+"/" + date.getMonth() +"/"+ date.getYear()   + ", dTB="
				+ dTB + ", class:" + classes.getnClass() +", NameKH: "+ classes.getnKH() + "\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(classes, dTB, date, studentCode, studentName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(classes, other.classes) && Float.floatToIntBits(dTB) == Float.floatToIntBits(other.dTB)
				&& Objects.equals(date, other.date) && studentCode == other.studentCode
				&& Objects.equals(studentName, other.studentName);
	}
	
	void nameKHStudent() {
		System.out.println("Sinh vien "+this.studentName+" dang theo hoc " +this.classes.getnKH());
	}
	
	void partSubject() {
		if(this.dTB >= 5) {
			System.out.println(this.studentName+":dau");
		}else {
			System.out.println(this.studentName+":Tach");
		}
	}
	
	boolean checkStudentDate(Student otherStudent) {
		return (this.date.getDay() == otherStudent.date.getDay() && this.date.getMonth() == otherStudent.date.getMonth() && this.date.getYear() == otherStudent.date.getYear());
	}
	
	public String getName() {
		String s = this.studentName.trim();
		if(s.indexOf(" ") >=0 ) {
			int vt = s.lastIndexOf(" ");
			return s.substring(vt+1);
		}else {
			return s;
		}
	}
	
	@Override
	public int compareTo(Student o) {
		String nameS = this.getName();
		String nameO = o.getName();
		
		return nameS.compareTo(nameO);
	}
}
