
public class SalariedEmployees extends Employee {

	public SalariedEmployees(String firstName, String lastName, double pay) {
		super(firstName, lastName, pay);
	}

	@Override
	public double calculatePay() {
		return getPay() * 80;
	}
	
	

}
