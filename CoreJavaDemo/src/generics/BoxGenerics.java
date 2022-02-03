package generics;

public class BoxGenerics<T, K> {

	private T length;
	private T width;
	private T height;
	private K rate;
	private String boxColor;
	
	public BoxGenerics(T length, T width, T height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public BoxGenerics(T length, T width, T height, K rate, String boxColor) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
		this.rate = rate;
		this.boxColor = boxColor;
	}

	public T getLength() {
		return length;
	}

	public void setLength(T length) {
		this.length = length;
	}

	public T getWidth() {
		return width;
	}

	public void setWidth(T width) {
		this.width = width;
	}

	public T getHeight() {
		return height;
	}

	public void setHeight(T height) {
		this.height = height;
	}

	public K getRate() {
		return rate;
	}

	public void setRate(K rate) {
		this.rate = rate;
	}

	public String getBoxColor() {
		return boxColor;
	}

	public void setBoxColor(String boxColor) {
		this.boxColor = boxColor;
	}
	
	
}
