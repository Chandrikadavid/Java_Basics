package inputOutputFw;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputEx {
	public static void main(String[] args) {
		FileInputStream fis;
		FileOutputStream fos;
		try {
			String filePathInput = System.getProperty("user.dir") + "\\src\\testData\\text.txt";
			String filePathOutput = System.getProperty("user.dir") + "\\src\\testData\\outText.txt";
			fis = new FileInputStream(filePathInput);
			fos = new FileOutputStream(filePathOutput);

			int i = fis.read();
			while(i!= -1) {
				System.out.println((char)i);
				i = fis.read();
				fos.write(i);
			}
			fis.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
