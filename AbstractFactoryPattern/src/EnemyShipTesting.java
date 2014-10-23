public class EnemyShipTesting {

	public static void main(String [] args) {
		/*
		 *  EnemyShipBuilding handles orders for new EnemyShips
		 *  You send it a code using the orderTheShip method & it sends the order to the right factory for creation
		 */
		EnemyShipBuilding makeUFOs = new UFOEnemyShipBuilding();
		
		EnemyShip theGrunt = makeUFOs.orderTheShip("UFO");
		System.out.println(theGrunt + "\n");
		
		EnemyShip theBoss = makeUFOs.orderTheShip("UFO BOSS");
		System.out.println(theBoss + "\n");
	}
}
