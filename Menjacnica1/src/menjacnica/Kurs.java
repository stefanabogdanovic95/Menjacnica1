package menjacnica;

import java.util.GregorianCalendar;

	public class Kurs {
		private GregorianCalendar datum;
		private String prodajniKurs;
		private String kupovniKurs;
		private String srednjiKurs;
		public GregorianCalendar getDatum() {
			return datum;
		}
		public void setDatum(GregorianCalendar datum) {
			this.datum = datum;
		}
		public String getProdajniKurs() {
			return prodajniKurs;
		}
		public void setProdajniKurs(String prodajniKurs) {
			this.prodajniKurs = prodajniKurs;
		}
		public String getKupovniKurs() {
			return kupovniKurs;
		}
		public void setKupovniKurs(String kupovniKurs) {
			this.kupovniKurs = kupovniKurs;
		}
		public String getSrednjiKurs() {
			return srednjiKurs;
		}
		public void setSrednjiKurs(String srednjiKurs) {
			this.srednjiKurs = srednjiKurs;
		}

}
