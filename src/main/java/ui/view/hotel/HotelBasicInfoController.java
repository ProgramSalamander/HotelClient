package ui.view.hotel;

import java.net.URL;
import java.rmi.RemoteException;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextArea;
import objects.ResultMessage;
import rmi.RemoteHelper;
import ui.util.AlertUtil;
import ui.view.Main;
import vo.HotelVO;

public class HotelBasicInfoController implements Initializable {
	private Main main;
	private HotelVO currenthotelvo;
	private HotelOverviewController overviewController;
	RemoteHelper helper=RemoteHelper.getInstance();
	
	@FXML
	private TextArea addressTextField;
	
	@FXML
	private TextArea business_adressTextField;
	
	@FXML
	private TextArea introductionTextField;
	
	@FXML
	private TextArea serviceTextField;
	
	@FXML
	private TextArea starTextField;
	
	
	@FXML
	private void save() throws RemoteException{
		currenthotelvo.setaddress(addressTextField.getText());
		currenthotelvo.setbussiness_address(business_adressTextField.getText());
		currenthotelvo.setintroduction(introductionTextField.getText());
		currenthotelvo.setservice(serviceTextField.getText());
		currenthotelvo.setstar(starTextField.getText());
		ResultMessage result=helper.getHotelBLService().hotel_updateInfo(currenthotelvo);
		if(result==ResultMessage.Success){
			//同步更新主界面的label
			overviewController.updateHotelVO(currenthotelvo);
			AlertUtil.showInformationAlert("更新酒店基本信息成功！");
		}
		else{
			AlertUtil.showErrorAlert("对不起，更新失败。");
		}
	}
	
	public HotelBasicInfoController() {
	
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		

	}

	public void setMain(Main main,HotelVO hotelvo,HotelOverviewController overviewController) {
		this.main = main;
		currenthotelvo=hotelvo;
		this.overviewController = overviewController;
		addressTextField.setText(hotelvo.getaddress());
		business_adressTextField.setText(hotelvo.getbussiness_address());
		introductionTextField.setText(hotelvo.getintroduction());
		serviceTextField.setText(hotelvo.getservice());
		starTextField.setText(hotelvo.getstar());
	}
}
