package no.hvl.dat100.varelager;

public class TVarelager extends Varelager {

	public TVarelager(int n) {
		super(n);
	}
	
	public int getAntall () {
		return this.antall;
	}
	
	public Vare[] getTVarer () {
		return this.varer;
	}
}
