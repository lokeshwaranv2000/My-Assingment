package week5.day2;

public class Student extends Department {
	public void studentName() {
		System.out.println("Lokeshwaran.v");
		
	}
	public void studentDept() {
		System.out.println("Electronics Communication Engineering");
		
	}
	public void studentId() {
		System.out.println("312618106010");
	}
			public static void main(String[] args) {
				Student studentDetails=new Student();
				studentDetails.studentName();
				studentDetails.studentDept();
				studentDetails.studentId();
				studentDetails.deptName();
				studentDetails.collegeCode();
				studentDetails.collegeName();
				studentDetails.collegeRank();
				
				
				
				
			}

		}
	


