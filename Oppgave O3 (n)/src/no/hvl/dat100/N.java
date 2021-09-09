package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class N {

	static int fakultetet(int n) {
		if (n == 0)
			return 1;
		else 
			return(n * fakultetet(n-1));
	}
	public static void main(String[] args) {
		
		int heltall, fact=1;
		heltall=Integer.parseInt(showInputDialog("gi et heltall: "));
		fact = fakultetet(heltall);
//		String N = showInputDialog("gi et heltall: ?");
//		int heltall = Integer.parseInt(N);
		
		System.out.println("Fakultetet av "+ heltall + " er " +fact);
		
//		(N-1)*N;
		
	}}
