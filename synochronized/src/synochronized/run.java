package synochronized;

public class run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Table table=new Table();
        FirstThread firstthread=new FirstThread(table);
        firstthread.start();
        SecondThread secondthread=new SecondThread(table);
        secondthread.start();
        
        ThirdThread thirdthread=new ThirdThread(table);
        thirdthread.start();
	}

}
