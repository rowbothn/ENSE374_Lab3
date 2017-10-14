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
		ListElement le = new ListElement();
		le.setData(5);
		
		le.addElement(le);
	}
}