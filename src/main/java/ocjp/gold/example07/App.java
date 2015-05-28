package ocjp.gold.example07;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
	public static void main(String[] args) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(
				"order.txt", false))) {
			bw.append("0423:01111999:XYZ Corporation:789.94");
			bw.newLine();
			bw.flush();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
