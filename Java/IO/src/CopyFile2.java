import java.io.*;

public class CopyFile2 {

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(args[0]));
			PrintWriter out = new PrintWriter(new FileWriter(args[1]));
			StringBuilder sb = new StringBuilder(256);
			String str;
			while ((str = in.readLine()) != null)
				sb.append(str).append("\n");
			out.print(sb);
			in.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
