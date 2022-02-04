package stringstringbufferstringbuilder;

public class StringBufferDemo {

	public static void main(String args[]) {
		String str1 = "";
		str1 = str1 + "welcome";
		str1 = str1 + " xyz";
		System.out.println("String: " + str1);
		
		StringBuffer sb1 = new StringBuffer();
		sb1.append("hello");
		sb1.append(" abc");
		System.out.println("String buffer: " + sb1);
		
		// explore minimum 10 methods for string
		// explore minuimum 5 methods for StringBuffer
	
		// String to primitive data types
		String data1 = "45.67";
		double data2 = Double.parseDouble(data1);
		System.out.println(++data2);
		
		String data3 = "80";
		int data4 = Integer.parseInt(data3);
		
		// primitive types to String
		int data5 = 89;
		String data6 = data5 + "";
		
		
		
		
		
	}
}
