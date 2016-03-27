package menjacnica.interfejs;
import java.util.GregorianCalendar;

import menjacnica.*;

public interface MenjacnicaInterfejs {
	public void dodajKursValute(Valuta valuta, double prodajniKurs, double kupovniKurs, 
			double srednjiKurs, GregorianCalendar datum);
	public void obrisiKursValute(Valuta valuta, GregorianCalendar datum);
	public Kurs vratiKursValute(Valuta valuta, GregorianCalendar datum );



}
