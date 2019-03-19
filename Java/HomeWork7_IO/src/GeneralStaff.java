
public class GeneralStaff extends Employee {
	private int Salary;
	private int OTh;
	private double OTp;

	GeneralStaff() {
		super();
	}

	GeneralStaff(String name, String sex, String arrivaldate, String Tel, String add, int Salary, int OTh) {
		super(name, sex, arrivaldate, Tel, add);
		this.Salary = Salary;
		this.OTh = OTh;
		this.OTp = this.Salary / 240 * 1.5;
	}

	public double paySalary() {
		return Salary;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public int getOTh() {
		return OTh;
	}

	public double getOTp() {
		return OTp;
	}

	public void display() {
		super.display();
		// System.out.print(" , Salary:" + Salary);
	}

}
