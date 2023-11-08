package testthread.com;

public class ThreadClass extends Thread{
	
	public void run(){  
		   System.out.println("running thread name is:"+Thread.currentThread().getName());  
		   System.out.println("running thread priority is:"+Thread.currentThread().getPriority()); 
		  }  
	
	public static void main(String[] args) {
	
		ThreadClass t1 = new ThreadClass();
		Thread t11 =new Thread(t1);  
		
		ThreadClass t2 = new ThreadClass();
		Thread t21 =new Thread(t2);
		
		ThreadClass t3 = new ThreadClass();
		Thread t31 =new Thread(t3);
		
		ThreadClass t4 = new ThreadClass();
		Thread t41 =new Thread(t4);
		
		ThreadClass t5 = new ThreadClass();
		Thread t51 =new Thread(t5);
		
		t11.setPriority(MIN_PRIORITY);
		t21.setPriority(MAX_PRIORITY);
		t31.setPriority(NORM_PRIORITY);
		t41.setPriority(MAX_PRIORITY);
		t51.setPriority(MIN_PRIORITY);
		
		
		t11.setName("Thread1");
		t21.setName("Thread2");
		t31.setName("Thread3");
		t41.setName("Thread4");
		t51.setName("Thread5");
		
		t11.start();
		t21.start();
		t31.start();
		t41.start();
		t51.start();
		
		//t11.run();
		t11.start();
	}
}
