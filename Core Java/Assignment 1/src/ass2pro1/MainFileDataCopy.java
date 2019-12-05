// pro5- Accept the names of three files and copy the contents of the first two to the third

package ass2pro1;

import java.io.FileReader;
import java.io.FileWriter;


public class MainFileDataCopy {
	public static void copyFile(String srcFile1,String srcFile2,String destFile) {


		FileReader file1=null;
		FileReader file2=null;
		FileWriter file3=null;
		
		try { 
				file1=new FileReader(srcFile1);
				file2=new FileReader(srcFile2);
				file3=new FileWriter(destFile);
			
			
				int data;
			
				while((data=file1.read())!=-1||(data=file2.read())!=-1) {
				file3.write(data);}
				
//			}while((data=file2.read())!=-1) {
//				file3.write(data);
//				
//			}
		}catch(Exception e) {
			System.out.println(e.toString());
			
		}finally {
			try {
				if(file1!=null) {
					file1.close();
				}
				if(file2!=null) {
					file2.close();
				}
				 if(file3!=null) {
					file3.close();
				}
			}catch(Exception e) {
				System.out.println(e.toString());
			}
		}

	}		public static void main(String[] args) {
			
			copyFile("/home/ajaydevkar/FileHandling/Stud.dat","/home/ajaydevkar/FileHandling/Clg.txt","/home/ajaydevkar/FileHandling/SCinfo.txt");
			System.out.println("...............File Copied succesfull.............");
}}


