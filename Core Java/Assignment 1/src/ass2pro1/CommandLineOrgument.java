/*3.
Write a java program to accept two file names as command line arguments and copy the contains of first to 
second in such a manner the case of all alphabet is changed and digits are replaced by ‘*’. Display 
appropriate error message if the first file does not exist. (Use methods from Character class ) 
*/
package ass2pro1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CommandLineOrgument {
	public static void main(String args[]) {
		try(FileInputStream file=new FileInputStream(args[0]);
				FileOutputStream file1=new FileOutputStream(args[1]);){
			
			while((data=file.read())!=-1) {
				
			}
				
			
			
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
