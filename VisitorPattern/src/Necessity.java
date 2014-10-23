public class Necessity {

	private double price;
	
	Necessity(double item) {
		
		price = item;
	}
	
	public double getPrice() {
		
		return price;
	}
	
	public double accept(Visitor visitor) {

		return visitor.visit(this);
	}
}
