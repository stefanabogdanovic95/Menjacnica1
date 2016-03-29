package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

private LinkedList<Valuta> valute = new LinkedList<>();
	
	@Override
	public void dodajKursValute(Valuta valuta, double prodajni, double kupovni, double srednji, GregorianCalendar datum) {
		
		Kurs kurs = new Kurs();
		kurs.setDatum(datum);
		kurs.setKupovniKurs(kupovni);
		kurs.setProdajniKurs(prodajni);
		kurs.setSrednjiKurs(srednji);
		
		for (int i = 0; i < valute.size(); i++) {
			
			if (valute.get(i).equals(valuta)) {

					valute.get(i).getKursevi().add(kurs);
					break;
				}
			

			}

			


	}

	@Override
	public void obrisiKursValute(Valuta valuta, GregorianCalendar datum) {
		for (int i = 0; i < valute.size(); i++) {
			
			if (valute.get(i).equals(valuta)) {
				
				for (int j = 0; j < valute.get(i).getKursevi().size(); j++) {
					
					if (valute.get(i).getKursevi().get(j).getDatum().equals(datum)) {
						valute.get(i).getKursevi().remove(j);
					}
				}
			}
		}
	}

	@Override
	public Kurs vratiKursValute(Valuta valuta, GregorianCalendar datum) {
		for (int i = 0; i < valute.size(); i++) {
			
			if (valute.get(i).equals(valuta)) {
				
				for (int j = 0; j < valute.get(i).getKursevi().size(); j++) {
					
					if (valute.get(i).getKursevi().get(j).getDatum().equals(datum)) {
						valute.get(i).getKursevi().get(j);					}
				}
			}
		}
		
		return null;
	}


}
