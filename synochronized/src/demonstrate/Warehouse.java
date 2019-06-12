package demonstrate;

public class Warehouse {
	int amount=0;
	public synchronized void put(int i) {
        System.out.println("you are going to put");
		amount=amount+i;
		System.out.println("put is done");
		notify();
	}
	public synchronized void get(int j) {
		System.out.println("you are going to get");
		while(j>amount) {
			System.out.println("not enough");
			try{wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		amount=amount-j;
		System.out.println("get is executed");
		
	}

}
