package ocjp.gold.example11;

import java.util.Locale;

public class App {
	public static void main(String[] args) {
		Locale loc = Locale.GERMAN;
		Locale.setDefault(loc);
		final Locale locale = Locale.getDefault();
		// Locale locale = new Locale(Locale.GERMAN.toString(), Locale.GERMANY.toString());
		System.out.print("言語: " + locale.getLanguage());
		System.out.println(", 国: " + locale.getCountry());

	}
}
