// Files with no public classes can have a name that does not
// match any of the classes in the file.

class Test {
	// main() is the method that the JVM uses to start
	// execution of a Java program.
	public static void main(String args[]) {
		// Arrays are zero-based index.
		try {
			System.out.println(args[0] + " " + args[1]);
		} catch (Exception e) {
			Test t = new Test();
			t.main();
		}
	}
	
	// Other versions of main with other signatures are
	// perfectly legal, but they're treated as normal methods.
	// Meaning, that the main() method can be overloaded.
	public void main() {
		System.out.println("Hello World!");
	}
}

// The following are examples of legal declarations for the
// "special" main() signature:

class Animal {
	public static void main(String... x) {
		System.out.println("Hello Animal");
	}
}

class Wombat {
	public static void main(String bang_a_gong[]) {
		System.out.println("Hello Wombat");
	}
}
