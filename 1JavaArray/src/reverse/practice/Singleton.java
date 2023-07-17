package reverse.practice;

public class Singleton {

	private Singleton() {
		// private constructor
	}

	private static Singleton object;

	
	public static Singleton getInstance() {
		if (object == null) {
			object = new Singleton();
		}
		return object;
	}
}
