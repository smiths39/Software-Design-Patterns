public class Dog extends Animal {
	
	public Dog() {
		/*
		 * We set the Flys interface polymorphically
		 * This sets the behavior as a non-flying Animal
		 */
		flyingType = new CantFly();
	}
}
