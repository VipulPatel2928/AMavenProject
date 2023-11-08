package testsynchronization.com;

class Table {
	void printTable(int n) {// method not synchronized
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

class MyThread1 extends Thread {
	Table t;

	MyThread1(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class MyThread2 extends Thread {
	Table t;

	MyThread2(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

public class WithoutSynchronization {
	public static void main(String[] args) {

		Table obj = new Table();// only one object
		
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		
		System.out.println("Start Method Start");
		t1.start();
		t2.start();
		//System.out.println("Run Method Start");
		
		//t1.run();
		//t2.run();
	}


}
