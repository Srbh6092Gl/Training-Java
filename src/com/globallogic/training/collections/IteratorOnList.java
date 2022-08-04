package com.globallogic.training.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class IteratorOnList {
	public static void main(String[] args) {
		
		Vector<String> ls = new Vector<>();
		ls.add("abc");
		ls.add("xyz");
		ls.add("ijk");
		Collections.sort(ls);
		
		//we cannot change the respective positions of the items after using an iterator on a list
		//Modification only allowed only after iteration has started and not
		//Reference is locked exclusively for the iterator
		Iterator<String> it = ls.iterator();
		
		//we can modify a data at a specific index
		ls.set(1, "new");
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		//Though modifying a the respective positions is allowed after iteration has started
		//But we cannot continue with the iterations after this kind of modification
		Collections.sort(ls,Collections.reverseOrder());
		it=ls.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
