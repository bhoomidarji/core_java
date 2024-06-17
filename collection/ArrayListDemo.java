package core.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);	
		al.add(10.10);		
		al.add("tops");
		al.add('t');		
		al.add(true);		
		al.add(null);		
		al.add(10);	
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.indexOf('t'));
		System.out.println(al.lastIndexOf(10));
		System.out.println(al.isEmpty());
		System.out.println(al.get(4));
		System.out.println(al.remove(2));
		System.out.println(al);
		System.out.println("------Iterator------");
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println((itr.next()));
		}
		System.out.println("------List Iterator------");
		ListIterator litr=al.listIterator();
		while(litr.hasNext())
		{
			System.out.println((litr.next()+" Tops"));
		}
		while(litr.hasNext())
		{
			System.out.println((litr.next()));
		}
		System.out.println("------List Iterator Reverse------");
		while(litr.hasPrevious())
		{
			System.out.println((litr.previous()));
		}
		}
}
