package dec2018;

import java.util.ArrayList;

public class Hamn {

	private String adress;
	private String namn;
	private ArrayList<Batplats> batplatser = new ArrayList<Batplats>();
	
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getNamn() {
		return namn;
	}
	public void setNamn(String namn) {
		this.namn = namn;
	}
	public ArrayList<Batplats> getBatplatser() {
		return batplatser;
	}
	public void setBatplatser(ArrayList<Batplats> batplatser) {
		this.batplatser = batplatser;
	}
	public void laggTillBatplats(Batplats p) {
		batplatser.add(p);
	}
	public Batplats hittaBatplats(int nr) {
		for(Batplats tmp : batplatser) {
			if(tmp.getNr() == nr) {
				return tmp;
			}
		}
		return null;
	}
	public void laggTillHyrestagare(Hyrestagare h, int nr) { 
		Batplats tmpB = hittaBatplats(nr);
		
		if(tmpB != null) {
			tmpB.laggTillHyrestagare(h);
			h.setBatplats(tmpB);
		}
	}
	public int hittaHyrestagarensBatplats(String hyrestagarenr) {
		for(Batplats tmpB : batplatser) {
			if(tmpB.hittaHyrestagare(hyrestagarenr) != null) {
				return tmpB.getNr();
			}
		}
		return 0;
	}
}
