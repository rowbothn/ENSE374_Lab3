import java.util.*;

/*
*
* Filename: LinkedList.java
* Author: Noah Rowbotham (200364559)
*
*/

public class LinkedList {
	private ListElement firstElement;
	private ListElement lastElement;
	int length;
	
	public LinkedList() {
		firstElement = null;
		lastElement = null;
		length = 0;
	}
	
	public void addElement(ListElement le) {
		if(firstElement == null) {
			firstElement = le;
			lastElement = firstElement;
		}
		else {
			lastElement.setNext(le);
			lastElement = lastElement.getNext();
		}
		length++;
	}
	
	/* public ListElement getElement(int index) {
		
	} */
}