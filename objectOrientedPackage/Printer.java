package objectOrientedPackage;

public class Printer {
	/**
	 * text 
	 * text and color
	 *  File name and file type(pdf or not) 
	 *  text, copies
	 * 
	 * @return
	 * 
	 */

	public void print(String text) {
		System.out.println("Printer Text: " + text);
	}

	public void print(String text, String color) {
		System.out.println("Printer Text and Color: " + text + " " + color);
	}

	public void print(String fileName, boolean isItPdf) {
		if(isItPdf==true) {
			System.out.println("Printer FileName: " + fileName + "\nFile Type is PDF as it is "+isItPdf);
		}else {
			System.out.println("Printer FileName: " + fileName + "\nFile Type is not PDF as it is " + isItPdf);
		}
		
	}
	
	public void print(String text, int numOfCopies) {
		System.out.println("Printer Text: " + text + "\nNo.Of Copies: "+ numOfCopies);
	}

}
