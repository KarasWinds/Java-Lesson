import java.io.*;

public class CopyFile {

	public static void main(String[] args) {
		File infile = new File(args[0]);
		File outfile = new File(args[1]);
		try {
			BufferedReader in = new BufferedReader(new FileReader(infile));
			PrintWriter out = new PrintWriter(new FileWriter(outfile));
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
