public interface ATMState {

	/*
	 * Different states expected
	 * HasCard, NoCard, HasPin, NoCash
	 */
	void insertCard();
	void ejectCard();
	void inserPin(int pinEntered);
	void requestCash(int cashToWithdraw);
}
