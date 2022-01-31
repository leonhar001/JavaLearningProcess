package layout;


import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.TilePane;

public class TestTilePane extends TilePane{
	
	public TestTilePane() {
		
		List<Square> squares = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			squares.add(new Square(i*10));
		}
		
		setVgap(15);
		setHgap(15);
		setPadding(new Insets(10, 10, 10, 10));
		
		setOrientation(Orientation.HORIZONTAL);
		setTileAlignment(Pos.BOTTOM_CENTER);
		
		getChildren().addAll(squares);
	}
}
