package iotesting;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example1 {
	public static void main(String[] args) {
		String filePathInput = System.getProperty("user.dir") + "\\testData\\text.txt";
 
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(filePathInput));
			String line;
			while((line = br.readLine())!=null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
