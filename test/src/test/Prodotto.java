package test;

public class Prodotto {
private String Descrizione;
private double prezzo;
private int quantita;

public Prodotto(String descrizione, double prezzo, int quantita) {
	super();
	Descrizione = descrizione;
	this.prezzo = prezzo;
	this.quantita = quantita;
}

public String getDescrizione() {
	return Descrizione;
}
public void setDescrizione(String descrizione) {
	Descrizione = descrizione;
}
public double getPrezzo() {
	return prezzo;
}
public void setPrezzo(double prezzo) {
	if (prezzo>0)
		this.prezzo = prezzo;
}
public int getQuantita() {
	if(quantita>0)
	return quantita;
}
public void setQuantita(int quantita) {
	this.quantita = quantita;
}

}
