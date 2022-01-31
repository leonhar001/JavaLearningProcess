package layout;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Box extends HBox{

	private static int i = 0;
	
	/*String array to use on squares*/
	private String[] colors = {
			"black", "grey", "purple",
			"red", "pink", "blue"
	};
	
	public Box() {
		this(100,100);
	}
	
	public Box(int length, int height) {
		setAlignment(Pos.CENTER);
		
		setMinWidth(length);
		setMinHeight(height);
		
		BackgroundFill fill = new BackgroundFill(
				Color.web(colors[i++]), CornerRadii.EMPTY, Insets.EMPTY);
		setBackground(new Background(fill));
		
		if(colors.length == i) i=0;
	}
	
	public Box withText(String text) {
		Label label = new Label(text);
		label.setFont(new Font(28));
		getChildren().add(label);
		return this;
	}
	
}
