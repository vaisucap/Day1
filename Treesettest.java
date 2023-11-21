package testnew;
import java.util.*;
public class Treesettest {
	public static void main(String args[]) {
		TreeSet<String> ts= new TreeSet<String>();
		ts.add("you");
		ts.add("welcome");
		ts.add("welcome");
		ts.add("hello");
Iterator i= ts.iterator();
while (i.hasNext()) {
	System.out.println(i.next());
}
	}

}
