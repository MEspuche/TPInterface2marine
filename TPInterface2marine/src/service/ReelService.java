package service;

import metier.Reel;

public class ReelService implements IReelService {

	@Override
	public Reel addition(Reel x, Reel y) {
		Reel i= new Reel( x.getX()+y.getX());
		return i;
	}

	@Override
	public Reel soustraction(Reel x, Reel y) {
		Reel i= new Reel(x.getX()-y.getX());
		return i;
	}

}
