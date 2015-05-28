package ocjp.gold.example10;

class TSafe1 {
	final synchronized void doIt() {
	}
}
class TSafe2 {
	static void doIt() {
		synchronized (TSafe2.class) {
		}
	}
}
class TSafe3 {
	synchronized void doIt() {
	}
}
interface TSafe4 {
	//synchronized void doIt();
}

public class App {

}
