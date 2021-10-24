package generics;

public class Box<T> {
	
	private T thing;
	
	public void keep (T thing) {
		this.thing = thing;
	}
	
	public T open () {
		return thing;
	}
}
