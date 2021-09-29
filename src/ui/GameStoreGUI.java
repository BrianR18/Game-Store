package ui;
import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import model.GameStore;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class GameStoreGUI {
	
	private GameStore GameStore;

    public GameStoreGUI(GameStore controller) {
    	GameStore = controller;
    }
	
    @FXML
    private BorderPane pane;
    
    

    @FXML
    void loadWelcome(ActionEvent event) throws Exception {
    	
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Main.fxml"));
        fxmlLoader.setController(this);
        Parent mainWindow = fxmlLoader.load();
        pane.setCenter(mainWindow);

    }
    
    @FXML
    void loadCustomer(ActionEvent event) throws Exception{
    	
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ListCustomer.fxml"));
        fxmlLoader.setController(this);
        Parent form = fxmlLoader.load();
        pane.setCenter(form);

    }
    

    @FXML
    void LoadAddCustomer(ActionEvent event) throws Exception{
    	
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CustomerAddElement.fxml"));
        fxmlLoader.setController(this);
        Parent form = fxmlLoader.load();
        pane.setCenter(form);

    }
    
    
    
    
    
    @FXML
    void LIstGame(ActionEvent event)throws Exception {
    	
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("list_game.fxml"));
        fxmlLoader.setController(this);
        Parent form = fxmlLoader.load();
        pane.setCenter(form);

    }
    
    
    
    @FXML
    void loadaddGame(ActionEvent event)throws Exception {
    	
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addGame.fxml"));
        fxmlLoader.setController(this);
        Parent form = fxmlLoader.load();
        pane.setCenter(form);

    }
    
    @FXML
    void estanterias(ActionEvent event)throws Exception {
    	
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Estanterias.fxml"));
        fxmlLoader.setController(this);
        Parent form = fxmlLoader.load();
        pane.setCenter(form);
        
    }
    
    
//add Customer ________________________
    
    @FXML
    private TextField createCustomerID;

    @FXML
    private TextField createCustomerCD;

    @FXML
    private TextField createCustomerFN;
    
    @FXML
    void addCustomerElement(ActionEvent event) throws Exception{
    	
    	String firstName = createCustomerFN.getText();
        String code = createCustomerCD.getText();
        String id = createCustomerID.getText();
        
        if (firstName.isEmpty() || code.isEmpty() || id.isEmpty()) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Error de validacion");
            alert.setHeaderText(null);
            alert.setContentText("Debes completar cada campo en el formulario");

            alert.showAndWait();
        } else {
           // GameStore.addCustomers(firstName,code, id);
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Cliente creado");
            alert.setHeaderText(null);
            alert.setContentText("Se ha creado el nuevo cliente");

            alert.showAndWait();
        }
    }
    
    //______________________aad game
    @FXML
    private TextField addGameCD;
    
    @FXML
    private TextField addGameN;

    @FXML
    private TextField addGameRW;

    @FXML
    private TextField addGameP;
    
    @FXML
    void addGameElement(ActionEvent event) throws Exception{
    	
    	String gameName = addGameN.getText();
        String gameRewiew = addGameRW.getText();
        String gamePrecio = addGameP.getText();
        String gameCode = addGameCD.getText();
        
        if (gameName.isEmpty() || gameRewiew.isEmpty() || gamePrecio.isEmpty() || gameCode.isEmpty()) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Error de validacion");
            alert.setHeaderText(null);
            alert.setContentText("Debes completar cada campo en el formulario");

            alert.showAndWait();
        } else {
           // GameStore.addCustomers(firstName,code, id);
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("juego creado");
            alert.setHeaderText(null);
            alert.setContentText("Se ha creado el nuevo juego");

            alert.showAndWait();
        }

    }
    
    
    //___________tablet customer_________
    
   /* @FXML
    private TableView<Customer> tableCustomers;

    @FXML
    private TableColumn<Customer, String> colCustomerFN;

    @FXML
    private TableColumn<Customer, String> colCustomerCD;

    @FXML
    private TableColumn<Customer, String> colCustomerID;

    @FXML
    private TableColumn<Customer, String> colCustomerLG;

    // Table customers

    @FXML
    private void initializeTableViewCustomers() {
        ObservableList<Customer> observableList;
        observableList = FXCollections.observableArrayList(GameStore.getCustomers());
        tableCustomers.setItems(observableList);

        colCustomerFN.setCellValueFactory(new PropertyValueFactory<Customer, String>("Nombre "));
        colCustomerCD.setCellValueFactory(new PropertyValueFactory<Customer, String>("code"));
        colCustomerID.setCellValueFactory(new PropertyValueFactory<Customer, String>("id"));
        colCustomerLG.setCellValueFactory(new PropertyValueFactory<Customer, String>("Juegos obtenidos"));
      
    }*/
    
  //___________tablet game_________
    
   /* @FXML
    private TableView<Game> TableGame;

    @FXML
    private TableColumn<Game, String> coTableN;

    @FXML
    private TableColumn<Game, String> coTableP;

    @FXML
    private TableColumn<Game, String> coTableR;

    @FXML
    private TableColumn<Game, String> coTableCD;
    
    
 // Table customers

    @FXML
    private void initializeTableViewGame() {
        ObservableList<Game> observableList;
        observableList = FXCollections.observableArrayList(GameStore.getGame());
        tableGame.setItems(observableList);

        coTableN.setCellValueFactory(new PropertyValueFactory<Game, String>("Nombre "));
        coTableP.setCellValueFactory(new PropertyValueFactory<Game, String>("Precio"));
        coTableR.setCellValueFactory(new PropertyValueFactory<Game, String>("Rewiew"));
        coTableCD.setCellValueFactory(new PropertyValueFactory<Game, String>("Codigo"));
      
    }*/
    

}
















