package framework.application;

import framework.components.XContainer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ApplicationManager extends Application{
	
		Scene scene;
		
		public static void main(String[] args){
			launch(args);
		}

		@Override
		public void start(Stage primaryStage) throws Exception
		{
			GridPane grid=new GridPane();
			grid.setPadding(new Insets(10,10,10,10));
			grid.setMinSize(300,300);
			grid.setVgap(5);
			grid.setHgap(5);

			Text username=new Text("Username:");
			grid.add(username,0,0);

			TextField text=new TextField();
			text.setPrefColumnCount(10);
			grid.add(text,1,0);

			Text password=new Text("Password:");
			grid.add(password,0,1);

			TextField text2=new TextField();
			text2.setPrefColumnCount(10);
			grid.add(text2,1,1);
			grid.setStyle("-fx-background-color: #D8BFD8;");
			/*
			 * */

			Button btn=new Button();
			btn.setText("Cambiar Root");
			btn.setOnAction(new EventHandler<ActionEvent>()
			{
				@Override
				public void handle(ActionEvent event)
				{
					StackPane root=new StackPane();
					root.getChildren().add(btn);
					Scene scene2=new Scene(root,300,250);
					primaryStage.setScene(scene2);
					primaryStage.show();
				}
			});		
			
			AnchorPane menuInferior = new AnchorPane();
			menuInferior.setStyle("-fx-background-color: #A9A9A9;");		
			menuInferior.getChildren().addAll(btn);
			menuInferior.setMinSize(300, 100);
			AnchorPane.setRightAnchor(btn, 10.0);		
	//
//			Scene scene=new Scene(grid,300,250);

			XContainer container = new XContainer();
			container.setCuerpoVentana(grid);
			container.setMenuInferior(menuInferior);
							
			Scene scene= new Scene(container,400,400);
			
			primaryStage.setTitle("Hello World!");
			primaryStage.setScene(scene);
			primaryStage.show();
		}	
}
