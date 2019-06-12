package demonstrate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Warehouse wh=new Warehouse();
		producer p=new producer(wh);
		p.start();
		consumer c=new consumer(wh);
		c.start();
		consumer c1=new consumer(wh);
		c1.start();

	}

}
