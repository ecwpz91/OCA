// Import and package statements apply to all classes within a source file
// if the class is part of a package, the package statement must be the 
// first line in the source file, before any import statements that may
// be present and if there are any import statements, they must go between
// the package statement (if there is one) and the class declaration.

// We can interpret the import statement as saying, "In the Java API there
// is a package called 'util', and in that package a class called 
// "ArrayList". Whenever you see the word "ArrayList" in the class, it is
// just shorthand for: 'java.util.ArrayList'.
import java.util.ArrayList;
import java.util.TreeSet;

public class MyClass {
	public static void main(String args[]) {
		java.util.ArrayList<String> a =
			new java.util.ArrayList<String>();

		ArrayList<String> b = new ArrayList<String>();

		// You can also add a wildcard character (*) to your import statement
		// that means, "If you see a reference to a class you're not sure of,
		// you can look through the entire package for that class, like so
		// import java.util.*
		//
		// [NOTE]: Best pratice is to only import packages that are needed.
		
		TreeSet<String> t = new TreeSet<String>();

		// Append the specific element to the end of the list
		a.add("Hello");
		b.add("World!");
		t.add("TreeSet");

		for (int i = 0; i < a.size(); i++) {
			// Print a returned element at the specified position in the list
			System.out.println(a.get(i));
		}

		for (int i = 0; i < b.size(); i++) {
			System.out.println(b.get(i));
		}
		
		System.out.println(t.first());
	}
}
