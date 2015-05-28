package ocjp.gold.upgrade.example01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class App {
	public static void main(String[] args) {

		FileSystem fs = FileSystems.getDefault();
		Path path1 = fs.getPath("test1.txt");
		Path path2 = fs.getPath("test2.txt");
		Charset charset = Charset.forName("UTF-8");

		try (BufferedReader reader1 = Files.newBufferedReader(path1, charset);
				BufferedReader reader2 = Files.newBufferedReader(path2, charset)) {
			String linea = reader1.readLine();
			// …
		} catch (IOException e) {
			// 例外処理
		} finally {
			System.out.println("finally.");
		}

	}
}
