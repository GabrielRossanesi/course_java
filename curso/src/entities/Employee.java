package entities;

public class Employee {

	public String Name;
	public double GrossSalary;
	public double Tax;
	public String percetage;
	
	public double NetSalary() {
		return GrossSalary - Tax;
	}
	
	public void increaseSalary(double percetage){
		GrossSalary += GrossSalary * percetage / 100.0;
	}
	
	public String toString() {
		return Name + ", $ " + String.format("%.2f", NetSalary());
		}
}
