package november30;

public class CheckPalindrome {
	public static void main(String[] args) {
		String str = "kayak";
		int length = str.length();
		System.out.println("Length of the String:"+length);
		
	//to find mid
		int mid =str.length();
		System.out.println("Length of the Mid:"+mid);
		
		boolean isPalindrome = true;
		
		 for(int i=0;i<str.length()/2;i++) {
	            if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
	                isPalindrome = false;
	                break;
				
			}
			
	       
		}
		  if(isPalindrome) {
	        	 System.out.println(str+" is Palindrome!");
	         }else {
	        	 System.out.println(str+" is not a Palindrome!");
	         }
	}

}
