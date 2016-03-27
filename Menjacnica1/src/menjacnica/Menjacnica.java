package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {
	LinkedList<Valuta> valute = new LinkedList<>();

	@Override
	public void dodajKursValute(Valuta valuta, double prodajniKurs, double kupovniKurs, double srednjiKurs,
			GregorianCalendar datum) {
		Kurs k = new Kurs();
		k.setDatum(datum);
		k.setKupovniKurs(kupovniKurs);
		k.setProdajniKurs(prodajniKurs);
		k.setSrednjiKurs(srednjiKurs);
		
		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).equals(valuta)){
				valute.get(i).getKursevi().add(k);
				break;
			}
		}

	}

	@Override
	public void obrisiKursValute(Valuta valuta, GregorianCalendar datum) {
		for (int i = 0; i < valute.size(); i++) {
			
			if (valute.get(i).equals(valuta)){
				
				for (int j = 0; j < valuta.getKursevi().size(); j++) {
					if (valuta.getKursevi().get(i).getDatum().equals(datum)){
						valuta.getKursevi().remove(j);
					}
				}
				
			}
		}

	}

	@Override
	public Kurs vratiKursValute(Valuta valuta, GregorianCalendar datum) {
		for (int i = 0; i < valute.size(); i++) {
			
			if (valute.get(i).equals(valuta)){
				
				for (int j = 0; j < valute.get(i).getKursevi().size(); j++) {
					
					if (valute.get(i).getKursevi().get(j).getDatum().equals(datum)){
						return valute.get(i).getKursevi().get(j);
					}
				}
			}
		}
		return null;
	}

}
