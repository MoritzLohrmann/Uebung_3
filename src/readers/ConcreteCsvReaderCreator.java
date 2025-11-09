package readers;

public class ConcreteCsvReaderCreator extends ReaderCreator {

	@Override
	public ReaderProduct factoryMethode() {
		// TODO Auto-generated method stub
		return new ConcreteCsvReaderProduct();
	}

}
