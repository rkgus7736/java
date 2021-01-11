package inter;

public class TestMain {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Car car = new Car();

		System.out.println(animal instanceof RunInterface);
		System.out.println(car instanceof RunInterface);

		RunInterface inter = car;
		inter.run();
		inter = animal;
		inter.run();
		run(new Car());
		run(new Animal());
		run(car);
		run(animal);
		// 후에 새롭게 등록가능

	}

	public static void run(RunInterface inter) {
		inter.run();
	}
}
