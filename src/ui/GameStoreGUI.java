package ui;
import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import model.Customer;
import model.Game;
import model.GameStore;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
import java.util.Arrays;

public class GameStoreGUI {
	
	private GameStore GameStore;
	@FXML 
	private ComboBox<String> listEstanterias;
	
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
        initializeTableViewGame();
    }

    @FXML
    void loadaddGame(ActionEvent event)throws Exception {
    	
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addGame.fxml"));
        fxmlLoader.setController(this);
        Parent form = fxmlLoader.load();
        pane.setCenter(form);
        loadShelfsId();
        
    }
    
   public void loadShelfsId(){
	   ObservableList<String> list = FXCollections.observableList(Arrays.asList(GameStore.getShelfs().getKeys()));
   	   listEstanterias.setItems(list);
   }
    
    @FXML
    void estanterias(ActionEvent event)throws Exception {
    	
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Estanterias.fxml"));
        fxmlLoader.setController(this);	
        Parent form = fxmlLoader.load();
        pane.setCenter(form);
    }
    
    @FXML
    void addEstanterias(ActionEvent event) throws Exception{
    	
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addEstanterias.fxml"));
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
    
    public ArrayList<String> wishListCustomer = new ArrayList<>();
    @FXML
    void addCustomerElement(ActionEvent event) throws Exception{
    	
    	String firstName = createCustomerFN.getText();
        String code = createCustomerCD.getText();
        String id = createCustomerID.getText();
	       
        if (firstName.isEmpty() || code.isEmpty() || id.isEmpty() ||wishListCustomer.size()==0) {
            
        	Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Error de validacion");
            alert.setHeaderText(null);
            alert.setContentText("Debes completar cada campo en el formulario");

            alert.showAndWait();
        } else {
        		if(wishListCustomer.size()>0 && wishListCustomer!=null) {
        			Customer customerToAdd = new Customer(id,firstName,Double.parseDouble(code),wishListCustomer);    	
        			GameStore.addCustomer(customerToAdd);
        			Alert alert = new Alert(AlertType.INFORMATION);
        			wishListCustomer.removeAll(wishListCustomer);
        			alert.setTitle("Cliente creado");
        			alert.setHeaderText(null);
        			alert.setContentText("Se ha creado el nuevo cliente");

        			alert.showAndWait();
        		
        	}else {
        		Alert alert = new Alert(AlertType.INFORMATION);
        		alert.setTitle("Error de validacion");
        		alert.setHeaderText(null);
        		alert.setContentText("Debes a?adir por lo menos un juego");
        		alert.showAndWait();
        	}
        }
    }
    
    @FXML
    public ArrayList<String> addGamesInWishListCustomer(ActionEvent event) throws Exception{
    	Game gameToAdd = TableGame.getSelectionModel().getSelectedItem();
    	if(gameToAdd!=null) {
    		wishListCustomer.add(TableGame.getSelectionModel().getSelectedItem().getId());
    		return wishListCustomer;
    	}else {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setTitle("Error de validacion");
    		alert.setHeaderText(null);
    		alert.setContentText("Debes a?adir por lo menos un juego");
    		alert.showAndWait();
    	}
    	return null;
    }

    
    
    //____________________addestanterias
    
    
    @FXML
    private TextField addEstanteriaE;

    @FXML
    void addEstanteriaElement(ActionEvent event)throws Exception{
    	
    	String estanteriaName = addEstanteriaE.getText();
       
        if (estanteriaName.isEmpty() ) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Error de validacion");
            alert.setHeaderText(null);
            alert.setContentText("Debes completar cada campo en el formulario");

            alert.showAndWait();
        } else {
        	GameStore.addShelf(estanteriaName);
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("juego creado");
            alert.setHeaderText(null);
            alert.setContentText("Se ha creado el nuevo juego");

            alert.showAndWait();
        }

    }//End addEstanteriaElement
    
    //______________________aad game
    @FXML
    private TextField addGameCD;
    
    @FXML
    private TextField addGameN;

    @FXML
    private TextField addGameP;
    
    @FXML
    void addGameElement(ActionEvent event) throws Exception{
    	
    	String gameName = addGameN.getText();
        double gamePrecio = Double.parseDouble(addGameP.getText());
        String gameCode = addGameCD.getText();
        String gameShelf = listEstanterias.getValue();
        //String gameEstanteria = listEstanterias.getText();
        
        if (gameName.isEmpty() || gamePrecio <= 0 || 
        	gameCode.isEmpty() || gameShelf == null) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Error de validacion");
            alert.setHeaderText(null);
            alert.setContentText("Debes completar cada campo en el formulario");
            alert.showAndWait();

        } else {
        	GameStore.getShelf(gameShelf).addGame(gameName, gamePrecio, Integer.parseInt(gameCode));
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("juego creado");
            alert.setHeaderText(null);
            alert.setContentText("Se ha creado el nuevo juego");
            alert.showAndWait();

        }//End else
    }//End addGameElement
    
    
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
    
   
     
    @FXML
    private TableView<Game> TableGame;

    @FXML
    private TableColumn<Game, String> coTableN;

    @FXML
    private TableColumn<Game, String> coTableP;

    @FXML
    private TableColumn<Game, String> coTableCD;
    
      @FXML
    private TableColumn<Game, String> coTableEs;
    
    
//  Table customers

    @FXML
    private void initializeTableViewGame() {
        ObservableList<Game> observableList;
        observableList = FXCollections.observableArrayList(GameStore.getGamesFromShelf());
        TableGame.setItems(observableList);

        coTableN.setCellValueFactory(new PropertyValueFactory<Game, String>("Nombre"));
        coTableP.setCellValueFactory(new PropertyValueFactory<Game, String>("Precio"));
        coTableCD.setCellValueFactory(new PropertyValueFactory<Game, String>("Codigo"));
        coTableEs.setCellValueFactory(new PropertyValueFactory<Game, String>("Estanteria"));
    }
    
    
    
    
    
    //_______________________________________________________________________________________________________
    
    
    
    

}

















