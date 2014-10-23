import java.util.LinkedList;

public class ScrabbleTest {
	
	public static void main(String [] args) {
		
		// How you create a new instance of Singleton
		Singleton newInstance = Singleton.getInstance();
		
		// Get unique id for instance object
		System.out.println("Instance 1 ID: " + System.identityHashCode(newInstance));
		
		 // Get all of the letters stored in the List
		System.out.println(newInstance.getLetterList());
		
		// Player 1 draws 7 tiles
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);
		System.out.println("Player 1: " + playerOneTiles);
		System.out.println(newInstance.getLetterList());
		
		// Try getting a new instance using getInstance
		Singleton instanceTwo = Singleton.getInstance();
		
		 // Get unique id for the new instance object
		System.out.println("Instance 2 ID: " + System.identityHashCode(newInstance));
		
		// This returns the value of the first instance created
		System.out.println(newInstance.getLetterList());

		// Player 2 draws 7 tiles
		LinkedList<String> playerTwoTiles = newInstance.getTiles(7);
		System.out.println("Player 2: " + playerOneTiles);
		
	}
}
