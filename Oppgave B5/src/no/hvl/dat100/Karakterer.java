package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class Karakterer {

	public static void main(String[] args) {
	
		
		for(int elevnr=1; elevnr <=10; elevnr++){
	
		String karakter = showInputDialog("Din Poengsum: ?");
	int poengsum = Integer.parseInt(karakter);
	
	if (poengsum <=0 || poengsum >100) {
		showMessageDialog(null, "poengsum ikke gyldig");
	}
	else if (poengsum >=0 && poengsum <=39) {
		showMessageDialog(null, "Karakter F");
	}
	else if (poengsum >=40 && poengsum <=49) {
		showMessageDialog(null, "Karakter E");
	}
	else if (poengsum >=50 && poengsum <=59) {
		showMessageDialog(null, "Karakter D");
	}
	else if (poengsum >=60 && poengsum <=79) {
		showMessageDialog(null, "Karakter C");
	}
	else if (poengsum >=80 && poengsum <=89) {
		showMessageDialog(null, "Karakter B");
	}
	else if (poengsum >=90 && poengsum <=100) {
		showMessageDialog(null, "Karakter A");
	}
	

	}

}}

