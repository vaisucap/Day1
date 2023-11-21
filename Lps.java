package testnew;

public class Lps {
	
		 
	    public static void main(String[] args)
	    {
	       
	 
	        int arr[] = { 12, 34, 10, 6, 40};
	        System.out.println(lps(arr, arr.length));
	    }
	 
	    private static int lps(int[] arr, int n)
	    {
	        int j = 0;
	        int max = n == 1 ? arr[0] + arr[1] : arr[0];
	        for (int i = 0; i < n; i++) {
	            int sum = arr[j] + arr[i];
	            if (sum > max) {
	                max = sum;
	                if (arr[j] < arr[i]) {
	                    j = i;
	                }
	            }
	        }
	        return max;
	    }
	}

