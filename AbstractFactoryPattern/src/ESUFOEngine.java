/*
 * Here we define a basic component of a space ship
 * Any part that implements the interface ESEngine can replace that part in any ship
 */
public class ESUFOEngine implements ESEngine {

	/* 
	 * EnemyShip contains a reference to the object ESEngine. 
	 * It is stored in the field weapon
	 * The Strategy design pattern is being used here
	 * When the field that is of type ESUFOGun is printed the following shows on the screen
	 */
	public String toString() {
		return "1000 mph";
	}
}
