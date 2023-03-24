package AssingmentOops1;

public class Students {
	public void getStudentInfo(int getStudentId) {
		System.out.println(getStudentId);
	}
	public void getStudentInfo(String getStudentName,int getStudentId) {
		System.out.println(getStudentName);
		System.out.println(getStudentId);
	}
	
		
		
	public void getStudentInfo(String getEmailId,long getPhoneNumber) {
		System.out.println(getEmailId);
		System.out.println(getPhoneNumber);
	}
	public static void main(String[] args) {
		Students Information=new Students();
		Information.getStudentInfo(324);
		Information.getStudentInfo("lokeshwaran",324);
		Information.getStudentInfo("lokeshwaranv2000@gmail.com",7871483003l);
		
		
	}
	

}

