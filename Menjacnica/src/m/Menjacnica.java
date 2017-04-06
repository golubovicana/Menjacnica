package m;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejs.interfejsZaMenjacnicu;
import valute.Valuta;

public class Menjacnica implements interfejsZaMenjacnicu{
	
	LinkedList<Valuta> kursnaLista = new LinkedList<Valuta>();
	
	public void dodajNoviKurs(GregorianCalendar datum, String naziv, String skraceniNaziv, double prodajni,
			double srednji, double kupovni) {
		Valuta v = new Valuta();
		v.setDatum(datum);
		v.setKupovni(kupovni);
		v.setNaziv(naziv);
		v.setProdajni(prodajni);
		v.setSkraceniNaziv(skraceniNaziv);
		v.setSrednji(srednji);
		
		if(kursnaLista.contains(v)) throw new RuntimeException("Vec postoji u listi");
		
		kursnaLista.add(v);
		
	}

	
	public void obrisiKurs(GregorianCalendar datum, String naziv) {
		for (int i = 0; i < kursnaLista.size(); i++) {
			if(kursnaLista.get(i).getDatum() == datum && kursnaLista.get(i).getNaziv().equals(naziv))
				kursnaLista.remove(i);
		}
		
	}

	
	public Valuta pronadjiKurs(GregorianCalendar datum, String naziv) {
		for (int i = 0; i < kursnaLista.size(); i++) {
			if(kursnaLista.get(i).getDatum() == datum && kursnaLista.get(i).getNaziv().equals(naziv))
				return kursnaLista.get(i);
		}
		return null;
	}
	
}
