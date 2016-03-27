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
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((datum == null) ? 0 : datum.hashCode());
			result = prime * result + ((kupovniKurs == null) ? 0 : kupovniKurs.hashCode());
			result = prime * result + ((prodajniKurs == null) ? 0 : prodajniKurs.hashCode());
			result = prime * result + ((srednjiKurs == null) ? 0 : srednjiKurs.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Kurs other = (Kurs) obj;
			if (datum == null) {
				if (other.datum != null)
					return false;
			} else if (!datum.equals(other.datum))
				return false;
			if (kupovniKurs == null) {
				if (other.kupovniKurs != null)
					return false;
			} else if (!kupovniKurs.equals(other.kupovniKurs))
				return false;
			if (prodajniKurs == null) {
				if (other.prodajniKurs != null)
					return false;
			} else if (!prodajniKurs.equals(other.prodajniKurs))
				return false;
			if (srednjiKurs == null) {
				if (other.srednjiKurs != null)
					return false;
			} else if (!srednjiKurs.equals(other.srednjiKurs))
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "Kurs [datum=" + datum + ", prodajniKurs=" + prodajniKurs + ", kupovniKurs=" + kupovniKurs
					+ ", srednjiKurs=" + srednjiKurs + "]";
		}
		

}
