package layout;

import javafx.application.Platform;
import javafx.scene.layout.StackPane;

public class TestStackPane extends StackPane{
	
	
	public TestStackPane() {
		
		Box b1 = new Box().withText("1");
		Box b2 = new Box().withText("2");
		Box b3 = new Box().withText("3");
		Box b4 = new Box().withText("4");
		Box b5 = new Box().withText("5");
		Box b6 = new Box().withText("6");
		
		getChildren().addAll(b1, b2, b3, b4, b5, b6);
		
		setOnMouseClicked(e -> {
			if(e.getSceneX() > getScene().getWidth() / 2)
				getChildren().get(0).toFront();
			else
				getChildren().get(5).toBack();
		});
		
		/*To run threads we have to use a FX application thread. 
		 * Using Plataform.runLater as anonymous function*/
		Thread t = new Thread(() -> {
			while(true) {
				try {
					Thread.sleep(2000);
					Platform.runLater(() -> {
						getChildren().get(0).toFront();
					});
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
			}
		});
		
		t.setDaemon(true);
		t.start();
	}
}
