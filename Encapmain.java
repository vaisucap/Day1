package testnew;

public class Encapmain {
	
		public static void main(String[] args)
		{
			// person object created
			Encap person = new Encap();
			person.setName("John");
			person.setAge(30);

			// Using methods to get the values from the
			// variables
			System.out.println("Name: " + person.getName());
			System.out.println("Age: " + person.getAge());
		}
	}

