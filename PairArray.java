package testnew;

public class PairArray 
{
	public static void main(String args[]) 
	{
		int a[] = {6,8,9,6,5,3,6};
		int s = Integer.MAX_VALUE;
		for (int i = 0; i < a.length - 1; i++) 
		{
			for (int j = i + 1; j < a.length - 1; i++) 
			{
				int sum = a[i] + a[j];
				if (sum < s) 
				{
					s = sum;
				}
				System.out.println("The small: " + s);
			}
		}
	}
}
	

