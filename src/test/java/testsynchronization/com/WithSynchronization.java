package testsynchronization.com;

class TableVP {
	synchronized void printTable(int n) {// method synchronized
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}

class MyThreadVP extends Thread {
	TableVP t;

	MyThreadVP(TableVP t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class MyThreadVP1 extends Thread {
	TableVP t;

	MyThreadVP1(TableVP t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

public class WithSynchronization {
	public static void main(String[] args) {

		TableVP obj = new TableVP();// only one object
		
		MyThreadVP t1 = new MyThreadVP(obj);
		MyThreadVP1 t2 = new MyThreadVP1(obj);
		
		System.out.println("Start Method Start");
		
		
		t1.start();
		t2.start();
		//System.out.println("Run Method Start");
		
		//t1.run();
		//t2.run();
	}


}
