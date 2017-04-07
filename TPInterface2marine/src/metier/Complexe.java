package metier;

public class Complexe {

	private double im;
	private double re;
	
	
	public Complexe(double im, double re) {
		super();
		this.im = im;
		this.re = re;
	}
	
	
	public Complexe() {
		super();
	}


	public double getIm() {
		return im;
	}
	public void setIm(double im) {
		this.im = im;
	}
	public double getRe() {
		return re;
	}
	public void setRe(double re) {
		this.re = re;
	}
	@Override
	public String toString() {
		return "Complexe [im=" + im + ", re=" + re + "]";
	}
	
	
}
