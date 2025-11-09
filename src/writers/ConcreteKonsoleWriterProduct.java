package writers;

import java.io.IOException;

import business.Artikel;

public class ConcreteKonsoleWriterProduct extends WriterProduct {

	@Override
	public void schreibeArtikel(int anzahlArtikel, Artikel[] artikel) throws IOException {
		System.out.println(anzahlArtikel + "");
		System.out.println();
		for(int i = 0; i < anzahlArtikel; i++) {
			System.out.println("Artikelnummer: "+artikel[i].getArtikelnummer() + "");
			System.out.println("Artikelname:   "+artikel[i].getArtikelname());
			System.out.println("Basispreis:    "+artikel[i].getBasispreis() + "");
			System.out.println("");
		}
	}

}
