package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		LinkedHashMap<Integer ,String> lmap=new LinkedHashMap<Integer ,String>();
		
		lmap.put(1,"Sneha");
		lmap.put(4,"Vaish");
		lmap.put(null,"Sakshi");//Multiple null keys are not stored. The second one
		lmap.put(null,"mayur");
		lmap.put(8,"Bhag");
		lmap.put(2,"Om");
		lmap.put(10,"null  ");//multiple values are allowed to null
		lmap.put(15,"null");
		System.out.println(lmap);
		
		System.out.println(lmap.size());
		System.out.println(lmap.isEmpty());
		
		System.out.println(lmap.containsKey(4));
		System.out.println(lmap.containsValue("Bhag"));
		System.out.println(lmap);
		
		System.out.println(lmap.get(11));
		//System.out.println(map.put(108,"Nashik"));

		System.out.println("----------------------------------");
		System.out.println(lmap.remove(10));
		System.out.println(lmap.remove(null));
		System.out.println(lmap);
		System.out.println(lmap.remove(15,null));
		System.out.println(lmap);
		
		
		LinkedHashMap<Integer, String>lmap2=new LinkedHashMap<Integer, String>();
		lmap2.put(11, "Chaya");
		lmap2.put(20, "deva");
		
		lmap2.putAll(lmap2);
		System.out.println(lmap);
		lmap2.putAll(lmap);
		System.out.println(lmap2);

		lmap2.clear();
		System.out.println(lmap2);
		System.out.println(lmap.keySet());
		System.out.println(lmap.values());
		
		System.out.println(lmap.entrySet());
		System.out.println(lmap.getOrDefault(109,"not found"));
		//System.out.println(map.getOrDefault(200,"goa"));
		System.out.println(lmap);

		System.out.println(lmap.putIfAbsent(1, "Sneha"));
		System.out.println(lmap);
		
		System.out.println(lmap.replace(1,"Sneha", "Manuu"));
		System.out.println(lmap);
		
		//iterating the map object 
		System.out.println();
		System.out.println("----------------------------------");
//		for(Map.Entry<Integer,String>entry:map.entrySet()) {
//			System.out.println(entry.getKey()+"="+entry.getValue());	
//		}
//		
		//iterating the map
		
		for(Integer keys:lmap.keySet()) {
			System.out.println(keys+"="+lmap.get(keys));
		}
		
		//iterating the value
		System.out.println();
		System.out.println("----------------------------------");
		for(String value:lmap.values()) {
			System.out.println(value);

	}

}
}
