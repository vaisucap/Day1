package testnew;
import java.util.*;
public class LinkedHashSettest {
public static void main(String args[]) {
	LinkedHashSet <String> lhs= new LinkedHashSet<String>();
	lhs.add("vaishu");
	lhs.add("vaishu");
	lhs.add("vaishu");
	lhs.add("anagha");
	Iterator i= lhs.iterator();
	while (i.hasNext()) {
		System.out.println(i.next());
	}
}
}
