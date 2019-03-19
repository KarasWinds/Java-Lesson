
public class Main {

	public static void main(String[] args) {
		PrimarySupervisor p1 = new PrimarySupervisor("Miki ", "m", "1988-09-26", "0912563456", "台中", 40000, 20);
		SecondarySupervisor p2 = new SecondarySupervisor("Cindy", "w", "1989-04-25", "0952698741", "南投", 40000, 15);
		GeneralStaff p3 = new GeneralStaff("Love ", "g", "2020-20-20", "0920520520", "南投", 35000, 10);
		/*
		p1.display(); 
		System.out.println(); 
		p2.display(); 
		System.out.println();
		p3.display(); 
		System.out.println();
		 */
		Employee[] E = new Employee[3];
		E[0] = p1;
		E[1] = p2;
		E[2] = p3;
		for (int i = 0; i < E.length; i++) {
			E[i].display();
			System.out.println(" , Pay:" + E[i].paySalary());
		}
		System.out.println("------------------------------------------------------------------------------------------");
		for (int i = 0; i < E.length; i++) {
			E[i].OTSalsry(E[i]);
			E[i].display();
			System.out.println(" , Pay(OT):" + E[i].paySalary());
		}

	}

}
