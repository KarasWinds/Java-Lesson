
public abstract class Employee {
	private String name;
	private String sex;
	private String arrivaldate;
	private String Tel;
	private String add;

	Employee() {
		super();
	}

	Employee(String name, String sex, String arrivaldate, String Tel, String add) {
		this.name = name;
		this.sex = sex;
		this.arrivaldate = arrivaldate;
		this.Tel = Tel;
		this.add = add;
	}

	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	public String getArrivaldate() {
		return arrivaldate;
	}

	public String getTel() {
		return Tel;
	}

	public String getAdd() {
		return add;
	}

	public abstract double paySalary();

	public void display() {
		System.out.print(
				"name:" + name + " , sex:" + sex + " , arrivaldate:" + arrivaldate + " , Tel:" + Tel + " , add:" + add);
	}

	public void OTSalsry(Employee e) {
		if (e instanceof GeneralStaff) {
			GeneralStaff g = (GeneralStaff) e;
			g.setSalary((int) (g.getSalary() + g.getOTh() * g.getOTp()));
		}
	}

	public static Employee emptype(String[] emptemp) {
		Employee E = null;
		switch (Integer.parseInt(emptemp[7])) {
		case 1:
			E = new PrimarySupervisor(emptemp[0], emptemp[1], emptemp[2], emptemp[3], emptemp[4],
					Integer.parseInt(emptemp[5]), Integer.parseInt(emptemp[6]));
			break;
		case 2:
			E = new SecondarySupervisor(emptemp[0], emptemp[1], emptemp[2], emptemp[3], emptemp[4],
					Integer.parseInt(emptemp[5]), Integer.parseInt(emptemp[6]));
			break;
		case 3:
			E = new GeneralStaff(emptemp[0], emptemp[1], emptemp[2], emptemp[3], emptemp[4],
					Integer.parseInt(emptemp[5]), Integer.parseInt(emptemp[6]));
			break;
		}
		return E;
	}

}
