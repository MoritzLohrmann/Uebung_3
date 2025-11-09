package writers;

public class ConcreteWriterCreator extends WriterCreator{

	@Override
	public WriterProduct factoryMethode(String type) {
		if("txt".equals(type)) {
			return new ConcreteTxtWriterProduct();
		}else {
			return new ConcreteKonsoleWriterProduct();
		}
		
	}

}
