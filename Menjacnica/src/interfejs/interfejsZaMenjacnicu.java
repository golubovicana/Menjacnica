package interfejs;

import java.util.GregorianCalendar;
import valute.Valuta;

public interface interfejsZaMenjacnicu {
	public void dodajNoviKurs(GregorianCalendar datum, String naziv, String skraceniNaziv, double prodajni, double srednji, double kupovni);
	public void obrisiKurs(GregorianCalendar datum,String naziv);
	public Valuta pronadjiKurs(GregorianCalendar datum, String naziv);
}
