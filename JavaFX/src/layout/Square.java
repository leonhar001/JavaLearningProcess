package layout;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Square extends Rectangle {
private static int i = 0;
	
	/*String array to use on squares*/
	private String[] colors = {
			"black", "grey", "purple",
			"red", "pink", "blue"
	};
	
	public Square() {
		this(100);
	}
	
	public Square(int size) {
		
		setWidth(size);
		setHeight(size);
		
		setFill(Color.web(colors[i++]));
		
		if(colors.length == i) i=0;
	}
}
