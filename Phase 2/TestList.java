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
		
		le.setData(3);
		list.addElement(le);
		
		le.setData(4);
		list.addElement(le);
		
		System.out.println("BEFORE: ");
		list.printLinkedListHead();
		System.out.println();
		list.printLinkedListTail();
		
		list.deleteElement(2);
		System.out.println();
		list.deleteElement(2);
		
		System.out.println("AFTER: ");
		list.printLinkedListHead();
		System.out.println();
		list.printLinkedListTail();
		
		System.out.print("Testing Get!: ");
		System.out.print(list.getElement(2).getData() + "\n");
		
		System.out.println("Testing Add Again!");
		le.setData(5);
		list.addElement(le);
		System.out.println();
		
		list.printLinkedListHead();
		System.out.println();
		list.printLinkedListTail();
		
		//System.out.println(list.getElement(3).getData());
	}
}