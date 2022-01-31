package layout;

import javafx.scene.layout.BorderPane;

public class TestBorderPane extends BorderPane{
	
	public TestBorderPane() {
		
		Box s1 = new Box().withText("TOP");
		setTop(s1);
		
		Box s2 = new Box().withText("LEFT");
		setLeft(s2);
		
		Box s3 = new Box().withText("RIGHT");
		setRight(s3);
		
		Box s4 = new Box().withText("BOTTOM");
		setBottom(s4);
		
		Box s5 = new Box().withText("CENTER");
		setCenter(s5);
		
	}
}
