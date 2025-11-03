package business;

import java.io.*;

import readers.ConcreteCsvReaderProduct;
import writers.ConcreteTxtWriterProduct;

public class ArtikelModel {
	
	private writers
	public Artikel[]artikel;
	public ArtikelModel(Artikel[] artikel) {
		super();
		this.artikel = new Artikel[100];
	}

	private int anzahlArtikel;
	private ConcreteTxtWriterProduct a =new ConcreteTxtWriterProduct();
	private ConcreteCsvReaderProduct b =new ConcreteCsvReaderProduct();

	public int getAnzahlArtikel() {
		return anzahlArtikel;
	}

	public void setAnzahlArtikel(int anzahlArtikel) {
		this.anzahlArtikel = anzahlArtikel;
	}

	public void leseArtikelAusCsvDatei() throws IOException{
		b.leseArtikelAusCsvDatei(artikel);
	}
	
	public void schreibeArtikelInTxtDatei() throws IOException{
		a.schreibeArtikel(anzahlArtikel, artikel);
		
	}

}
