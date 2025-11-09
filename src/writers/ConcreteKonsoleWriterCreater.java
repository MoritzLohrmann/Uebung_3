package writers;

public class ConcreteKonsoleWriterCreater extends WriterCreator {

	@Override
	public WriterProduct factoryMethode() {
		// TODO Auto-generated method stub
		return new ConcreteKonsoleWriterProduct();
	}

}
