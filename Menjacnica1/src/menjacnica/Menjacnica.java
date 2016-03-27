package menjacnica;

import java.util.GregorianCalendar;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	@Override
	public void dodajKursValute(Valuta valuta, double prodajniKurs, double kupovniKurs, double srednjiKurs,
			GregorianCalendar datum) {

	}

	@Override
	public void obrisiKursValute(Valuta valuta, GregorianCalendar datum) {

	}

	@Override
	public Kurs vratiKursValute(Valuta valuta, GregorianCalendar datum) {
		return null;
	}

}
