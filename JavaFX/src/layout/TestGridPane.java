package layout;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class TestGridPane extends GridPane{
	
	public TestGridPane() {

		Box box1 = new Box().withText("ONE");
		Box box2 = new Box().withText("TWO");
		Box box3 = new Box().withText("THREE");
		Box box4 = new Box().withText("FOUR");
		Box box5 = new Box().withText("FIVE");
		Box box6 = new Box().withText("SIX");
		
		setGridLinesVisible(true);
		
		getColumnConstraints().addAll(cc(), cc(), cc(), cc(), cc(), cc());
		getRowConstraints().addAll(rc(), rc(), rc(), rc(), rc(), rc());
		
		setVgap(15);
		setHgap(15);
		
		add(box1, 0, 0, 2, 1);
		add(box2, 1, 1, 1, 2);
		add(box3, 2, 2, 1, 2);
		add(box4, 3, 3, 1, 2);
		add(box5, 4, 4, 1, 2);
		add(box6, 5, 5);
		
	}
	
	private ColumnConstraints cc() {
		ColumnConstraints cc = new ColumnConstraints();
		cc.setPercentWidth(30);
		cc.setFillWidth(true);
		return cc;
	}
	
	
	private RowConstraints rc() {
		RowConstraints rc = new RowConstraints();
		rc.setPercentHeight(30);
		rc.setFillHeight(true);
		return rc;
	}
}
