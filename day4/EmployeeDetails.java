package week2.day4;

public class EmployeeDetails {
   
   public void EmployeeName(String empName) {
	   System.out.println("EmployeeName:"+empName);
	   
	   
   }
   public void employeeId(int empId) {
	   System.out.println("employeeId:"+empId);
   }
   public void getEmployeeAddress(String empAddress) {
	   System.out.println("Employee Address:"+empAddress);
	   
   }
   public void empSalary(double empSalary) {
	   System.out.println("Employee Salary:"+empSalary);
   }
   public void empMoblieNumber(long empMoblieNumber) {
	   System.out.println("Employee Moblie Number:"+empMoblieNumber);
   }
   public static void main(String[] args) {
	   EmployeeDetails Emp = new EmployeeDetails();
	        Emp.EmployeeName("lokesh");
	        Emp.employeeId(555);
	        Emp.getEmployeeAddress("chennai");
	        Emp.empSalary(35000);
	        Emp.empMoblieNumber(7871483003l);
	   
   }
   
   
   
   
}
