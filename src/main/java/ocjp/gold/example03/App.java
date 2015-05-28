package ocjp.gold.example03;

public class App extends Thread {
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			App app1 = new App();
			App app2 = new App();
			App app3 = new App();
			app1.start();
			app2.start();
			app3.start();
		}
	}

	@Override
	public void run() {
		CompositeCache instance = CompositeCache.getInstance();
		//NewCompositeCache instance = NewCompositeCache.getInstance();
		System.out.println(instance.hashCode());
	}
	
}
