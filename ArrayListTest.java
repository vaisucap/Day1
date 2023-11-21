package testnew;

import java.util.*;  
class ArrayListTest{  
public static void main(String args[]){  
ArrayList<String> crew=new ArrayList<String>(); 
crew.add("Ravi"); 
crew.add("Vijay");  
crew.add("Ravi");  
crew.add("Ajay");  
 
Iterator itr=crew.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  