public class Bird extends Animal {

	public Bird() {
		/*
		 * We set the Flys interface polymorphically
		 * This sets the behavior as a non-flying Animal
		 */
		flyingType = new ItFlys();
	}
}
