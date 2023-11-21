package testnew;
//Set<data-type> s1 = new HashSet<data-type>();  
//Set<data-type> s2 = new LinkedHashSet<data-type>();  
//Set<data-type> s3 = new TreeSet<data-type>(); 
import java.util.*;  
public class Settest {
	
	
	public static void main(String args[]){  
	
	HashSet<String> team=new HashSet<String>();  
	team.add("Ravi");  
	team.add("Ravi");  
	team.add("Ravi");  
	team.add("Ajay");  
	  
	Iterator<String> itr=team.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}    
}
