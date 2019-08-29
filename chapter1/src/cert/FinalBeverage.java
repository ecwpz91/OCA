package cert;

// You can modify a class declaration using the keyword final, abstract,
// or strictfp. These modifiers are in addition to whatever access control
// is on the class. You must never, ever, ever mark a class as both final 
// and abstract.

public strictfp final class FinalBeverage {
	
	// For the exam, you need to know that strictfp is a keyword that can be 
	// used to modify a class of a method, but never a variable. Marking a
	// class as strictfp means that any method code in the class will conform 
	// to the IEEE 754 standard rules for floating points. Without the modifier,
	// floating points used in the method might behave in a platform-dependent
	// way. Also, if you don't declar a class as strictfp, you can still get 
	// strictfp behavior on a method-by-method basis, by declaring a method
	// as strictfp.
	public strictfp void importantMethod() {
		
	}

}
