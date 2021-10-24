package generics;

public class ObjectBox {
	
	private Object thing;
	
	public void keep (Object thing) {
		this.thing = thing;
	}
	
	public Object open () {
		return thing;
	}
}
