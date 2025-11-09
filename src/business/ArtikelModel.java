package business;

import java.io.*;

import readers.ConcreteCsvReaderCreator;
import readers.ReaderCreator;
import readers.ReaderProduct;
//import writers.ConcreteKonsoleWriterCreater;
//import writers.ConcreteTxtWriterCreator;
import writers.ConcreteWriterCreator;
import writers.WriterCreator;
import writers.WriterProduct;

public class ArtikelModel {
	
	private Artikel[] artikel = new Artikel[100];
	private int anzahlArtikel;
	
	public int getAnzahlArtikel() {
		return anzahlArtikel;
	}

	public void setAnzahlArtikel(int anzahlArtikel) {
		this.anzahlArtikel = anzahlArtikel;
	}

	public void leseArtikelAusCsvDatei()throws IOException{
		ReaderCreator readercreator = new ConcreteCsvReaderCreator();
		ReaderProduct reader = readercreator.factoryMethode();
		this.setAnzahlArtikel(reader.leseAnzahlArtikel());
		this.artikel = reader.leseArtikel();
		
	}
/*
	public void schreibeArtikelInKonsole()throws IOException{
		WriterCreator ritercreator = new ConcreteKonsoleWriterCreater();
		WriterProduct riter = ritercreator.factoryMethode();
		riter.schreibeArtikel(this.anzahlArtikel, this.artikel);
	}
	
	public void schreibeArtikelInTxtDatei()throws IOException{
	WriterCreator writercreator = new ConcreteTxtWriterCreator();
	WriterProduct writer = writercreator.factoryMethode();
	writer.schreibeArtikel(this.anzahlArtikel, this.artikel);
	
	}
	*/
	public void schreibeArtikelInDatei() throws IOException {
		System.out.println("Das ist die Ausgabe mit den 2");
		WriterCreator writercreator = new ConcreteWriterCreator();
		WriterProduct writer = writercreator.factoryMethode("txt");
		writer.schreibeArtikel(this.anzahlArtikel, this.artikel);
		
		WriterProduct writer1 = writercreator.factoryMethode("Konsole");
		writer1.schreibeArtikel(this.anzahlArtikel, this.artikel);
	}

}

