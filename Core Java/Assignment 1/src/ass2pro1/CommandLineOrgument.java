/*3.
Write a java program to accept two file names as command line arguments and copy the contains of first to 
second in such a manner the case of all alphabet is changed and digits are replaced by ‘*’. Display 
appropriate error message if the first file does not exist. (Use methods from Character class ) 
*/
package ass2pro1;

import java.io.FileReader;
import java.io.FileWriter;

public class CommandLineOrgument {
	public static void main(String args[]) {
		
		
		
		try(FileReader file=new FileReader(args[0]);
				FileWriter file1=new FileWriter(args[1]);){
			
			int data;
			
			while((data=file.read())!=-1) {
				if(data>=65&&data<=90) {   
					
												//we take ASCII value between A to Z and then check condition and if condition is
					file1.write(data+32);		//true then increase there ASCII value by 32  and write it into 2nd file
				}
				else if(data>=97&&data<=122){
					file1.write(data-32);
					
				}
				else if(data>=48&&data<=57) {
					file1.write(42);			//ASCII value of * 
				}
			
				else if(data==32) {
					file1.write(32);			//ASCII value of space 
				}
			}
												
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

/***********************Input**********************************

						Ajay Devkar1312

/************************Output****************************************/

//						aJAY dEVKAR****
	
/**********************************************************************/




