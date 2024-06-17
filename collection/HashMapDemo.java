package core.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(772, "jigar");
		hm.put(562, "bhoomi");
		hm.put(655, "pramisha");
		hm.put(522, "dhruvin");
		hm.put(555, "kinjal");
		hm.put(562, "sumit");
		hm.put(489, "dolly");
		hm.put(745, "priya");
		
		System.out.println(hm);
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
		Set set=hm.entrySet();
		
		Iterator itr=set.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}
		
	}
	


