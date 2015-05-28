package ocjp.gold.example01;

class Super {
	private String id;
	public Super(String key) {
		this.id = key;
	}
	public int hashCode() {
		return 42 + (this.id != null ? this.id.hashCode() : 0);
	}
	public boolean equals(Object obj) {
		final Super other = (Super) obj;
		if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id))
			return false;
		return true;
	}
}
public class Sub extends Super {
	public Sub(String key) {
		super(key);
	}
	public static void main(String[] args) {
		Super p1 = new Super("p1");
		Super p2 = new Sub("p1");
		System.out.println(p1.equals(p2));
	}
}
