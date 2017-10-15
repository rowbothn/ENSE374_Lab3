import java.util.*;

/*
*
* Filename: ExampleList.java
* Author: Noah Rowbotham (200364559)
*
*/

public class ListElement {
	private ListElement next;
	private ListElement previous;
	private ListElement firstElement;
	private ListElement lastElement;
	private int length;
	private int data;
	
	public ListElement() {
		this.data = 0;
		this.next = null;
		this.previous = null;
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
			le.previous = lastElement;
			lastElement = le;
		}
		length++;
	}
	
	public ListElement deleteElement(int index) {
		if(index <= 0 || index > length) {
			System.out.println("Invalid Selection");
			return null;
		} //Check if in range
		
		ListElement previous_node = firstElement; //find node before the one to be deleted
		for(int i = 1; i < index-1; i++)
			previous_node = previous_node.next;
		
		if(index == length) { //Node at end
			if (length == 1) { //Only 1 Node in List
				ListElement temp = firstElement;
				firstElement = null;
				length--;
				return temp;
			}
			else { //More than 1 Node
				ListElement deleted_node = lastElement;
				lastElement = previous_node;
				length--;
				return deleted_node;
			}
		}
		else if(index == 1) { //Node at beginning
			ListElement temp = firstElement;
			firstElement = firstElement.next;
			length--;
			return temp;
		}
		else { //Node in the middle
			ListElement deleted_node = previous_node.next;
			ListElement post = deleted_node.next;
			previous_node.next = post;
			length--;
			return deleted_node;
		}
	}
	
	public ListElement getElement(int index) {
		if(index == 1) {
			ListElement get_node = firstElement;
			return get_node;
		}
		else if(index == length) {
			ListElement get_node = lastElement;
			return get_node;
		}
		else {
			ListElement get_node = firstElement;
			for(int i = 1; i <= index; i++) {
				get_node = get_node.next;
			}
			return get_node;
		}
	}
	
	public void printLinkedListHead() {
		ListElement traverse_nodes = firstElement;
		if(length == 0) {
			System.out.println("The List Is Empty.");
		}
		for(int i = 0; i < length; i++) {
			System.out.println(traverse_nodes.getData());
			traverse_nodes = traverse_nodes.next;
		}
	}
	
	public void printLinkedListTail() {
		ListElement traverse_nodes = lastElement;
		if(length == 0) {
			System.out.println("The List Is Empty.");
		}
		for(int i = length; i > 0; i--) {
			System.out.println(traverse_nodes.getData());
			traverse_nodes = traverse_nodes.previous;
		}
	}
}
