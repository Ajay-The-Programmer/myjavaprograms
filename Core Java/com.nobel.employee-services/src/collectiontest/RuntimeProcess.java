package collectiontest;
import java.util.HashMap;


public class RuntimeProcess {

	public static void main(String[] args) {
////		Map<String> map=new HashMap();
//		Map<Integer,String> map = new HashMap<>();
//		map.put(10,"Sunil");
//		map.put(11,"Anil");
//		map.put(12,"Shivansh");
		Runtime run=Runtime.getRuntime();
		int runtime=run.availableProcessors();
		System.out.println("proccesures"+runtime);
		System.out.println("FreeMomory"+run.freeMemory());
		System.out.println("TotalMemory"+run.totalMemory());
		System.out.println((run.totalMemory()-run.freeMemory()));
		System.out.println(run.version());
	
//		int runtime=run.
		
		try {
			System.out.println("Lunching programm.....");
			Process crome=run.exec("Chrome");
			crome.waitFor();

		
	}catch(Exception e) {
		e.printStackTrace();
	}

}}