

import java.util.Iterator;
import java.util.LinkedList;

public class FirstAndLastElement {
	public static void main(String[] args)
	{
		/*Java LinkedList class uses a doubly linked list to store the elements. 
		 * It provides a linked-list data structure. 
		 * It inherits the AbstractList class and implements List and Deque interfaces.
		 * Insertation order is preserved.
		 * Duplicates are allowed
		 * 
		 */
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(60);
		list.add(20);
		list.add(70);
		list.add(50);
		list.add(40);
		list.add(50);
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
	//	To get the linked list in reverse order
		Iterator<Integer> it = list.descendingIterator();

		while(it.hasNext()) {
			System.out.println(	it.next());
		}


	}

}
