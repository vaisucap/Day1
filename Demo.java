package testnew;
class Demo{

	public static void main(String[] args) {
      String str="apple";
      char t='p';
      int count=0;
      for(int i=0;i<str.length();i++)
      {
    	  if(str.charAt(i)==t) {
    		  count++;
    		  
    	  }
    	  
      }
      System.out.println(count);  
	}

	
	
	}