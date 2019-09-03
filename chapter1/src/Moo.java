
// Much of access control centers on whether the 
// two classes are in the same of different packages.

class Moo {
	public static void main(String[] args) {
		Moo m = new Moo();
		m.useAZoo();
	}	
	
	public void useAZoo() {
		Zoo z = new Zoo();
		// If the proceeding line compiles Moo has 
		// access to the Zoo class
		// But... does it have access to the coolMethod()?
		System.out.println("A Moo says " + z.coolMethod());
		// The proceeding line works because Moo can
		// access the public method
	}
}

class Cow extends Zoo {
	public static void main(String[] args) {
		Cow c = new Cow();
		c.useAZoo();
	}	
	
	public void useAZoo() {
		Zoo z = new Zoo();
		// If the proceeding line compiles Moo has 
		// access to the Zoo class
		// But... does it have access to the coolMethod()?
		System.out.println("A Cow says " + z.coolMethod());
		// The proceeding line works because Moo can
		// access the public method
	}
}