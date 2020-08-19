package singlton;

public class SingletonPattern {
	
	private static SingletonPattern obj = new SingletonPattern();
	
	private SingletonPattern() {
		
		//logic 
		
	}
	public static SingletonPattern getObject() {
		
		return SingletonPattern.obj;
		
	}

}
