package ocjp.gold.example08;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class App {
	public static void main(String[] args) {
		FileSystem fs = FileSystems.getDefault();
		Path path = fs.getPath("d:/work/tmp/../wpt/./../../report_01.txt");

		System.out.println(path.toUri());
		System.out.println(path.getFileName());
		System.out.println(path.toAbsolutePath());
		System.out.println(path.normalize());
	}
}
