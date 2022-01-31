module exerciciosfx {

	requires javafx.controls;
	requires org.controlsfx.controls;
	
	opens basic;
	opens layout;
	
	/*For FXML:*/
	opens fxml;
	requires javafx.fxml;
}