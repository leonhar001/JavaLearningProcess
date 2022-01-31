package basic;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*Simple logics, the main objective is stylization in this class...
 * Using CSS file...*/
public class Counter extends Application{

	private int counter = 0;
	
	private String exFontLink = "https://fonts.googleapis.com/css2?family=Architects+Daughter";
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		VBox mainBox = new VBox();
		/*Set the class name used in css file...*/
		mainBox.getStyleClass().add("content");
		
		Label labelTitle = new Label("Counter");
		labelTitle.getStyleClass().add("textTitle");
		
		Label labelNumber = new Label("0");
		labelNumber.getStyleClass().add("textCounter");
		
		HBox buttonBox = new HBox();
		
		Button buttonAdd = new Button("+");
		buttonAdd.setOnAction(e -> {
			counter++;
			labelNumber.setText(
					Integer.toString(counter));
			
			changeColor(labelNumber);
		});
		buttonAdd.getStyleClass().add("buttons");
		
		Button buttonRem = new Button("-");
		buttonRem.setOnAction(e -> {
			counter--;
			
			labelNumber.setText(Integer.toString(counter));
			
			changeColor(labelNumber);
		});
		buttonRem.getStyleClass().add("buttons");
		
		buttonBox.setAlignment(Pos.CENTER);
		buttonBox.setSpacing(10);
		buttonBox.getChildren()
			.addAll(buttonAdd, buttonRem);
		
		mainBox.setAlignment(Pos.CENTER);
		mainBox.setSpacing(10);
		mainBox.getChildren()
			.addAll(labelTitle, labelNumber, buttonBox);
		
		String cssPath = getClass().getResource("/basic/counter.css").toExternalForm();
		
		Scene scene = new Scene(mainBox, 200, 200);
		/*CSS means Cascading Style Sheets*/
		scene.getStylesheets()
			.addAll(cssPath, exFontLink);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void changeColor (Label label) {
		label.getStyleClass().clear();
		
		if(counter > 0) {
			label.getStyleClass().add("setGreen");
			return;
		}
		if(counter < 0) {
			label.getStyleClass().add("setRed");
			return;
		}
		
		label.getStyleClass().add("textCounter");
	}
	
}
