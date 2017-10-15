import java.util.*;

/*
*
* Filename: ExampleList.java
* Author: Noah Rowbotham (200364559)
*
*/

public class ListElement {
	private ListElement next;
	private int data;
	
	public ListElement() {
		this.data = 0;
		this.next = null;
	}
	
	public void setNext(ListElement le) {
		next = le;
	}
	
	public ListElement getNext() {
		return this.next;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public int getData() {
		return this.data;
	}
}
