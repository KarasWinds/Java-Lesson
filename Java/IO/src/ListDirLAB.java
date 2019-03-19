import java.io.*;

public class ListDirLAB {

	public static void main(String[] args) {
		File file = new File(args[0]);
		if (!file.isDirectory()) {
			System.err.println("Not a Directory");
			System.exit(0);
		}
		StringBuilder sb = new StringBuilder(256);
		File[] contents = file.listFiles();
		for (int i = 0; i < contents.length; i++)
			sb.append((contents[i].isDirectory()) ? "dir:" : "file:")
			  .append(contents[i].getName()).append("\n");
		System.out.print(sb);

	}

}
