package additional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Vector;



public class collections {
	public static void main(String[] args) {
//		ArrayList li= new ArrayList();
//		li.add(23);
//		li.add("velocity");
//		li.add(null);
//		li.add(23);
//		System.out.println(li.get(0));
//		System.out.println(li.get(1));
//		System.out.println(li.get(2));
//		System.out.println(li.get(3));
		
//		LinkedList<Integer> li = new LinkedList<Integer>();
//		li.add(23);
//		li.add(null);
//		li.add(23);
//		System.out.println(li.get(0));
//		System.out.println(li.get(1));
//		System.out.println(li.get(2));
//	Vector<String> v=new Vector<String>();
//		
//		v.add("velocity");
//		v.add(null);
//		v.add("velocity");
//		
//		System.out.println(v.get(0));
//		System.out.println(v.get(1));
//		System.out.println(v.get(2));
//		
		PriorityQueue<String> q =new PriorityQueue<String>();
		q.add(null);
		q.add("223");
		
	Iterator it=q.iterator();
		
		while(it.hasNext()) {
			
		
		System.out.println(it.next());
	
		
//		HASHSET---->
		
/*		HashSet<String> h =new HashSet<String>();
		h.add(null);
		h.add(null);
		h.add("fff");
		h.add("fff");//garbage the duplicate value
		Iterator it=h.iterator();
		
	while(it.hasNext()) {
		System.out.println(it.next());
		
		
//		HashMap hmap = new HashMap();
//		hmap.put(1, "ff");
//		hmap.put(2,"vvv");
//		hmap.put(1, "dd");
//		System.out.println(hmap.get(1));
//		System.out.println(hmap.get("gg"));
//		System.out.println(hmap.get(5));
		
		Hashtable ht= new Hashtable();
		ht.put(1, "ht");
		ht.put("gg", "vvb");
		System.out.println(ht.get(1));
		System.out.println(ht.get("gg"));
		
		
		
		
	*/	
		
		}
	}	}