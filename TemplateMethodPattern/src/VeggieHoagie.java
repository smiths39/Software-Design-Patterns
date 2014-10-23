public class VeggieHoagie extends Hoagie {

	String [] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
	String [] condimentsUsed = { "Oil", "Vinegar" };
	
	boolean customerWantsMeat() { return false; }
	boolean customerWantsCheese() { return false; }
	
	void addMeat() { }

	void addCheese() { }

	void addVegetables() {
		System.out.print("Adding the Veggies: ");
		
		for (String veggie : veggiesUsed) {
			System.out.print(veggie + " ");
		}
	}

	void addCondiments() {
		System.out.print("Adding the Condiments: ");
		
		for (String condiment : condimentsUsed) {
			System.out.print(condiment + " ");
		}
	}
	
}
