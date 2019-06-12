package Test2;

public class run2 {

	public static void main(String[] args) {
		ATM atm = new ATM();
		
		Abdul abdul = new Abdul(atm);
		abdul.start();
		
		James james = new James(atm);
		james.start();
		
		
	}
}
