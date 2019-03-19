
public class PrimarySupervisor extends SecondarySupervisor {
	public static final int Jobadd = 5000;
	public static final int Tranallowance = 2000;

	PrimarySupervisor() {
		super();
	}

	PrimarySupervisor(String name, String sex, String arrivaldate, String Tel, String add, int Salary, int OTh) {
		super(name, sex, arrivaldate, Tel, add, Salary, OTh);
		super.setJobadd(5000);
	}

	public double paySalary() {
		return super.paySalary() + Tranallowance;
	}

	public void display() {
		super.display();
		// System.out.print(" , tran:" + Tranallowance);
	}

}
