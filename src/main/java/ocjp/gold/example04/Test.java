package ocjp.gold.example04;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class Item {
	String name;
	public Item(String name) {
		this.name = name;
	}
	public String toString() {
		return "Item – Name:" + name;
	}
}

public class Test {
	public static void main(String[] s) {
		Map<Integer, Item> items = new TreeMap<>(new Comparator<Integer>() {
			public int compare(Integer k1, Integer k2) {
				// 降順ソート
				return k2.compareTo(k1);
			}
		});
		
		items.put(4, new Item("Java "));
		items.put(6, new Item("Duke "));
		items.put(3, new Item("Hello "));
		for (int key : items.keySet()) {
			System.out.print(items.get(key));
		}
	}
}
