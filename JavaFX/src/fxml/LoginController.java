package fxml;


import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
	
	@FXML
	private TextField loginField;
	@FXML
	private PasswordField passwordField;
	
	public void enter() {
		boolean validEmail = loginField.getText().equals("teste@gmail.com");
		boolean validPass = passwordField.getText().equals("123");
		
		if(validEmail && validPass)
			Notifications.create()
				.position(Pos.TOP_CENTER)
				.title("Login FXML")
				.text("Valid Login")
				.showInformation();
		else
			Notifications.create()
				.position(Pos.TOP_CENTER)
				.title("Login FXML")
				.text("Invalid login")
				.showError();
	}
}
