package synochronized;

public class Table {
	public void printTable(int a) {
		for (int i=1; i<6; i++ ) {
		System.out.println(a*i);
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}
	
  
}
