package framework.application;

import javafx.application.Application;
import javafx.stage.Stage;

public class ApplicationManager extends Application
{
	ApplicationListener listener;	
	
	public ApplicationManager(ApplicationListener listener)	{
		
		this.listener=listener;
	}
	
	public <T> void addForm(T clazz){
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		// TODO Auto-generated method stub
		
	}
	
}
