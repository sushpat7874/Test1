package test;

import java.util.HashMap;
import java.util.Hashtable;
import org.testng.annotations.Test;

public class CollectionTest2 {

@Test
//**HashMap>>
	public void ABCD() {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Sushant");
		hm.put(2, null);
		hm.put(2, "Sush");
		hm.put(3, "Sushant");
		hm.put(null, "N");
		hm.put(null, "N2");		//accepting only one null value; //**overriding
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(2));
		System.out.println(hm.get(3));
		System.out.println(hm.get(null));
	}

@Test
//**HashTable>>
	public void ABCD2() {
		Hashtable<Integer, String> htable = new Hashtable<Integer, String>();
		htable.put(11, "Pune");
		htable.put(22, "PCMC");
		htable.put(33, null);		//null value not acceptable
		htable.put(33, "Pune");
		htable.put(44, "City");
		
		System.out.println(htable.get(11));
		System.out.println(htable.get(22));
		System.out.println(htable.get(33));
		System.out.println(htable.get(44));
		
	}
}