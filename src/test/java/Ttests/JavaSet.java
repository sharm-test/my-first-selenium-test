package Ttests;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JavaSet {

	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		System.out.println(s.size());
		s.add("India");
		s.add("USA");
		s.add("China");
		s.add("China");
		s.add("China");
		
		System.out.println(s.size());
		
		Iterator<String> it = s.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
