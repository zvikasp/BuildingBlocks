package simplilearn.java;

class defAccessSpecifier {

	void display() {
		System.out.println("You are using default access specifier");
	}
}

class privateAccessSpecifier {
	@SuppressWarnings("unused")
	private void display() {
		System.out.println("You are using private access specifier");
	}
}

class protectedAccessSpecifier {
	protected void display() {
		System.out.println("This is protected access specifier");
	}
}

class publicAccessSpecifier {
	public void display() {
		System.out.println("This is Public Access Specifier");
	}
}

public class accessSpecifiers1 extends protectedAccessSpecifier {

	public static void main(String[] args) {
		// default
		System.out.println("Default Access Specifier");
		new defAccessSpecifier().display();

		System.out.println("\n********************");
		System.out.println("Private Access Specifier");
		// not accessible and allowed
		// new privateAccessSpecifier().display();

		System.out.println("\n********************");
		System.out.println("Protected Access Specifier");
		new protectedAccessSpecifier().display();
		
		System.out.println("\n********************");
		System.out.println("Public Access Specifier");
		new publicAccessSpecifier().display();
	}

}
