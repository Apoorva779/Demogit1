import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import org.openqa.selenium.WebDriver;
public class Coll {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		//add elements to array list objects
		al.add(7);
		al.add(9);
		al.add(5);
		al.add(8);
		al.add(2);
		al.add(10);
		System.out.println("Array list example");
		for(Integer i:al) {
			System.out.println(i);
		}
		System.out.println("----------------------------------");
		HashSet<String> hs=new HashSet<String>();
		hs.add("Apoo");
		hs.add("punu");
		hs.add("Pushpi");
		hs.add("Thanu");
		System.out.println("HashSet example");
		for(String s:hs) {
			System.out.println(s);
		}
		
		System.out.println("----------------------------------");
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("Tom", 12);
		hm.put("Jerry",13);
		hm.put("Jaggu",14);
		hm.put("Dolu", 15);
		System.out.println(hm.get("Dolu"));
		System.out.println(hm.values());
		System.out.println(hm.keySet());
		System.out.println(hm.remove("Tom"));
		System.out.println(hm);
		System.out.println("----------------------------------");
		Map<String,Integer> mp=new TreeMap<String,Integer>();
		mp.put("Archi",10);
		mp.put("Betty", 12);
		mp.put("Jughead", 67);
		System.out.println(mp.get("Betty"));
		System.out.println(mp.values());
		System.out.println(mp.keySet());
		System.out.println(mp.entrySet());
		System.out.println(mp.put("Marco", 89));
		System.out.println(mp.entrySet());
		
	}
	
}
