package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Vector;

import org.testng.annotations.Test;

public class CollectionTest1 {

@Test
	public void CollnTestM() {
	
//**ArrayList>>	
		ArrayList li = new ArrayList();
		li.add(11);
		li.add("Pune");
		li.add("S");
		
		for(int i=0; i<li.size(); i++) {		//we can use for loop instead of Iterator
			System.out.println(li.get(i));
		}
	
		Iterator itr = li.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		
//**LinkedList>>
//		LinkedList<String> ll = new LinkedList<String>();
//		ll.add(123);							//due to adding <string> int value not accepted.
//		li.add("PCMC");							//only string values acceptable.
		
		LinkedList ll = new LinkedList();		//without <generic> we can add multiple datatypes of values.
		ll.add(22);
		ll.add("City");
		ll.add("s");
		
		Iterator ITR = ll.iterator();
		while(ITR.hasNext()) {
			System.out.println(ITR.next());
		}
		

//**Vector>>		
		Vector v = new Vector();
		v.add(33);
		v.add("PMC");
		v.add("v");
		
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
		
		Iterator vv = v.iterator();
		while(vv.hasNext()) {
			System.out.println(vv.next());
		}
		
		
//**PriorityQueue>>
		PriorityQueue<String> Q = new PriorityQueue<String>();	//<generic> in PriorityQueue is mandatory.
		Q.add("Sushant");
		Q.add("Patil");
		
		Iterator q = Q.iterator();
		while(q.hasNext()) {
			System.out.println(q.next());
		}
	
		
//**HashSet>>
		HashSet h = new HashSet();
		h.add("Nik");
		h.add(333);
		h.add("H");
		
		Iterator HS = h.iterator();
		while(HS.hasNext()) {
			System.out.println(HS.next());
		}
		
		
//**LinkedHashSet>>
		LinkedHashSet lh = new LinkedHashSet();
		lh.add("Dear");
		lh.add(123);
		lh.add("O");
		
		Iterator LHS = lh.iterator();
		while(LHS.hasNext()) {
			System.out.println(LHS.next());
		}
		
	}
}