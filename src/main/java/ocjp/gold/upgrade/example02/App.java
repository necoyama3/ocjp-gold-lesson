package ocjp.gold.upgrade.example02;

public class App {

	public static final Boolean TRUE = new Boolean(true);
	public static final Boolean FALSE = new Boolean(false);

	public static Boolean valueOf(boolean b) {
		return (b ? TRUE : FALSE);
	}

}
