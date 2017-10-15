import java.util.*;

/*
*
* Filename: TestList.java
* Author: Noah Rowbotham (200364559)
*
*/

public class TestList {
	/*--MAIN--*/
	public static void main(String[] args) {
		ListElement list = new ListElement();
		ListElement le = new ListElement();
		
		le.setData(1);
		list.addElement(le);
		
		le.setData(2);
		list.addElement(le);
		
		/* le.setData(3);
		list.addElement(le);
		
		le.setData(4);
		list.addElement(le); */
		
		list.printLinkedListHead();
		
		System.out.println();
		System.out.println(list.deleteElement(1).getData());
		System.out.println();
		
		System.out.println();
		System.out.println(list.deleteElement(1).getData());
		System.out.println();
		
		/* System.out.println();
		System.out.println(list.deleteElement(2).getData());
		System.out.println(); */
		
		list.printLinkedListHead();
	}
}