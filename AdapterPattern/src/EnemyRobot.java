/*
 * This is the Adaptee. 
 * The Adapter sends method calls to objects that use the EnemyAttacker interface to the right methods defined in EnemyRobot
 */
import java.util.Random;

public class EnemyRobot {

	Random generator = new Random();
	
	public void smashWithHands() {
		
		int attackDamage = generator.nextInt(10) + 1;
		System.out.println("Enemy Robot causes " + attackDamage + " damage with its hands");
	}
	
	public void walksForward() { 
		
		int movement = generator.nextInt(5) + 1;
		System.out.println("Enemy Robot walks forward " + movement + " spaces");
	}
	
	public void reactToHuman(String driverName) {
		
		System.out.println("Enemy Robot tramps on " + driverName);
	}
}
