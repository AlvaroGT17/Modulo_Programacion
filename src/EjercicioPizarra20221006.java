public class EjercicioPizarra20221006 {
	static int z;

	public static void main(String[] args) {
		int z = 6;
		System.out.println(z);
		funcion1();
		System.out.println(z);
		z += 8;
		funcion2();
	}

	static void funcion1() {
		int z = 5;
		funcion2();
		System.out.println(z);
	}

	static void funcion2() {
		z = z + 4;
		System.out.println(z);
	}
}