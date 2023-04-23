package printWriter;

public class Student {
	private int iD;
	
	private String Name;

	public Student(int iD, String name) {
		this.iD = iD;
		Name = name;
	}

	@Override
	public String toString() {
		return "Student [iD=" + iD + ", Name=" + Name + "]";
	}

}
