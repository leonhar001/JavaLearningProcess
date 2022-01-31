package layout;

import javafx.geometry.Pos;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class TestAnchorPane extends AnchorPane{
	
	public TestAnchorPane() {
		
		Square s1 = new Square();
		setTopAnchor(s1, 55.0);
		setLeftAnchor(s1, 55.0); 		
		
		Square s2 = new Square();
		setTopAnchor(s2, 55.0); /*10px to top*/
		setRightAnchor(s2, 55.0); /*10px to rigth*/
		
		Square s3 = new Square();
		setBottomAnchor(s3, 55.0);
		setLeftAnchor(s3, 55.0); 
		
		Square s4 = new Square();
		setBottomAnchor(s4, 55.0); 
		setRightAnchor(s4, 55.0); 
		
		HBox center = new HBox();
		center.setAlignment(Pos.CENTER);
		setTopAnchor(center, 110.0);
		setBottomAnchor(center, 110.0);
		setRightAnchor(center, 110.0);
		setLeftAnchor(center, 110.0);
		
		Square s5 = new Square();
		center.getChildren().add(s5);
		
		getChildren().addAll(s1, s2, s3, s4, center);
	}
	

}
