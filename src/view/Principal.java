package view;

import controller.ThreadNumber;

public class Principal {



	public static void main(String[] args) {
		//1) Fazer uma aplicação que rode 5 Threads que
		//cada uma delas imprima no console o seu
		//número. 

		for(int Threadnum = 0; Threadnum < 5; Threadnum++) {
			Thread threadn = new ThreadNumber(Threadnum);
			threadn.start();
	}

}
}

