public class ATMMachine implements GetATMData {

	ATMState atmState;
	int cashInMachine = 2000;
	
	public ATMState getATMData() {
		
		return atmState;
	}

	public int getCashInMachine() {
		
		return cashInMachine;
	}

}
