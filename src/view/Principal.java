package view;

import controller.ThreadNumber;

public class Principal {

	public static void main(String[] args) {
		
		for(int Threadnum = 0; Threadnum < 5; Threadnum++) {
			Thread threadn = new ThreadNumber(Threadnum);
			threadn.start();
	}

}
}

