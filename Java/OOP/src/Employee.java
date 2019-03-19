
public abstract class Employee {
	private int empno;
	private String name;
	static int empCount;

	public Employee() {
		empCount++;
	}

	public Employee(int empno, String name) {
		this.empno = empno;
		this.name = name;
		empCount++;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getEmpCount() {
		return empCount;
	}

	public void display() {
		System.out.println("empno = " + empno);
		System.out.println("name = " + name);
	}

	public abstract double paySalary();

	public void raiseSalsry(Employee e) {
		if (e instanceof Permanent) {
			Permanent p = (Permanent) e;
			p.setSalary(p.getSalary() * 1.1);
		} else if (e instanceof Temporary) {
			Temporary t = (Temporary) e;
			t.setHourPay(t.getHourPay() + 20);
		}
	}
}