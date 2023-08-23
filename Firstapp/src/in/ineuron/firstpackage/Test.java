package in.ineuron.firstpackage;

public class Test {
	int num = 0;

	public static void show() {
		System.out.println("In outer class");
	}

	public class Exampleofinner {
		int num2 = 0;

		public void inInner() {
			System.out.println("ininner");
		}
	}
}
