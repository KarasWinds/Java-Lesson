
public class EmployeeMain {
	public static void main(String[] args) {
		Permanent p = new Permanent();
		p.setEmpno(666);
		p.setName("love");
		p.setSalary(456000);
		p.display();

		Temporary T = new Temporary(666, "kiki", 150, 80);
		T.display();

		Sales S = new Sales(777, "Cindy", 22000, 25000);
		S.display();
		System.out.println("==========================");
		Permanent pp = new Permanent(111, "miki", 60000);
		Temporary t = new Temporary(520, "love", 120, 20);
		Sales s = new Sales(666, "Cindy", 35000, 15000);

		Employee[] e = new Employee[3];
		e[0] = pp;
		e[1] = t;
		e[2] = s;
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i].getName() + "'s Pay = " + e[i].paySalary());
		}
		System.out.println("---------------------------");
		for (int i = 0; i < e.length; i++) {
			e[i].raiseSalsry(e[i]);
			System.out.println(e[i].getName() + "'s raisePay = " + e[i].paySalary());
		}
		
		System.out.print(Employee.getEmpCount());

	}
}