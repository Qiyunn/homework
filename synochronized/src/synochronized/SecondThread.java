package synochronized;

public class SecondThread extends Thread{
     @Override
	public void run() {
		// TODO Auto-generated method stub
		table.printTable(100);
	}

	Table table;

	public SecondThread(Table table) {
		this.table = table;
	}
     
}
