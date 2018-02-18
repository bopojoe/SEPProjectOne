package project;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class LinkedlistTest {
	LinkedList<String> listTest = new LinkedList<>();
	
	@Before
	public void setup() {
		listTest.add("one");	
	}
	@Test
	public void testForAddToEndOfLinkedList() {
		String str = "two";
		listTest.add("two");
		assertTrue(str.equals(listTest.get(1)));
	}
	@Test
	public void testForAddVersionTwo() {
		String str2 = "two";
		String str1 = "one";
		listTest.add(0, "two");
		assertTrue(str2.equals(listTest.get(0)));
		assertTrue(str1.equals(listTest.get(1)));
		
	}
	@Test
	public void testForSetInLinkedList() {
		listTest.set(0, "two");
		String str2 = "two";
		assertTrue(str2.equals(listTest.get(0)));
		}
	@Test
	public void testForGetInLinkedList() {
		String str1 = "one";
		assertTrue(str1.equals(listTest.get(0)));
		
	}
	
	@Test
	public void testForIndexOfInLinkedList() {
		assertTrue(0 == listTest.indexOf("one"));
	}
	
	@Test
	public void testForRemove1InLinkedList() {
		listTest.add("two");
		listTest.remove(0);
		assertTrue("one"!= listTest.get(0));
		assertTrue("two"== listTest.get(0));
		
	}
	@Test
	public void testForRemove2InLinkedList() {
		listTest.add("two");
		listTest.remove("one");
		assertTrue("one"!= listTest.get(0));
		assertTrue("two"== listTest.get(0));
	}
	
	@Test
	public void testForContainsInLinkedList() {
		assertTrue(listTest.contains("one"));
	}
	
	@Test
	public void testForIsEmptyInLinkedList() {
		assertTrue(false == listTest.isEmpty());
		listTest.remove(0);
		assertTrue(listTest.isEmpty());
	}
	
	@Test
	public void testForSizeOfLinkedList() {
		assertTrue(1 ==listTest.size());
		listTest.add("two");
		assertTrue(2==listTest.size());
	}
	
	@Test
	public void testForClearInLinkedList() {
		assertTrue(1 ==listTest.size());
		listTest.clear();
		assertTrue(listTest.isEmpty());
	}
	
         //www.github.com/bopojoe/SEPProjectOne/
}
