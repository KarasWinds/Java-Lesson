import java.util.*;
import java.io.*;

public class EmployeeMain {

	public static void main(String[] args) {
		File file = new File(args[0]);
		List<Employee> EE = new ArrayList<>();
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			String str;
			while ((str = in.readLine()) != null) {
				StringBuffer sb = new StringBuffer(256);
				sb.append(str);
				String[] emptemp = sb.toString().split(",");
				EE.add(Employee.emptype(emptemp));
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		for (int i = 0; i < EE.size(); i++) {
			EE.get(i).display();
			System.out.println(" , Pay:" + EE.get(i).paySalary());
		}
		System.out.println("------------------------------------------------------------------------------------------");
		for (int i = 0; i < EE.size(); i++) {
			EE.get(i).OTSalsry(EE.get(i));
			EE.get(i).display();
			System.out.println(" , Pay(OT):" + EE.get(i).paySalary());
		}

	}

}
