package synochronized;

public class ThirdThread extends Thread{
	Table table;

	public ThirdThread(Table table) {
		
		this.table = table;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		table.printTable(1000);
	}
	
	
}
