
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
			g.setSalary((int)(g.getSalary() + g.getOTh() * g.getOTp()));
		} 
	}

}
