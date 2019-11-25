package dec2018;

public class Test {

	public static void main(String[] args) {
		
		Hamn h1 = new Hamn();
		
		h1.setAdress("Hamngatan 1");
		h1.setNamn("Aqua");
		
		Batplats b1 = new Batplats();
		Batplats b2 = new Batplats();
		Batplats b3 = new Batplats();
		
		b1.setNr(1);
		b1.setHyra(12000);
		b1.setHamn(h1);
		b2.setNr(2);
		b2.setHyra(10000);
		b2.setHamn(h1);
		b3.setNr(3);
		b3.setHyra(8000);
		b3.setHamn(h1);
		
		Hyrestagare ht1 = new Hyrestagare();
		Hyrestagare ht2 = new Hyrestagare();
		Hyrestagare ht3 = new Hyrestagare();
		Hyrestagare ht4 = new Hyrestagare();
		Hyrestagare ht5 = new Hyrestagare();
		Hyrestagare ht6 = new Hyrestagare();
		
		ht1.setNr("h1");
		ht1.setNamn("mats");
		ht2.setNr("h2");
		ht2.setNamn("Viktoria");
		ht3.setNr("h3");
		ht3.setNamn("Anders");
		ht4.setNr("h4");
		ht4.setNamn("Anna");
		ht5.setNr("h5");
		ht5.setNamn("Eva");
		ht6.setNr("h6");
		ht6.setNamn("Sven");
		
		h1.laggTillBatplats(b1);
		h1.laggTillBatplats(b2);
		h1.laggTillBatplats(b3);
		
		b1.laggTillHyrestagare(ht1);
		b1.laggTillHyrestagare(ht2);
		b2.laggTillHyrestagare(ht3);
		b2.laggTillHyrestagare(ht4);
		b3.laggTillHyrestagare(ht5);
		b3.laggTillHyrestagare(ht6);
		
		ht1.setBatplats(b1);
		ht2.setBatplats(b1);
		ht3.setBatplats(b2);
		ht4.setBatplats(b2);
		ht5.setBatplats(b3);
		ht6.setBatplats(b3);
		
		System.out.println(h1.hittaHyrestagarensBatplats("h5"));
		
		for(Batplats tmpB : h1.getBatplatser()) {
			for(Hyrestagare tmpH : tmpB.getHyrestagare()) {
				System.out.println(tmpH.getNamn());
			}
		}
	}

}
