package com.nobelit.filehandling.handling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		FileInputStream obj = null;

		try {
			obj = new FileInputStream(
					"/home/ajay/myjavaprograms/com.nobelit.filehandling/src/com/nobelit/filehandling/handling/FileHandling.java");
			System.out.println("FIle Opened");
			
			int x;
			while ((x=obj.read())!=-1) {

				System.out.print((char)x);

			}

		} finally {

			if (obj != null) {
				obj.close();
				System.out.println("FileClose");
			}

		}

	}

}
