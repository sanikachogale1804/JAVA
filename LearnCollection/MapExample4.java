package LearnCollection;

import java.util.TreeMap;

public class MapExample4 {
	
	public static void main(String[] args) {
		TreeMap<Integer, String> map= 
				       new TreeMap<Integer, String>();
		map.put(101, "A");
		map.put(567, "B");
		map.put(456, "C");
		map.put(235, "D");
		map.put(890, "E");
		map.put(200, "F");
		System.out.println(map);
		
		System.out.println("=========================");
	//	keyset humne call kiya to sari keys milenge and keys ka return type set ka object hai
		
		System.out.println(map.keySet());
		
		System.out.println(map.higherKey(200));
		//higherentry me key and value dono milega
		System.out.println(map.higherEntry(456));
		System.out.println("=========================");
		System.out.println(map.lowerKey(456));
		System.out.println(map.lowerEntry(567));
		System.out.println("=========================");
		System.out.println(map.ceilingKey(237));
		System.out.println(map.ceilingEntry(567));
		System.out.println("=========================");
		System.out.println(map.floorKey(220));
        System.out.println(map.floorEntry(568));
        System.out.println("=========================");
       //headmap ka return type map hai 
        System.out.println(map.headMap(456,true));//by default 456 is not inclusive is liye true likha
        System.out.println(map.tailMap(235,false));//if i want not include 235 then i will return false
        System.out.println("=========================");
        System.out.println(map.subMap(200,true, 890,true));//200 is inclusive and 890 is exclusive
        System.out.println("=========================");
        System.out.println(map.firstEntry());
        System.out.println(map.firstKey());
        System.out.println("=========================");
        System.out.println(map.lastKey());
        System.out.println(map.lastEntry());
        System.out.println("=========================");
        System.out.println(map.pollFirstEntry());//pollFirstEntry() will remove your first entry
        System.out.println(map);
        System.out.println(map.pollLastEntry());//pollLastEntry() will remove your last entry
        System.out.println(map);
        
	}

}
