package orientadoAoBjetos;

public class Employee {
	private String name;
	private double grossSalary;
	private double tax;
	
	public double nextSalary() {
		return getGrossSalary() - getTax();
	}
	
	public void encreaseSalary(double percentage) {
		setGrossSalary((getGrossSalary()+((getGrossSalary()*percentage)/100)));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

}
