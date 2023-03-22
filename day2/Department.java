package week5.day2;

public class Department extends College{
	public void deptName() {
		System.out.println("ECE 4 YEAR");
	}
	public static void main(String[] args) {
		Department course = new Department();
		course.deptName();
	}

}
