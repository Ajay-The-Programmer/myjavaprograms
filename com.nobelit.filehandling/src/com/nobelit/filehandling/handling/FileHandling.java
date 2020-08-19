package com.nobelit.filehandling.handling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {//if you write throws then you not need to write catch blog bcz throws is handled exception
		FileReader src = null;
		FileWriter dest = null;

		try {
			src = new FileReader("/home/ajay/Dennis_Ritchie_2011.jpg");
			dest = new FileWriter("/home/ajay/image.jpg");//write 2byte at a time so image will incurrupt
			System.out.println("FIle Opened");
			int x;
			while ((x = src.read()) != -1) {

				dest.write(x);
			}

		} finally {

			if (src != null) {
				src.close();
				System.out.println("FileClose");
			}

		}

	}

}
