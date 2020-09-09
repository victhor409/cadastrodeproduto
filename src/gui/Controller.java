package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class Controller implements Initializable {
	
	@FXML
	private MenuItem menuItemProduto;
	
	@FXML
	private MenuItem menuItemDelete;
	
	@FXML
	private MenuItem menuItemAbout;
	
	
	@FXML
	public void onMenuItemProduto() {
		System.out.println("onMenuItemProduto");
	}
	
	@FXML
	public void onMenuDelete() {
		System.out.println("onMenuDelete");
	}
	
	@FXML
	public void onMenuItemAbout() {
		System.out.println("onMenuAbout");
	}

	@Override
	public void initialize(URL ur, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}
	
	

}
