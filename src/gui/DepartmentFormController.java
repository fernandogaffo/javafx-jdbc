package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DepartmentFormController implements Initializable {

	@FXML
	private TextField txtId;

	@FXML
	private TextField txtNome;

	@FXML
	private Label lblErrorNome;

	@FXML
	private Button btnSalvar;

	@FXML
	private Button btnCancelar;

	@FXML
	public void onBtnSalvarAction() {

	}

	@FXML
	public void onBtnCancelarAction() {

	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
	}

	private void initializeNodes() {
		Constraints.setTextFieldInteger(txtId);
		Constraints.setTextFieldMaxLength(txtNome, 30);
	}
}
