package framework.application;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import framework.annotations.Control;
import framework.annotations.Form;
import framework.annotations.ButtonSubmit;
import framework.components.XContainer;
import framework.components.XLabel;
import framework.components.XPasswordField;
import framework.components.XTextField;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FrameworkApp
{	
	ApplicationManager app;
	List<XContainer> listForms = new ArrayList<XContainer>();
	
	public void init(String title){
		app = new ApplicationManager();
		app.setTitle(title);
	}
	
	public void lunchApp(String[] args){
		Thread thread = new Thread(){
			public void run(){
				app.main(args);
			}
		};
		thread.start();
	}
	
	public void addForm(Class<?> clazz) throws NoSuchMethodException, SecurityException {		

//		XContainer container = new XContainer();	
//		GridPane grid = new GridPane();
//		FlowPane flowTop = new FlowPane();
//		FlowPane flowBottom = new FlowPane();
//		FlowPane flowLeft = new FlowPane();
//		FlowPane flowRight = new FlowPane();
		
		
		/**
		 *  Proceso annotations de los atributos 
		 *  */				
		final Field[] atributos = clazz.getDeclaredFields();
		
		for(Field atributo : atributos){			
			Annotation[] annotationArray = atributo.getAnnotations();
			
			for(Annotation annotation : annotationArray){
				
				if(annotation != null && annotation instanceof Control){
					Control control = ((Control)annotation);
					System.out.println("Valores: "+control.label()+" | "+control.tipoClase().getName());
					if(control.tipoClase().equals(XTextField.class)){
						Text textField=new Text(control.label());					

						TextField text=new TextField();
						text.setPrefColumnCount(10);
						
						app.setGridComponent(textField,control.xPosition(),control.yPosition());
						app.setGridComponent(text,control.xPosition()+1,control.yPosition());
					}else if(control.tipoClase().equals(XPasswordField.class)){
						Text textField=new Text(control.label());					

						TextField text=new TextField();
						text.setPrefColumnCount(10);
						
						app.setGridComponent(textField,control.xPosition(),control.yPosition());
						app.setGridComponent(text,control.xPosition()+1,control.yPosition());					
					}else if(control.tipoClase().equals(XLabel.class)){
						Label label = new Label(control.label());
						label.setStyle("-fx-font: 18px Serif;");
						app.setGridComponent(label,control.xPosition(),control.yPosition());
					}
				}else if(annotation != null && annotation instanceof ButtonSubmit){
					System.out.println("Valores: "+((ButtonSubmit)annotation).name());
					Button boton = new Button();
					boton.setText(((ButtonSubmit)annotation).name());
					
					final Method buttonMethod = clazz.getMethod(((ButtonSubmit)annotation).action(),this.getClass());
					
					boton.setOnAction(new EventHandler<ActionEvent>(){
						@Override
						public void handle(ActionEvent event)
						{
							System.out.println("Ejecuto boton "+((ButtonSubmit)annotation).name());
							
//							buttonMethod.invoke(clazz.newInstance(),new Object[]{ this });
						}					
					});
					app.setBottomMenuComponent(boton);
				}				
			}
		}
		
		/**
		 *  Proceso annotations de la Clase 
		 *  */
		final Annotation[] classAnnotations = clazz.getDeclaredAnnotations();
		
		for(Annotation classAnnotation : classAnnotations){
			if(classAnnotation instanceof Form){
				Form form = (Form)classAnnotation;
				app.setTitle(form.title());				
			}
		}
		
		app.setIsInitialized(true);
		
//		listForms.add(container);
	}
	
	

	public void setFrameSize(int ancho, int alto)
	{
		app.setWindowXsize(ancho);
		app.setWindowYsize(alto);
		
	}
	
	public void changeTitle(String title){
		app.setTitle(title);
		
	}
}
