package ocjp.gold.upgrade.example04;

import java.util.HashSet;
import java.util.Set;

public class ThreadTest extends Thread {
	static Set<String> strSet = new HashSet<>();
	public static void main(String[] args) {
		strSet.add("A");
		strSet.add("B");
		new ThreadTest().start();
		for (String str : strSet) { System.out.println(str); strSet.remove(str); }
		System.out.println("size of strSet: " + strSet.size());
	}
	public void run() {
		strSet.add("C"); strSet.add("D"); strSet.add("E");
	}
}
