
public class HourlyEmployee extends Employee {


	private double hoursWorked;//field
	
	public HourlyEmployee(String firstName, String lastName, double pay, double hoursWorked) { //constructor
		super(firstName, lastName, pay);
		this.hoursWorked = hoursWorked;
	}
	
	@Override
	public double calculatePay() { //methods
		return getPay() * hoursWorked;
	}
	
	
}
