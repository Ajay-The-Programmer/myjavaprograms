package ass2pro1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class MainReadWrite {

	public static void main(String[] args) {
		File file = new File("/home/ajaydevkar/FileHandling/reverse.txt");

		int data = ((int) file.length()) - 1;

		switch (data) {

		case 1:
			singleNo();
			System.out.println("\n\n***Operation succefully done  please go to your file and check ***");

			break;

		case 2:
			doubleNO();
			System.out.println("\n\n***Operation succefully done  please go to your file and check ***");

			break;
		case 3:
			thirdNo();
			System.out.println("\n\n***Operation succefully done  please go to your file and check ***");

			break;

		}
	}

	private static void singleNo() {
		try (FileReader file1 = new FileReader("/home/ajaydevkar/FileHandling/reverse.txt");
				FileWriter file2 = new FileWriter("/home/ajaydevkar/FileHandling/reverse1.txt");) {

		int data = file1.read();
		int data2 = Integer.parseInt(String.valueOf((char) data));

		System.out.println("\n****Your Number is One Digit*******");

		if (data2 == 1) {
			file2.write(" one");

		} else if (data2 == 2) {
			file2.write(" Two");
		} else if (data2 == 3) {
			file2.write(" Three");
		} else if (data2 == 4) {
			file2.write(" Four");

		} else if (data2 == 5) {
			file2.write(" Five");
		} else if (data2 == 6) {
			file2.write(" Six");

		} else if (data2 == 7) {
			file2.write(" Seven");
		} else if (data2 == 8) {
			file2.write(" Eight");
		} else if (data2 == 9) {
			file2.write(" Nine");
		}

	}catch(Exception e) {
		System.out.println(e.toString());
	}
}

	private static void doubleNO() {

		try (FileReader file1 = new FileReader("/home/ajaydevkar/FileHandling/reverse.txt");
				FileWriter file2 = new FileWriter("/home/ajaydevkar/FileHandling/reverse1.txt");) {
			int data, data2;

			data = file1.read();
			data2 = Integer.parseInt(String.valueOf((char) data));
			System.out.println("\n****Your Number is Two Digit*******");

			if (data2 == 1) {
				file2.write(" one");

			} else if (data2 == 2) {
				file2.write(" Twenty");
			} else if (data2 == 3) {
				file2.write(" Thirty");
			} else if (data2 == 4) {
				file2.write(" Fourty");

			} else if (data2 == 5) {
				file2.write(" Fifty");
			} else if (data2 == 6) {
				file2.write(" Sixty");

			} else if (data2 == 7) {
				file2.write(" Seventy");
			} else if (data2 == 8) {
				file2.write(" Eighty");
			} else if (data2 == 9) {
				file2.write(" Ninety");
			}

			data = file1.read();
			data2 = Integer.parseInt(String.valueOf((char) data));

			if (data2 == 1) {
				file2.write(" one");

			} else if (data2 == 2) {
				file2.write(" Two");
			} else if (data2 == 3) {
				file2.write(" Three");
			} else if (data2 == 4) {
				file2.write(" Four");

			} else if (data2 == 5) {
				file2.write(" Five");
			} else if (data2 == 6) {
				file2.write(" Six");

			} else if (data2 == 7) {
				file2.write(" Seven");
			} else if (data2 == 8) {
				file2.write(" Eight");
			} else if (data2 == 9) {
				file2.write(" Nine");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void thirdNo() {
		try (FileReader file1 = new FileReader("/home/ajaydevkar/FileHandling/reverse.txt");
				FileWriter file2 = new FileWriter("/home/ajaydevkar/FileHandling/reverse1.txt");) {
			int data = file1.read();
			int data2 = Integer.parseInt(String.valueOf((char) data));

			System.out.println("\n****Your Number is Three Digit*******");
			if (data2 == 1) {
				file2.write(" One Hundred");

			} else if (data2 == 2) {
				file2.write(" Two Hundred");
			} else if (data2 == 8) {
				file2.write(" Eight Hubdread");
			} else if (data2 == 8) {
				file2.write(" Eight Hubdread");
			} else if (data2 == 3) {
				file2.write(" Three Hunred");
			} else if (data2 == 4) {
				file2.write(" Four Hundred");

			} else if (data2 == 5) {
				file2.write(" Five Hundred");
			} else if (data2 == 6) {
				file2.write(" Six Hundred");

			} else if (data2 == 7) {
				file2.write(" Sever Hundred");
			} else if (data2 == 8) {
				file2.write(" Eight Hubdread");
			} else if (data2 == 9) {
				file2.write(" Nine Hubdread");
			}

			data = file1.read();
			data2 = Integer.parseInt(String.valueOf((char) data));

			if (data2 == 2) {
				file2.write(" one");

			} else if (data2 == 2) {
				file2.write(" Twenty");
			} else if (data2 == 3) {
				file2.write(" Thirty");
			} else if (data2 == 4) {
				file2.write(" Fourty");

			} else if (data2 == 5) {
				file2.write(" Fifty");
			} else if (data2 == 6) {
				file2.write(" Sixty");

			} else if (data2 == 7) {
				file2.write(" Seventy");
			} else if (data2 == 8) {
				file2.write(" Eighty");
			} else if (data2 == 9) {
				file2.write(" Ninety");
			}

			data = file1.read();
			data2 = Integer.parseInt(String.valueOf((char) data));

			if (data2 == 1) {
				file2.write(" one");

			} else if (data2 == 2) {
				file2.write(" Two");
			} else if (data2 == 3) {
				file2.write(" Three");
			} else if (data2 == 4) {
				file2.write(" Four");

			} else if (data2 == 5) {
				file2.write(" Five");
			} else if (data2 == 6) {
				file2.write(" Six");

			} else if (data2 == 7) {
				file2.write(" Seven");
			} else if (data2 == 8) {
				file2.write(" Eight");
			} else if (data2 == 9) {
				file2.write(" Nine");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
