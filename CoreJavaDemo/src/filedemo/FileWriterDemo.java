package filedemo;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("Output.txt");
			
			fw.write("Hi this is writtern into the file through java program.");
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
