import java.util.*;

/*
*
* Filename: ExampleList.java
* Author: Noah Rowbotham (200364559)
*
*/

public class ListElement {
	private ListElement next;
	private ListElement firstElement;
	private ListElement lastElement;
	private int length;
	private int data;
	
	public ListElement() {
		this.data = 0;
		this.next = null;
	}
	
	public ListElement(ListElement node) {
		data = node.getData();
	}
	
	public void setData(int input) {
		this.data = input;
	}
	
	public int getData() {
		return this.data;
	}
	
	public void addElement(ListElement node) {
		ListElement le = new ListElement(node);
	
		if(firstElement == null) {
			firstElement = le;
			lastElement = firstElement;
		}
		else {
			lastElement.next = le;
			lastElement = le;
		}
		length++;
	}
	
	public void printLinkedListHead() {
		ListElement traverse_nodes = firstElement;
	
		for(int i = 0; i < length; i++) {
			System.out.println(traverse_nodes.getData());
			traverse_nodes = traverse_nodes.next;
		}
	}
}
