package layout;


import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*Simple layout setup...*/

public class AppLayout extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent main = null;
		
		main = new TestAnchorPane();
		main = new TestBorderPane();
		main = new TestFlowPane();
		main = new TestGridPane();
		main = new TestStackPane();
		main = new TestTilePane();
		
		Scene scene = new Scene(main, 800, 600);

		primaryStage.setScene(scene);
		primaryStage.setTitle("Layout Manager");
		primaryStage.show();
		
		/* FIRST EXAMPLES: 
		VBox test = new VBox();
		
		test.getChildren().add(new Box().withText("Box 1"));
		test.getChildren().add(new Box().withText("Box 2"));
		test.getChildren().add(new Box().withText("Box 3"));
		test.getChildren().add(new Box().withText("Box 4"));
		test.getChildren().add(new Box().withText("Box 5"));
		test.getChildren().add(new Box().withText("Box 6"));
		test.getChildren().add(new Box().withText("Box 7"));
		*/
		/*
		test.getChildren().add(new Square());
		test.getChildren().add(new Square());
		test.getChildren().add(new Square());
		test.getChildren().add(new Square());
		test.getChildren().add(new Square());
		test.getChildren().add(new Square());
		test.getChildren().add(new Square());
		
		Scene main = new Scene(test);
		primaryStage.setScene(main);
		*/
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
