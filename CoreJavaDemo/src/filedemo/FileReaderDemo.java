package filedemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("Data.txt");
			int singleData = 0;
			
			while((singleData = fr.read()) != -1){
				System.out.print((char)singleData);	
			}
	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
