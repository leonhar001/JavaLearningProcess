package basic;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FirstFX extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		Button buttonA = new Button("A");
		Button buttonB = new Button("B");
		Button buttonC = new Button("C");
		
		Button buttonD = new Button("D");
		Button buttonE = new Button("E");
		
		buttonA.setOnAction(e -> {
			System.out.println("AAH");
		});
		
		/*Buttons actions*/
		buttonB.setOnAction(e -> {
			System.exit(0);
		});
		buttonC.setOnAction(e ->{
			System.out.println("CCH");
		});
		
		
		/*VERTICAL BOX*/
		VBox boxV = new VBox();
		
		/*HORIZONTAL BOX*/
		HBox boxH = new HBox();
		
		/*Buttons configuration*/
		boxV.setSpacing(15);
		boxV.setAlignment(Pos.CENTER);
		boxV.getChildren().add(buttonA);
		boxV.getChildren().add(buttonB);		
		boxV.getChildren().add(buttonC);
		
		boxH.setSpacing(5);
		boxH.setAlignment(Pos.CENTER);
		boxH.getChildren().add(buttonD);
		boxH.getChildren().add(buttonE);		
		
		Scene scene1 = new Scene(boxV, 300, 300);
		SubScene scene2 = new SubScene(boxH, 100, 50);
		boxV.getChildren().add(scene2);
		
		primaryStage.setScene(scene1);
		primaryStage.show();
	}
	
	/*OBS: O método main é opcional em um projeto
	 * de javaFX, pois o método de entrada é o
	 * método start...*/
	public static void main(String[] args) {
		launch(args);
	}

}
