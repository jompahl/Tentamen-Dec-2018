package dec2018;

import java.util.ArrayList;

public class Batplats {

	private int nr;
	private double hyra;
	private ArrayList<Hyrestagare> hyrestagare = new ArrayList<Hyrestagare>();
	private Hamn hamn;
	
	public int getNr() {
		return nr;
	}
	public void setNr(int nr) {
		this.nr = nr;
	}
	public double getHyra() {
		return hyra;
	}
	public void setHyra(double hyra) {
		this.hyra = hyra;
	}
	public ArrayList<Hyrestagare> getHyrestagare() {
		return hyrestagare;
	}
	public void setHyrestagare(ArrayList<Hyrestagare> hyrestagare) {
		this.hyrestagare = hyrestagare;
	}
	public Hamn getHamn() {
		return hamn;
	}
	public void setHamn(Hamn hamn) {
		this.hamn = hamn;
	}
	public void laggTillHyrestagare(Hyrestagare h) {
		hyrestagare.add(h);
	}
	public Hyrestagare hittaHyrestagare(String nr) {
		for(Hyrestagare tmp : hyrestagare) {
			if(tmp.getNr().equals(nr)) {
				return tmp;
			}
		}
		return null;
	}
}
