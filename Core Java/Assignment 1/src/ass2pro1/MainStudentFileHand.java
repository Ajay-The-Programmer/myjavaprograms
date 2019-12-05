//1. Write a program to read student information as rollno, name, class and percentage and 
//store it in a file stud.dat, Display the details of the student having a given rollno.
package ass2pro1;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
public class MainStudentFileHand {
	public static void main(String args[])
		throws IOException{
	
	
			
			FileWriter wrt= new FileWriter("/home/ajaydevkar/stude.dat");
			wrt.write("Student Information\nname-Ajay Subhash Devkar\nRollNo-60\nClass-MBA\nPercentage-68%");
			wrt.close();
			
			FileReader robj=new FileReader("/home/ajaydevkar/stude.dat");
		
			int data;
			while((data=robj.read())!=-1) {
				System.out.print((char)data);
			}
			robj.close();
//			
//		}catch(Exception e) {
//				System.out.println(e.toString());
//		}
}
}