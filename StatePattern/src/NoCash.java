public class NoCash implements ATMState {

	ATMMachine atmMachine;
	
	public NoCash(ATMMachine newATMMachine) {
		
		atmMachine = newATMMachine;
	}
	
	public void insertCard() {
		
		System.out.println("We Don't Have Money");
	}

	public void ejectCard() {

		System.out.println("We Don't Have Money, You didn't enter a card");
	}

	public void inserPin(int pinEntered) {

		System.out.println("We Don't Have Money");
	}

	public void requestCash(int cashToWithdraw) {
		
		System.out.println("We Don't Have Money");
	}

}
