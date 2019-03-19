
public class SecondarySupervisor extends GeneralStaff {
	public static final int Lunchallowance = 1800;
	public static int Jobadd = 3000;

	SecondarySupervisor() {
		super();
	}

	SecondarySupervisor(String name, String sex, String arrivaldate, String Tel, String add, int Salary, int OTh) {
		super(name, sex, arrivaldate, Tel, add, Salary, OTh);
	}
	
	public static void setJobadd(int jobadd) {
		Jobadd = jobadd;
	}

	public double paySalary() {
		return super.paySalary() + Lunchallowance + Jobadd;
	}

	public void display() {
		super.display();
		// System.out.print(" , Lunch:" + Lunchallowance + " , Jobass:" + Jobadd);
	}
}
