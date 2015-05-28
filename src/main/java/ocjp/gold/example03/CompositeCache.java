package ocjp.gold.example03;

public class CompositeCache {
	private static CompositeCache instance;

	private CompositeCache() {
	}

	public static CompositeCache getInstance() {
		if (instance == null) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			instance = new CompositeCache();
		}
		return instance;
	}
}
