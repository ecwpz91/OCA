class Zap implements Foo {

	public static void main(String[] args) {
		Zap z = new Zap();
		z.go();
	}

	public void go() {
		System.out.println(BAR);
	}
}
