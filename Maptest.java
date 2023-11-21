package testnew;


	import java.util.*;  
	class Maptest{  
	 public static void main(String args[]){  
	  Map<Integer,String> map=new HashMap<Integer,String>();  
	  map.put(100,"Amit");  
	  map.put(100,"Arun");  
	  map.put(102,"Rahul");  
	  //Elements can traverse in any order  
	  for(Map.Entry m:map.entrySet()){  
	   System.out.println(m.getKey()+" "+m.getValue());  
	  }  
	 }  
	}  

