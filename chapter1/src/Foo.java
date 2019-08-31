// Interfaces are implicitly abstract whether you type abstract or not.

interface Foo {
	// All interface variables are public, static, and final.
	int BAR = 42;

	// All interface methods are implicitly public and abstract.
	void go();
}
