package framework.application;

import framework.components.XContainer;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ApplicationManager extends Application{
	
	static Stage stage;
	static XContainer container;
	static Scene scene;
	static GridPane grid;
	static FlowPane flowTop;
	static FlowPane flowBottom;
	static FlowPane flowLeft;
	static FlowPane flowRight;
	String title;
	
	int windowXsize, windowYsize;

	public static void main(String[] args){
		launch(args);
	}
	
	public void setGridComponent(Node node,int x, int y){
		Platform.runLater(new Runnable(){
			@Override
			public void run()
			{
				grid.add(node,x,y);				
			}			
		});		
	}
	
	public void setTopMenuComponent(Node node){
		
	}
	
	public void setBottomMenuComponent(Node node){
		Platform.runLater(new Runnable(){
			@Override
			public void run()
			{
				flowBottom.getChildren().addAll(node);				
			}			
		});				
	}
	
	public void setLeftMenuComponent(Node node){
		
	}
	
	public void setRightMenuComponent(Node node){
		
	}	

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		stage = primaryStage;	
		
		/* Menu Superior */
		flowTop = new FlowPane();
		flowTop.setPadding(new Insets(10, 10, 10, 10));
		flowTop.setStyle("-fx-background-color: DAE6F3;");
		flowTop.setHgap(1);
		flowTop.setMinSize(windowXsize-50, windowYsize/4);
		
		/* Menu Inferior */
		flowBottom = new FlowPane();
		flowBottom.setPadding(new Insets(10, 10, 10, 10));
		flowBottom.setStyle("-fx-background-color: DAE6F3;");
		flowBottom.setHgap(1);
		flowBottom.setMinSize(windowXsize-50, windowYsize/4);
		
		/* Menu Izquierdo */
		flowLeft = new FlowPane();
		flowLeft.setPadding(new Insets(10, 10, 10, 10));
		flowLeft.setStyle("-fx-background-color: DAE6F3;");
		flowLeft.setHgap(1);
		flowLeft.setMaxWidth(100);
		
		/* Menu Derecho */
		flowRight = new FlowPane();
		flowRight.setPadding(new Insets(10, 10, 10, 10));
		flowRight.setStyle("-fx-background-color: DAE6F3;");
		flowRight.setHgap(1);
		flowRight.setMaxWidth(100);
		
		/* Panel central */
		grid = new GridPane();
		grid.setPadding(new Insets(10,10,10,10));
		grid.setMinSize(windowXsize-50,windowYsize-50);
		grid.setVgap(2);
		grid.setHgap(2);
			
		/* Defino contenedor y seto los paneles */
		container = new XContainer();
		container.setMenuDerecho(flowRight);
		container.setMenuIzquierdo(flowLeft);
		container.setMenuInferior(flowBottom);
		container.setMenuSuperior(flowTop);
		container.setCuerpoVentana(grid);
		
		/* Generlo la escena */
		scene= new Scene(container,windowXsize,windowYsize);			
		
		primaryStage.setTitle(title);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public XContainer getContainer()
	{
		return container;
	}

	public void setContainer(XContainer container)
	{
		ApplicationManager.container=container;
	}

	public Scene getScene()
	{
		return scene;
	}

	public void setScene(Scene scene)
	{
		ApplicationManager.scene=scene;
	}

	public GridPane getGrid()
	{
		return grid;
	}

	public void setGrid(GridPane grid)
	{
		ApplicationManager.grid=grid;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title=title;		
	}

	public int getWindowXsize()
	{
		return windowXsize;
	}

	public void setWindowXsize(int windowXsize)
	{
		this.windowXsize=windowXsize;
	}

	public int getWindowYsize()
	{
		return windowYsize;
	}

	public void setWindowYsize(int windowYsize)
	{
		this.windowYsize=windowYsize;
	}	
		
}
