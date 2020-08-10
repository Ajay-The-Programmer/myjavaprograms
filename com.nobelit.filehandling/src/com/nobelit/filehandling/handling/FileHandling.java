package com.nobelit.filehandling.handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileHandling {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream file = null;
		file = new FileInputStream("/home/ajay/myjavaprograms/com.nobelit.filehandling/src/com/nobelit/filehandling/handling/FileHandling.java");
		if (file != null) {
			System.out.println("FileFound");
		}

	}

}
