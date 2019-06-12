package demonstrate;

public class producer extends Thread {
	Warehouse warehouse;

	public producer(Warehouse warehouse) {
		
		this.warehouse = warehouse;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		warehouse.put(8);
	}
	
	
	

}
