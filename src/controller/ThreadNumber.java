package controller;

// 1) Fazer uma aplicação que rode 5 Threads que
// cada uma delas imprima no console o seu
// número.
public class ThreadNumber extends Thread {
	
	private int Threadnum;
	
    public  ThreadNumber(int Threadnum) {
   	 this.Threadnum = Threadnum;
    }

	@Override
	public void run() {
		System.out.println(getId());
	}
}
