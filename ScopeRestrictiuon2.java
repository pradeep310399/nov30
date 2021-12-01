package november15;

import net.bytebuddy.implementation.bytecode.Division;

public class ScopeRestrictiuon2 extends ScopeRestriction {
	public void multiply(int c,int d) {
		
		float mul=(int)c*d;
		
		System.out.println(mul);
	}
	
	public static void main(String[] args) {
		
		ScopeRestriction sc1 = new ScopeRestrictiuon2();
	       sc1.multiply(95,95);
	}
		
	

		
		
		
	
		
		
		

	

}
