package demonstrate;

public class consumer extends Thread {
	Warehouse warehouse;

	public consumer(Warehouse warehouse) {
		
		this.warehouse = warehouse;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		warehouse.get(10);
	}
	
	
	

}
