package ocjp.gold.example03;

public class NewCompositeCache {
	private static NewCompositeCache instance = new NewCompositeCache();

	private NewCompositeCache() {
	}

	public static NewCompositeCache getInstance() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		return instance;
	}
}
