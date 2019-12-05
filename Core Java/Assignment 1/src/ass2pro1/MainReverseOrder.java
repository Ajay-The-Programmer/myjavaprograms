//9.Write a program to display the contents of a file in the reverse order. 

package ass2pro1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class MainReverseOrder {


	public static void main(String[] args) throws IOException {
		File file = new File("/home/ajaydevkar/FileHandling/reverse.txt");
		

		try (FileReader file1 = new FileReader("/home/ajaydevkar/FileHandling/reverse.txt");){
		
			int data;
			
			int arr[] = new int[(int) file.length() * 2];
			for (int i = 0; (data = file1.read()) > -1; i++) {
				System.out.print((char)data);
				arr[i] = data;
			}
			
			int i = 0;
			for (i = (int)(file.length()); i > -1; i--) {

				System.out.print((char)arr[i]);
			}

		} catch (Exception e) {

			System.out.println(e.toString());
			
			{

			}
		}
	}
}
