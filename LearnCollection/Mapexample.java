package LearnCollection;

//map collection ka hissa nahi ha,map me sari chije key-value pair me hongi (key and value kya hongi hum hi decide karenge)
//map me hume 2 generic dena hai(key,value) (key is always unique values can be duplicate)
//key can not be duplicate ,value can be duplicate 
//HashMap(unordered)-insertion order will not be maintained
//LinkedHashMap(ordered)
//TreeMap(key ke basis pe sort hongi)
import java.util.HashMap;
import java.util.Set;

public class Mapexample {
	
	public static void main(String[] args) {
		HashMap<Integer, String> students=new HashMap<Integer, String>();
//		hashmap collection ke bhahar hai(is liye add use nahi karenge put method use karenge)
		students.put(101, "sanika");
		students.put(102, "riya");
		students.put(103, "joel");
		students.put(null, null);//only one null key is allowed but value me null jyada add kar sakte hai()values can be duplicate
		students.put(101, "akshata");//latest value matlab last me add kiya
		
		System.out.println(students);
		System.out.println(students.get(102));
		System.out.println(students.getOrDefault(101, "hello"));
//		System.out.println(students.getOrDefault(1011, "hello")); //agar key aap ke value me present nahi hai to apko default value milega
		System.out.println(students.remove(101));
		System.out.println(students);
		
//		keyset will return you set ka object
		System.out.println(students.keySet());
		System.out.println(students.values());//iska return type nahi hai to values can be duplicate
		
		System.out.println("==============================");
//		map ke andar direct iterate nahi ho sakta keyset ki help lenge

		//we are just getting new set of keys
		//keyset internally hume set return karta hai hum uske andar key pass karte hai
		Set<Integer> keys=students.keySet();
		for(Integer k:keys)
		{
			System.out.println(k+" "+students.get(k));
		}
		
		//key present hai to true nahi to false
		System.out.println(students.containsKey(101));
		//value present hai to true nahi to false
		System.out.println(students.containsValue("riya"));
	}
	

}
