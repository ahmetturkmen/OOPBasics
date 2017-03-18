package tr.ahmetturkmen.DataStructures.Collections;

import java.util.*;

/**
 * Created by ahmetturkmen on 3/2/17.
 */
public class LinkedList {
	public static void main(String[] args) {

		String[] things = { "apples", "noobs", "pwnge", "bacon", "goATS" };

		List < String > list1 = new java.util.LinkedList <>();

		for ( String x : things )
			list1.add(x);

		String[] things2 = { "sausage", "bacon", "goats", "harryPotter" };

		List < String > list2 = new java.util.LinkedList <>();

		for ( String y : things2 )
			list2.add(y);

		list1.addAll(list2);
		list2 = null;

		printMe(list1);
		removeStuff(list1,2,5);
		printMe(list1);
		reverseMe(list1);


	}

	private static void printMe(List < String > list) {

		for ( String b : list )
			System.out.print(" " + b);
		System.out.println();


	}

	private static void removeStuff(List < String > list, int from, int to) {

		list.subList(from,to).clear();


	}

	private static void reverseMe(List < String > list) {
		ListIterator<String> iT = list.listIterator(list.size());
		while (iT.hasPrevious())
			System.out.print(" "+ iT.previous());
	}
}
