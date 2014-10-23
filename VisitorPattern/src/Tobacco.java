public class Tobacco {

	private double price;
	
	Tobacco(double item) {
		
		price = item;
	}
	
	public double getPrice() {
		
		return price;
	}
	
	public double accept(Visitor visitor) {

		return visitor.visit(this);
	}
}
