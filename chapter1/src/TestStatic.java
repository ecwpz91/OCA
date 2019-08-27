// Sometimes classes will contain static members and the only value 
// import statements have is that they save typing and can make your
// code easier to read. Static imports can be used when you want to
// save typing while using a class's static members.

import static java.lang.System.out;
import static java.lang.Integer.*;

public class TestStatic {
	public static void main(String[] args) {
		// This example also uses a static member that has been used
		// a thousand times - the out field in the System class.

		// Before static imports
		System.out.println("Before static imports: ");
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toHexString(42) + "\n");

		// After static imports
		out.println("After static imports: ");
		out.println(MAX_VALUE);
		out.println(toHexString(42));

		// Watch out for ambiguously named static members. For instance, if you
		// do a static import for both the Integer class and the Long class,
		// referring to MAX_VALUE will cause a compiler error, since both Integer
		// and Long have that same constant and Java won't know which you're
		// referring to.
	}
}
