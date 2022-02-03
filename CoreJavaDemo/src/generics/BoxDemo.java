package generics;

public class BoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box1 = new Box(20, 10, 20);
		
		BoxGenerics<Float, Double> box2 = new BoxGenerics<Float, Double>(20.5f, 10.5f, 5.5f);
	
		BoxGenerics<Integer, Double> box3 = new BoxGenerics<Integer, Double>(50,  30,  20);
		
		BoxGenerics<Integer, Double> box4 = new BoxGenerics<>(50,  30,  20);
		
	}

}
// generics is available from java 1.8
// autoboxing - from java 1.8

// byte       Byte
// short      Short
// int        Integer
// long       Long

// float	Float
// double	Double

// boolean	Boolean

// char		Character