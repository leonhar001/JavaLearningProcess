package layout;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;

public class TestFlowPane extends FlowPane{
	
	
	public void SquareAdder() {
		getChildren().add(new Square());
	}
	
	public TestFlowPane() {
		
		/*
		Square s1 = new Square();
		Square s2 = new Square();
		Square s3 = new Square();
		Square s4 = new Square();
		Square s5 = new Square();
		Square s6 = new Square();
		Square s7 = new Square();
		Square s8 = new Square();
		Square s9 = new Square();
		*/
		
		Button buttonAdd = new Button("Add");
		
		buttonAdd.setOnAction(e -> {
			SquareAdder();
			buttonAdd.disarm();
		});
		
		setVgap(15);
		setHgap(15);
		
		setPadding(new Insets(10));
		setOrientation(Orientation.HORIZONTAL);
		setAlignment(Pos.BOTTOM_CENTER);
		
		getChildren().add(buttonAdd);
		
		/*
		getChildren()
			.addAll(buttonAdd, s1, s2);*/
	}
}
