package Collection;

import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Integer ,String> tm=new TreeMap<Integer ,String>();
		tm.put(10, "jalebi");
		tm.put(1, "Kajukalti");
		tm.put(90, "Basundi");
		tm.put(39, "Bundi");
		tm.put(27, "GulabJamun");
		tm.put(20, "Rasmalai");
		System.out.println(tm);
		
		System.out.println("------------------------------------------");
		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());
		System.out.println(tm.firstEntry());
		System.out.println(tm.lastEntry());
		
		System.out.println(tm.pollFirstEntry());
		System.out.println(tm.pollLastEntry());
		
		System.out.println("------------------------------------------");

		System.out.println(tm.lowerKey(90));
		System.out.println(tm.floorKey(20));
		
		System.out.println(tm.ceilingKey(2));
		System.out.println(tm.higherKey(10));
		
		System.out.println("------------------------------------------");

		System.out.println(tm.lowerEntry(27));
		System.out.println(tm.higherEntry(90));
		System.out.println(tm.ceilingEntry(27));
		System.out.println(tm.floorEntry(10));
		
		System.out.println("------------------------------------------");
		System.out.println(tm.descendingMap());
		System.out.println(tm);
		
		System.out.println(tm.descendingKeySet());
		System.out.println(tm.navigableKeySet());
		
		System.out.println(tm.subMap(10, false, 90, false));
		System.out.println(tm.headMap(90));
		System.out.println(tm.tailMap(10));
		System.out.println();
		
		
		


	}

}
