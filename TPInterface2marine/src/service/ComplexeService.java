package service;

import metier.Complexe;

public class ComplexeService implements IComplexeService {

	
	
	@Override
	public Complexe addition(Complexe x, Complexe y) {
		double iIM= x.getIm()+y.getIm();
		double iRe= x.getRe()+y.getRe();
		Complexe i = new Complexe ();
		i.setIm(iIM);
		i.setRe(iRe);
		return i;
	
	}

	@Override
	public Complexe soustraction(Complexe x, Complexe y) {
		double iIM= x.getIm()-y.getIm();
		double iRe= x.getRe()-y.getRe();
		Complexe i = new Complexe ();
		i.setIm(iIM);
		i.setRe(iRe);
		return i;
	}

}



