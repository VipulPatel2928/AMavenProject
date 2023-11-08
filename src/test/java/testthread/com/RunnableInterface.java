package testthread.com;

public class RunnableInterface implements Runnable{
	
	public void run(){  
		   System.out.println("running thread name is:"+Thread.currentThread().getName());  
		   System.out.println("running thread priority is:"+Thread.currentThread().getPriority()); 
		  }  
	
	public static void main(String[] args) {
	
		RunnableInterface t1 = new RunnableInterface();
		Thread t11 =new Thread(t1);  
		
		RunnableInterface t2 = new RunnableInterface();
		Thread t21 =new Thread(t2);
		
		RunnableInterface t3 = new RunnableInterface();
		Thread t31 =new Thread(t3);
		
		RunnableInterface t4 = new RunnableInterface();
		Thread t41 =new Thread(t4);
		
		RunnableInterface t5 = new RunnableInterface();
		Thread t51 =new Thread(t5);
		
		
		
		t11.setPriority(10);
		t21.setPriority(1);
		t31.setPriority(5);
		t41.setPriority(10);
		t51.setPriority(5);
		
		
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
	}
}
