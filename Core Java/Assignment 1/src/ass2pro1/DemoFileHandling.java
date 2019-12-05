
package ass2pro1;

import java.io.*;

public class DemoFileHandling {
	public static void main(String args[]) {
		try {
			FileInputStream obj2 = new FileInputStream("/home/ajaydevkar/Core Java/Assignment 1/src/ass2pro1/ajay.txt");
			
			
			
			
			
			
			
			
			
			
			File obj=new File("/home/ajaydevkar/Core Java/Assignment 1/src/ass2pro1");
//			int data = obj.read();
			System.out.println(obj.canRead());
			System.out.println(obj.length()	);
			System.out.println(obj.exists());
			System.out.println(obj.getParent());
			System.out.println(obj.isFile());
			System.out.println(obj.isHidden());


			String[] dirContents = obj.list();

			for (String name : dirContents) {
				System.out.println(name);
			}
			File[] files = obj.listFiles();

			for(File f : files) {
				System.out.println(f.getAbsolutePath());}

//			System.out.println("data:" +(char)+ data);
//			obj.close();
		} catch (Exception e) {
			System.out.println("File not found");

		}

	}}
