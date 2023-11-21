package testnew;

import java.util.*;

public class LinkedListTest {
	public static void main (String args[])
	{
	LinkedList al=new LinkedList();  
	al.add(10);  
	al.add(2L);  
	al.add(45567890);  
	al.add(2D); 
	al.add("hello vaihsu");
	Iterator itr=al.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
}}}
