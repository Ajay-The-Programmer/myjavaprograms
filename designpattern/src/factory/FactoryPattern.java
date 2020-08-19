package factory;

public class FactoryPattern {
	
	
	private FactoryPattern() {
		
	//logic
		
	}
	
	public static FactoryPattern getObject() {
		
		FactoryPattern objF=new FactoryPattern(); 
		
		return objF; 		
	}

}
