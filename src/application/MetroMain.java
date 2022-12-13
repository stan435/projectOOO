package application;
	
import controller.MetroTicketViewController;
import javafx.application.Application;
import javafx.stage.Stage;
import jxl.read.biff.BiffException;
import model.MetroFacade;
import model.database.LoadSaveStrategies.LoadSaveStrategy;
import model.database.LoadSaveStrategies.LoadSaveStrategyFactory;
import view.AdminView;
import view.MetroStationView;
import view.MetroTicketView;

import java.io.IOException;


public class MetroMain extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException, BiffException {
		MetroFacade metroFacade = new MetroFacade();
		AdminView adminView = new AdminView(metroFacade);
		MetroTicketView metroTicketView = new MetroTicketView();
		MetroTicketViewController metroTicketViewController = new MetroTicketViewController(metroFacade,metroTicketView);
		MetroStationView metroStationView = new MetroStationView();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
