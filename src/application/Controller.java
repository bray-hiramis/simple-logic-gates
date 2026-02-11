package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

	@FXML
	private CheckBox andSwitch1, andSwitch2, orSwitch1, orSwitch2, notSwitch;
	
	@FXML
	private ImageView imgAndLight, imgOrLight, imgNotLight;
	
	private Image lightsOn = new Image(getClass().getResourceAsStream("/resources/lightsON.png"));
	private Image lightsOff = new Image(getClass().getResourceAsStream("/resources/LightsOFF.png"));
	
	public void andGate(ActionEvent event) {
		
		if (andSwitch1.isSelected() && andSwitch2.isSelected()) {
			imgAndLight.setImage(lightsOn);
		} else if (andSwitch1.isSelected() && !andSwitch2.isSelected()) {
			imgAndLight.setImage(lightsOff);
		} else if (!andSwitch1.isSelected() && andSwitch2.isSelected()) {
			imgAndLight.setImage(lightsOff);
		} else {
			imgAndLight.setImage(lightsOff);
		}
		
	}
	
	public void orGate(ActionEvent event) {
		
		if (orSwitch1.isSelected() || orSwitch2.isSelected()) {
			imgOrLight.setImage(lightsOn);
		} else {
			imgOrLight.setImage(lightsOff);
		}

	}
	
	public void notGate(ActionEvent event) {
		
		if (notSwitch.isSelected()) {
			imgNotLight.setImage(lightsOff);
		} else {
			imgNotLight.setImage(lightsOn);
		}
		
	}
	
}
