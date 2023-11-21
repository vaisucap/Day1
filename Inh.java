package testnew;

public class Inh {
public static void main(String args[]) {
	Animal a= new Animal();
	Rabit r=new Rabit();
	Animal n=a;
	n.non();
	n=r;
	r.veg();
}
}
