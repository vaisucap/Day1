package testnew;

public class PrimeIndex {
	public static void main(String[] args) {
		int n=10;
		int count=0;
		for (int num=2;count<n;num++) {
			boolean isPrime =true;
			for(int i=2;i<=Math.sqrt(num);i++) {
				if (num%i==0) {
					isPrime=false;
					break;
				}
			}
			if (isPrime) {
				System.out.println("Prime "+(count +1)+ ": " +num);
				count++;
			}
			
		}
	}
}
	


