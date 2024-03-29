public class TestATMMachine {

	public static void main(String [] args) {
		
		/*
		 * The interface limits access to just the methods you want made accessible
		 */
		GetATMData realATMMachine = new ATMMachine();
		GetATMData atmProxy = new ATMProxy();
		
		System.out.println("\nCurrent ATM State: " + atmProxy.getATMData());
		System.out.println("\nCash in ATM Machine: " + atmProxy.getCashInMachine());
		
		/*
		 *  The user can't perform atmProxy.setCashInMachine(10000) because ATMProxy doesn't have access to that potentially harmful method
		 */
	}
}
