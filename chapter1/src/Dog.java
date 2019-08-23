// There can be only one public class per source code file,
// and if there is a public class in a file, the name of the 
// name of the file must match the name of the class.

public class Dog {
	public Dog() {
		System.out.println("Woof woof");
	}

	// A file can have more than one nonpublic class.
	private class CatDog {
		CatDog() {
			System.out.println("Meow Woof");
		}
	}

	public static void main(String[] args){
		Dog d = new Dog();
		Dog.CatDog cd = d.new CatDog();
	}
}
