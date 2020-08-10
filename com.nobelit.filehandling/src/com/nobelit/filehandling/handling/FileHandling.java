package com.nobelit.filehandling.handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		FileInputStream src = null;
		FileOutputStream dest = null;

		try {
			src = new FileInputStream("/home/ajay/Dennis_Ritchie_2011.jpg");
			dest = new FileOutputStream("/home/ajay/image.jpg");
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
