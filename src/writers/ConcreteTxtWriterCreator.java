package writers;

public class ConcreteTxtWriterCreator extends WriterCreator {

	@Override
	public WriterProduct factoryMethode() {
		return new ConcreteTxtWriterProduct();
	}

}
