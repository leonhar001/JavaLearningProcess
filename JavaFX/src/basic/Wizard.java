package basic;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizard extends Application{
	
	private Stage stage;
	private Scene scene1;
	private Scene scene2;
	private Scene scene3;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		stage = primaryStage;
		
		setScene1();
		setScene2();
		setScene3();
		
		primaryStage.setScene(scene1);
		primaryStage.setTitle("Wizard :: Scene 1");
		primaryStage.show();
	}

	private void setScene1() {
		
		Button nextScene = new Button("Next scene...");
		nextScene.setOnAction(e -> {
			stage.setScene(scene2);
			stage.setTitle("Wizard :: Scene 2");
		});
		
		HBox box = new HBox();
		box.getChildren().addAll(nextScene);
		box.setAlignment(Pos.CENTER);
		
		scene1 = new Scene(box, 400, 400);
		
	}
	
	private void setScene2() {
		
		Button nextScene = new Button("Next scene...");
		nextScene.setOnAction(e -> {
			stage.setScene(scene3);
			stage.setTitle("Wizard :: Scene 3");
		});
		
		
		Button previousScene = new Button("Previous scene...");
		previousScene.setOnAction(e -> {
			stage.setScene(scene1);
			stage.setTitle("Wizard :: Scene 1");
		});
		
		HBox box = new HBox();
		box.getChildren().addAll(nextScene, previousScene);
		box.setAlignment(Pos.CENTER);
		
		scene2 = new Scene(box, 400, 400);
		
	}
	
	private void setScene3() {
		
		Button previousScene = new Button("Previous scene...");
		previousScene.setOnAction(e -> {
			stage.setScene(scene2);
			stage.setTitle("Wizard :: Scene 2");
		});
		
		HBox box = new HBox();
		box.getChildren().addAll(previousScene);
		box.setAlignment(Pos.CENTER);
		
		scene3 = new Scene(box, 400, 400);
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
