package cert;

// A class with default access has no modifier preceding it in the declaration,
// therefore think of default access as package-level access, because a class 
// with default access can only be seen by classes within the same package.

class DefaultBeverage {

	// When you see a question with complex logic, be sure to look at the access 
	// modifiers first. That way, if you spot an access violation (for example
	// a class in package A trying to access a default class in package B), you'll
	// know that the code won't compile so you don't have to bother working through
	// the logic.
	
}
