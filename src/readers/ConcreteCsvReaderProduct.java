package readers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import business.Artikel;

public class ConcreteCsvReaderProduct extends ReaderCreator{
	public void leseArtikelAusCsvDatei(Artikel[] artikel) throws IOException{
		BufferedReader ein = new BufferedReader(new FileReader("Artikel.csv"));
		int anzahlArtikel=Integer.parseInt(ein.readLine());
		String[] zeile = null;
		for(int i = 0; i < anzahlArtikel; i++) {
			zeile = ein.readLine().split(";");
			artikel[i] = new Artikel(
			Integer.parseInt(zeile[0]), zeile[1],
			Double.parseDouble(zeile[2]));
	}    
    ein.close();
	
	}

	
	
}
