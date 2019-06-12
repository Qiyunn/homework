package synochronized;

public class FirstThread extends Thread{
     Table table;
 	public FirstThread(Table table) {
		super();
		this.table = table;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println();
		table.printTable(10);
		
	}


     
	
}
