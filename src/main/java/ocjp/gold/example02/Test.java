package ocjp.gold.example02;

abstract class ClazzA {
	abstract String doSomething();
}
class ClazzB extends ClazzA {
	String doSomething() {
		return "B";
	}
}
class ClazzC extends ClazzB {
	String doOther() {
		return "C";
	}
}
public class Test {
	public static void main(String[] args) {
		ClazzB b = new ClazzB();
		ClazzA c = new ClazzC();
		System.out.print(b.doSomething() + " : " + c.doSomething());
	}
}
