package menjacnica.interfejs;

import java.util.GregorianCalendar;

import menjacnica.Kurs;
import menjacnica.Valuta;

public interface MenjacnicaInterfejs {

	public void dodajKursValute (Valuta v, double prodajniKurs, double kupovniKurs, 
			double srednjiKurs, GregorianCalendar datum);
	public void obrisiKursValute (Valuta v, GregorianCalendar datum);
	public Kurs pronadjiKurs (Valuta v, GregorianCalendar datum);
}
