package cert;

import java.util.TreeMap;

// You can modify a class declaration using the keyword final, abstract,
// or strictfp. These modifiers are in addition to whatever access control
// is on the class. You must never, ever, ever mark a class as both final 
// and abstract. An abstract class can never be instantiated.

public abstract strictfp class AbstractBeverage {
	private final String TWELVE_FL_OZ = "Tall";
	
	private double price;
	private int size;
	private String name;
	
	// Methods marked abstract end in a semicolon rather than curly braces.
	// If a method in a class (as opposed to an interface) is abstract 
	// then both the method and the class must be marked abstract.
	public abstract TreeMap<Integer, String> getSize();
	
	public String toString() {
		return name;
	}
}
