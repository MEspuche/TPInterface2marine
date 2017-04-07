package presentation;

	
	

import javax.swing.text.html.CSS;

import metier.Complexe;
import metier.Reel;
import service.ComplexeService;
import service.IComplexeService;
import service.IReelService;
import service.ReelService;

public class Lanceur {
	public static void main(String[] args) {

	IReelService rs = new ReelService();
	Reel x = new Reel (4);
	Reel y = new Reel (8);
	System.out.println(x);
	System.out.println(y);
	System.out.println(rs.addition(x, y));
	
	
	
	
	
	IComplexeService cs = new ComplexeService();
	Complexe c1 = new Complexe(5, 9);
	Complexe c2 = new Complexe(6,8);
	System.out.println("le complexe 1 est le suivant " +c1);
	System.out.println("le complexe 2 est le suivant " +c2);
	System.out.println("l'addition des deux complexes donne le complexe suivant " + cs.addition(c1, c2));
	System.out.println("la soustraction des deux complexes donne le complexe suivant "+ cs.soustraction(c1, c2));
	
	
	
	
}
}

