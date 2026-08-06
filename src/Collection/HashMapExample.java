package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String>map=new HashMap<Integer, String>();
		
		map.put(101,"Nashik");
		map.put(null,null);
		map.put(103,"Dhule");
		map.put(106, null);
		map.put(108,"Mumbai");
		map.put(102,"Pune");
		
		System.out.println(map);
		System.out.println("----------------------------------");
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		System.out.println(map.containsKey(102));
		System.out.println(map.containsValue("Pune"));
		
		System.out.println(map.get(101));
		//System.out.println(map.put(108,"Nashik"));

		System.out.println("----------------------------------");
		System.out.println(map.remove(102));
		System.out.println(map.remove(null));
		System.out.println(map.remove(106,null));
		System.out.println(map);
		
		HashMap<Integer, String>map2=new HashMap<Integer, String>();
		map.put(110, "Chennai");
		map.put(111, "delhi");
		
		map.putAll(map2);
		System.out.println(map);
		map2.putAll(map);
		System.out.println(map2);

		map2.clear();
		System.out.println(map2);
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		System.out.println(map.entrySet());
		System.out.println(map.getOrDefault(109,"found"));
		//System.out.println(map.getOrDefault(200,"goa"));
		System.out.println(map);

		System.out.println(map.putIfAbsent(101, "Nashik"));
		System.out.println(map);
		
		System.out.println(map.replace(101,"Nashik", "Goa"));
		System.out.println(map);
		
		//iterating the map object 
		System.out.println();
		System.out.println("----------------------------------");
//		for(Map.Entry<Integer,String>entry:map.entrySet()) {
//			System.out.println(entry.getKey()+"="+entry.getValue());	
//		}
//		
		//iterating the map
		
		for(Integer keys:map.keySet()) {
			System.out.println(keys+"="+map.get(keys));
		}
		
		//iterating the value
		System.out.println();
		System.out.println("----------------------------------");
		for(String value:map.values()) {
			System.out.println(value);
		}

	}

}
