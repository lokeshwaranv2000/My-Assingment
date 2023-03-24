package AssingmentOops1;

public class BankInfo {
	public void deposit() {
		
		System.out.println("Cash Deposit");
	}
	public void fixed() {
		System.out.println("Fixed Deposit");
	}
		public void saving() {
			System.out.println("Saving Account");
		}
		public static void main(String[] args) {
			BankInfo axisBank=new BankInfo();
			axisBank.deposit();
			axisBank.fixed();
			axisBank.saving();
			
		}
	}


